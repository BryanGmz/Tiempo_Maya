/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.gui.perfil.editar_perfil;

import calendariomaya.backend.modelos.Mensaje;
import calendariomaya.gui.perfil.PerfilActual;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author bryangmz
 */
public class ComprobacionesEditarPerfil {
    
    private static ComprobacionesEditarPerfil instancia;
    
    private ComprobacionesEditarPerfil(){}
    
    public static ComprobacionesEditarPerfil getInstancia(){
        if (instancia == null) {
            instancia = new ComprobacionesEditarPerfil();
        }   return instancia;
    }
    
    public boolean validarCampos(JTextField txtNombre, JTextField txtApellido, JTextField txtUsuario, JTextField txtCorreoElectronico, JPasswordField txtPassword, JPasswordField txtConfirmPassword, 
            JLabel lblObligatorios){
        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtUsuario.getText().isEmpty() 
                || txtCorreoElectronico.getText().isEmpty() || txtPassword.getText().isEmpty() || txtConfirmPassword.getText().isEmpty()) {
            lblObligatorios.setVisible(true);
            return comprobarPassword(txtPassword, txtConfirmPassword);
        }   return comprobarPassword(txtPassword, txtConfirmPassword);
    }
    
    public boolean comprobarPassword(JPasswordField txtPassword, JPasswordField txtConfirmPassword){
        if (txtPassword.getText().length() < 8){
            Mensaje.getInstancia().advertencia("Las contraseña debe tener minimo 8 carcateres");
            return false;
        } else if (!txtPassword.getText().equals(txtConfirmPassword.getText())){
            Mensaje.getInstancia().advertencia("Las contraseñas no coinciden");
            return false;
        }   return true;
    }
    
    public void limpiarCampos(JTextField txtNombre, JTextField txtApellido, JTextField txtUsuario, JTextField txtCorreoElectronico, JPasswordField txtPassword, JPasswordField txtConfirmPassword, 
            JLabel lblObligatorios, JTextField txTel, JDateChooser dateChoser){
        txtNombre.setText("");
        txtApellido.setText("");
        txtCorreoElectronico.setText("");
        txtUsuario.setText("");
        txtConfirmPassword.setText("");
        txtPassword.setText("");
        txTel.setText("");
        dateChoser.setDate(null);
    }
    
    public void llenarCampos(JTextField txtNombre, JTextField txtApellido, JTextField txtUsuario, JTextField txtCorreoElectronico, JPasswordField txtPassword, JPasswordField txtConfirmPassword, 
            JLabel lblObligatorios, JTextField txTel, JDateChooser dateChoser){
        txtNombre.setText(PerfilActual.getPerfilActual().getUsuario().getNombre());
        txtApellido.setText(PerfilActual.getPerfilActual().getUsuario().getApellido());
        txtCorreoElectronico.setText(PerfilActual.getPerfilActual().getUsuario().getEmail());
        txtUsuario.setText(PerfilActual.getPerfilActual().getUsuario().getUsername());
        txtConfirmPassword.setText(PerfilActual.getPerfilActual().getUsuario().getPassword());
        txtPassword.setText(PerfilActual.getPerfilActual().getUsuario().getPassword());
        if (PerfilActual.getPerfilActual().getUsuario().getTelefono() != null) {
            txTel.setText(PerfilActual.getPerfilActual().getUsuario().getTelefono());
        }
        if (PerfilActual.getPerfilActual().getUsuario().getNacimiento() != null) {
            dateChoser.setDate(PerfilActual.getPerfilActual().getUsuario().getNacimiento());
        }
    }
    
}
