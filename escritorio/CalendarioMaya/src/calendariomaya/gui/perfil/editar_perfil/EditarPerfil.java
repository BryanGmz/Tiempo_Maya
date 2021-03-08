/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.gui.perfil.editar_perfil;

import calendariomaya.backend.modelos.Mensaje;
import calendariomaya.backend.modelos.UsuarioDb;
import calendariomaya.backend.objetos.Usuario;
import calendariomaya.gui.perfil.Perfil;
import calendariomaya.gui.perfil.PerfilActual;
import calendariomaya.source.TextPrompt;
import java.awt.Color;
import java.awt.Frame;
import java.sql.Date;
import javax.swing.JTextField;

/**
 *
 * @author bryangmz
 */
public class EditarPerfil extends javax.swing.JDialog {
    private static EditarPerfil instancia;
    private Frame frame;
    /**
     * Creates new form InicioSesion
     */
    private EditarPerfil(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.frame = parent;
        this.setLocationRelativeTo(null);
    }

    public static EditarPerfil getInstancia(Frame frame){
        if (instancia == null) {
            instancia = new EditarPerfil(frame, true);
        } return instancia;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTransparente = new javax.swing.JPanel();
        lblResgistrarse = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblConfirmPassword = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        txTel = new javax.swing.JTextField();
        lblFechaNacimiento = new javax.swing.JLabel();
        dateChoser = new com.toedter.calendar.JDateChooser();
        lblObligatorios = new javax.swing.JLabel();
        lblErrorPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        lblImgInicioSesion = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTransparente.setBackground(new Color(255, 255, 255, 135));

        lblResgistrarse.setBackground(new java.awt.Color(102, 102, 102));
        lblResgistrarse.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblResgistrarse.setForeground(new java.awt.Color(51, 51, 51));
        lblResgistrarse.setText("Editar Perfil");

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        txtCorreoElectronico.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCorreoElectronico.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setText("Nombre*");

        lblEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblEmail.setText("Correo Electronico*");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("© 2021 Form Calendario Maya.  Todos los derechos reservados.");

        btnEditar.setBackground(new java.awt.Color(153, 153, 153));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(102, 102, 102));
        btnEditar.setText("Editar");
        btnEditar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lblApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblApellido.setText("Apellido*");

        txtApellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtApellido.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblPassword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPassword.setText("Contraseña*");

        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario*");

        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblConfirmPassword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblConfirmPassword.setText("Confirmar Contraseña*");

        lblTel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTel.setText("Tel.");

        txTel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txTel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txTelKeyTyped(evt);
            }
        });

        lblFechaNacimiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFechaNacimiento.setText("Fecha de Nacimiento");

        lblObligatorios.setForeground(new java.awt.Color(255, 0, 51));
        lblObligatorios.setText("Todos los campos con * son obligatorios");

        lblErrorPassword.setForeground(new java.awt.Color(255, 0, 51));
        lblErrorPassword.setText("Las contraseña no coinciden, minimo 8 carcateres");

        txtPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        txtConfirmPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtConfirmPassword.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout panelTransparenteLayout = new javax.swing.GroupLayout(panelTransparente);
        panelTransparente.setLayout(panelTransparenteLayout);
        panelTransparenteLayout.setHorizontalGroup(
            panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparenteLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblConfirmPassword)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addComponent(lblPassword)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addComponent(lblEmail)
                    .addComponent(lblNombre)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addGroup(panelTransparenteLayout.createSequentialGroup()
                        .addComponent(lblTel)
                        .addGap(180, 180, 180)
                        .addComponent(lblFechaNacimiento))
                    .addGroup(panelTransparenteLayout.createSequentialGroup()
                        .addComponent(txTel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dateChoser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtPassword)
                    .addComponent(txtConfirmPassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransparenteLayout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addGroup(panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransparenteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransparenteLayout.createSequentialGroup()
                        .addComponent(lblResgistrarse)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransparenteLayout.createSequentialGroup()
                        .addGroup(panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblObligatorios)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(147, 147, 147))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransparenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblErrorPassword)
                .addGap(110, 110, 110))
        );
        panelTransparenteLayout.setVerticalGroup(
            panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparenteLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblResgistrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword)
                .addGap(5, 5, 5)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblConfirmPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(lblFechaNacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateChoser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txTel, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObligatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );

        getContentPane().add(panelTransparente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 590, 670));

        lblImgInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendariomaya/img/InicioSesion.jpeg"))); // NOI18N
        getContentPane().add(lblImgInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTelKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if (value <'0' || value >'9') evt.consume();
    }//GEN-LAST:event_txTelKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        if (ComprobacionesEditarPerfil.getInstancia().validarCampos(txtNombre, txtApellido, txtUsuario, txtCorreoElectronico, txtPassword, txtConfirmPassword, lblObligatorios) && 
                ComprobacionesEditarPerfil.getInstancia().comprobarPassword(txtPassword, txtConfirmPassword) && 
                validarExistencia()) {
            String nombreUsuarioAnterior = PerfilActual.getPerfilActual().getNomreUsuario();
            Usuario usuario = new Usuario();
            usuario.setUsername(txtUsuario.getText());
            usuario.setNombre(txtNombre.getText());
            usuario.setApellido(txtApellido.getText());
            usuario.setEmail(txtCorreoElectronico.getText());
            usuario.setPassword(txtPassword.getText());
            usuario.setTelefono(txTel.getText());
            usuario.setRol(PerfilActual.getPerfilActual().getUsuario().getRol());
            if (dateChoser.getDate() != null) {
                java.sql.Date sqlDate = new java.sql.Date(dateChoser.getDate().getTime());
                usuario.setNacimiento(sqlDate);
            }
            if (UsuarioDb.getInstancia().actualizarUsuario(usuario, nombreUsuarioAnterior)) {
                PerfilActual.getPerfilActual().setSesion(usuario);
                this.setVisible(false);
                Perfil.getInstancia(frame).mostrarPerfil();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed
    
    public boolean validarExistencia(){
        Usuario busqueda = new Usuario();
        busqueda.setUsername(txtUsuario.getText());
        if (UsuarioDb.getInstancia().leerUsuario(busqueda) == null) {
            return true;
        } else {
            if (PerfilActual.getPerfilActual().getNomreUsuario().equalsIgnoreCase(txtUsuario.getText())) {
                return true;
            } else {
                Mensaje.getInstancia().error("Vuelve a intentarlo. Ya existe este nombre de usuario.");
                return false;
            }
        }
    }
    
    public void mostrarEditarPerfil(){
        ComprobacionesEditarPerfil.getInstancia().limpiarCampos(txtNombre, txtApellido, txtUsuario, txtCorreoElectronico, txtPassword, txtConfirmPassword, lblObligatorios, txTel, dateChoser);
        init();
        ComprobacionesEditarPerfil.getInstancia().llenarCampos(txtNombre, txtApellido, txtUsuario, txtCorreoElectronico, txtPassword, txtConfirmPassword, lblObligatorios, txTel, dateChoser);
        this.setVisible(true);
    }
    
    public void init(){
        addPlaceHolder("Telefono", txTel);
        this.lblObligatorios.setVisible(false);
        this.lblErrorPassword.setVisible(false);
    }
    
    public final void addPlaceHolder(String txtPlaceHolder, JTextField textField){
        TextPrompt placeholder = new TextPrompt(" " + txtPlaceHolder, textField);
        placeholder.changeAlpha(0.50f);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private com.toedter.calendar.JDateChooser dateChoser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblImgInicioSesion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblObligatorios;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblResgistrarse;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panelTransparente;
    private javax.swing.JTextField txTel;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
