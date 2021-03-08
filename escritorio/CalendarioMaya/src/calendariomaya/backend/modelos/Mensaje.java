/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.backend.modelos;

import javax.swing.JOptionPane;

/**
 *
 * @author jose_
 */
public class Mensaje {
 
    private static Mensaje mensaje;
    
    private Mensaje(){}
    
    public static Mensaje getInstancia(){
        if (mensaje == null) {
            mensaje = new Mensaje();
        } return mensaje;
    }
    
    public void advertencia(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    
    public void informacion(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void error(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
