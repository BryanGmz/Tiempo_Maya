/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.gui.perfil.inicio_sesion;

import calendariomaya.source.TextPrompt;
import calendariomaya.gui.perfil.crear_cuenta.CrearCuenta;
import calendariomaya.gui.menu.MenuPrincipal;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author bryangmz
 */
public class InicioSesion extends javax.swing.JDialog {

    private final Frame frame;
    private static InicioSesion instancia;
    
    /**
     * Creates new form InicioSesion
     */
    private InicioSesion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.frame = parent;
        init();
    }
    
    public static InicioSesion getInstancia(){
        if (instancia == null) {
            instancia = new InicioSesion(new Frame(), true);
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
        lblNameOfAplication = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCrearCuenta = new javax.swing.JButton();
        lblObligatorios = new javax.swing.JLabel();
        txtPasword = new javax.swing.JPasswordField();
        lblImgInicioSesion = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTransparente.setBackground(new Color(255, 255, 255, 135));

        lblNameOfAplication.setBackground(new java.awt.Color(102, 102, 102));
        lblNameOfAplication.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblNameOfAplication.setForeground(new java.awt.Color(51, 51, 51));
        lblNameOfAplication.setText("Bienvenido a Tiempo Maya");

        lblLogin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(102, 102, 102));
        lblLogin.setText("Iniciar sesión");

        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUser.setText("Usuario*");

        lblPassword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPassword.setText("Contraseña*");

        btnIniciarSesion.setBackground(new java.awt.Color(153, 153, 153));
        btnIniciarSesion.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(102, 102, 102));
        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("© 2021 Form Calendario Maya.  Todos los derechos reservados.");

        btnCrearCuenta.setBackground(new java.awt.Color(153, 153, 153));
        btnCrearCuenta.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(102, 102, 102));
        btnCrearCuenta.setText("Crear Cuenta");
        btnCrearCuenta.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        lblObligatorios.setForeground(new java.awt.Color(255, 0, 0));
        lblObligatorios.setText("Todos los campos con * son obligatorios");

        txtPasword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPasword.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtPasword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaswordKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelTransparenteLayout = new javax.swing.GroupLayout(panelTransparente);
        panelTransparente.setLayout(panelTransparenteLayout);
        panelTransparenteLayout.setHorizontalGroup(
            panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparenteLayout.createSequentialGroup()
                .addGroup(panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTransparenteLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPasword, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                            .addComponent(txtUsuario)
                            .addGroup(panelTransparenteLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblUser))
                            .addGroup(panelTransparenteLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblPassword))))
                    .addGroup(panelTransparenteLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblNameOfAplication)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransparenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransparenteLayout.createSequentialGroup()
                        .addGroup(panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransparenteLayout.createSequentialGroup()
                        .addComponent(lblLogin)
                        .addGap(195, 195, 195))))
            .addGroup(panelTransparenteLayout.createSequentialGroup()
                .addGroup(panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTransparenteLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(lblObligatorios))
                    .addGroup(panelTransparenteLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelTransparenteLayout.setVerticalGroup(
            panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparenteLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblNameOfAplication)
                .addGap(18, 18, 18)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPassword)
                .addGap(5, 5, 5)
                .addComponent(txtPasword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblObligatorios)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(panelTransparente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 580, 530));

        lblImgInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendariomaya/img/InicioSesion.jpeg"))); // NOI18N
        getContentPane().add(lblImgInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CrearCuenta.getInstancia(frame).mostrar();
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
        validarCampos();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txtPaswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaswordKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnIniciarSesion.doClick();
        }
    }//GEN-LAST:event_txtPaswordKeyReleased

    public void mostrarInicioSesion(){
        this.setVisible(true);
        txtUsuario.setText("");
        txtPasword.setText("");
        init();
    }
    
    public final void init(){
        this.lblObligatorios.setVisible(false);
        this.setLocationRelativeTo(null);
        addPlaceHolder("Usuario", txtUsuario);
        addPlaceHolder("Contraseña", txtPasword);
    }
    
    public final void addPlaceHolder(String txtPlaceHolder, JTextField textField){
        TextPrompt placeholder = new TextPrompt(" " + txtPlaceHolder, textField);
        placeholder.changeAlpha(0.50f);
    }

    private void validarCampos(){
        if (!txtUsuario.getText().isEmpty() || !txtPasword.getText().isEmpty()) {
            if (ComprobacionesInicioSesion.getInicioSesion().comprobarUsuario(txtUsuario.getText(), txtPasword.getText())) {
                this.setVisible(false);
                MenuPrincipal.getInstancia().mostarMenuPrincipal();
            } else {
                txtPasword.setText("");
            }
        } else {
            lblObligatorios.setVisible(true);
            txtPasword.setText("");
            JOptionPane.showMessageDialog(null, "Lo siento, todos los campos con * son obligatorios.", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblImgInicioSesion;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNameOfAplication;
    private javax.swing.JLabel lblObligatorios;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panelTransparente;
    private javax.swing.JPasswordField txtPasword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}