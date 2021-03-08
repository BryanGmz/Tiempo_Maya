/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.gui.perfil;

import calendariomaya.gui.perfil.editar_perfil.EditarPerfil;
import java.awt.Color;
import java.awt.Frame;
import java.text.SimpleDateFormat;

/**
 *
 * @author bryangmz
 */
public class Perfil extends javax.swing.JDialog {

    private static Perfil instancia;
    private final Frame frame;
    
    /**
     * Creates new form InicioSesion
     */
    private Perfil(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.frame = parent;
        this.setLocationRelativeTo(null);
    }

    public static Perfil getInstancia(Frame frame){
        if (instancia == null) {
            instancia = new Perfil(frame, true);
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
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txTel = new javax.swing.JTextField();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        lblEditar = new javax.swing.JLabel();
        lblImgInicioSesion = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTransparente.setBackground(new Color(255, 255, 255, 135));

        lblResgistrarse.setBackground(new java.awt.Color(102, 102, 102));
        lblResgistrarse.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblResgistrarse.setForeground(new java.awt.Color(51, 51, 51));
        lblResgistrarse.setText("Perfil");

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        txtCorreoElectronico.setEditable(false);
        txtCorreoElectronico.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCorreoElectronico.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setText("Nombre");

        lblEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblEmail.setText("Correo Electronico");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("© 2021 Form Calendario Maya.  Todos los derechos reservados.");

        lblApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblApellido.setText("Apellido");

        txtApellido.setEditable(false);
        txtApellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtApellido.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario");

        txtUsuario.setEditable(false);
        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblTel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTel.setText("Tel.");

        txTel.setEditable(false);
        txTel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txTel.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblFechaNacimiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFechaNacimiento.setText("Fecha de Nacimiento");

        txtFechaNacimiento.setEditable(false);
        txtFechaNacimiento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFechaNacimiento.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblEditar.setText("Editar");
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarMouseClicked(evt);
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
                            .addComponent(lblUsuario)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
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
                                .addComponent(txtFechaNacimiento))))
                    .addGroup(panelTransparenteLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(panelTransparenteLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(lblResgistrarse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEditar)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panelTransparenteLayout.setVerticalGroup(
            panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparenteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResgistrarse)
                    .addComponent(lblEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(lblFechaNacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txTel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(panelTransparente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 590, 470));

        lblImgInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendariomaya/img/InicioSesion.jpeg"))); // NOI18N
        getContentPane().add(lblImgInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        EditarPerfil.getInstancia(frame).mostrarEditarPerfil();
    }//GEN-LAST:event_lblEditarMouseClicked

    public void mostrarPerfil(){
        init();
        this.setVisible(true);
    }
    
    public void init(){
        txtNombre.setText(PerfilActual.getPerfilActual().getUsuario().getNombre());
        txtApellido.setText(PerfilActual.getPerfilActual().getUsuario().getApellido());
        txtCorreoElectronico.setText(PerfilActual.getPerfilActual().getUsuario().getEmail());
        txtUsuario.setText(PerfilActual.getPerfilActual().getUsuario().getUsername());
        if (PerfilActual.getPerfilActual().getUsuario().getTelefono() != null) {
            txTel.setText(PerfilActual.getPerfilActual().getUsuario().getTelefono());
        }
        if (PerfilActual.getPerfilActual().getUsuario().getNacimiento() != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            txtFechaNacimiento.setText(sdf.format(PerfilActual.getPerfilActual().getUsuario().getNacimiento()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblImgInicioSesion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblResgistrarse;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panelTransparente;
    private javax.swing.JTextField txTel;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
