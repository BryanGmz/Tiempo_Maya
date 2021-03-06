/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.gui.menu;

import calendariomaya.gui.perfil.inicio_sesion.InicioSesion;
import calendariomaya.gui.perfil.crear_cuenta.CrearCuenta;
import java.awt.Color;

/**
 *
 * @author bryangmz
 */
public class Inicio extends javax.swing.JFrame {

    private static Inicio instancia;
    
    /**
     * Creates new form MenuPrincipal
     */
    private Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public static Inicio getInstancia(){
        if (instancia == null) {
            instancia = new Inicio();
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

        panelBarraMenu = new javax.swing.JPanel();
        lblTM = new javax.swing.JLabel();
        lblInicioSesion = new javax.swing.JLabel();
        lblCrearCuenta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTiempoMaya = new javax.swing.JLabel();
        lblMenuPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tiempo Maya");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBarraMenu.setBackground(new Color(0,0,0,110));
        panelBarraMenu.setForeground(new Color(255,255,255,165));

        lblTM.setBackground(new java.awt.Color(204, 204, 204));
        lblTM.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        lblTM.setForeground(new java.awt.Color(204, 204, 204));
        lblTM.setText("Tiempo Maya");
        lblTM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTMMouseClicked(evt);
            }
        });

        lblInicioSesion.setBackground(new java.awt.Color(204, 204, 204));
        lblInicioSesion.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        lblInicioSesion.setForeground(new java.awt.Color(204, 204, 204));
        lblInicioSesion.setText("Iniciar Sesion ");
        lblInicioSesion.setToolTipText("Calendario Haab'");
        lblInicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioSesionMouseClicked(evt);
            }
        });

        lblCrearCuenta.setBackground(new java.awt.Color(204, 204, 204));
        lblCrearCuenta.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        lblCrearCuenta.setForeground(new java.awt.Color(204, 204, 204));
        lblCrearCuenta.setText("Crear Cuenta");
        lblCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCrearCuentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBarraMenuLayout = new javax.swing.GroupLayout(panelBarraMenu);
        panelBarraMenu.setLayout(panelBarraMenuLayout);
        panelBarraMenuLayout.setHorizontalGroup(
            panelBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraMenuLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lblTM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(lblInicioSesion)
                .addGap(161, 161, 161)
                .addComponent(lblCrearCuenta)
                .addGap(103, 103, 103))
        );
        panelBarraMenuLayout.setVerticalGroup(
            panelBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblTM, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addComponent(lblInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelBarraMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 50));

        jLabel2.setFont(new java.awt.Font("AvantGarde LT Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("?? 2021 Calendario Maya.  Todos los derechos reservados.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 570, 20));

        lblTiempoMaya.setBackground(new java.awt.Color(255, 255, 255));
        lblTiempoMaya.setFont(new java.awt.Font("Caviar Dreams", 1, 48)); // NOI18N
        lblTiempoMaya.setForeground(new java.awt.Color(255, 255, 255));
        lblTiempoMaya.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempoMaya.setText("Bienvenido al Tiempo Maya");
        lblTiempoMaya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTiempoMayaMouseClicked(evt);
            }
        });
        getContentPane().add(lblTiempoMaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1030, 240));

        lblMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendariomaya/img/MenuPrincipal.jpg"))); // NOI18N
        getContentPane().add(lblMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblInicioSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioSesionMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        InicioSesion.getInstancia().mostrarInicioSesion();
    }//GEN-LAST:event_lblInicioSesionMouseClicked

    private void lblCrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearCuentaMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        CrearCuenta.getInstancia(this).mostrar();
    }//GEN-LAST:event_lblCrearCuentaMouseClicked

    private void lblTMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTMMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTMMouseClicked

    private void lblTiempoMayaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTiempoMayaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTiempoMayaMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCrearCuenta;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JLabel lblTM;
    private javax.swing.JLabel lblTiempoMaya;
    private javax.swing.JPanel panelBarraMenu;
    // End of variables declaration//GEN-END:variables
}
