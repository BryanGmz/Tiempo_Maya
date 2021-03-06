/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.gui.linea_de_tiempo;

import calendariomaya.backend.modelos.HechoHistoricoDb;
import calendariomaya.backend.modelos.InformacionDb;
import calendariomaya.backend.modelos.Mensaje;
import calendariomaya.backend.objetos.HechoHistorico;
import calendariomaya.gui.perfil.inicio_sesion.InicioSesion;
import calendariomaya.gui.menu.MenuPrincipal;
import calendariomaya.gui.perfil.Perfil;
import calendariomaya.gui.perfil.PerfilActual;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author bryangmz
 */
public class LineaDeTiempo extends javax.swing.JFrame {

    private static LineaDeTiempo instancia;
    private HechoHistorico hechoHistoricoActual;
    private List<HechoHistorico> hechoHistoricos;
    private int index;
    
    
    /**
     * Creates new form MenuPrincipal
     */
    private LineaDeTiempo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public static LineaDeTiempo getInstancia(){
        if (instancia == null) {
            instancia = new LineaDeTiempo();
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
        lblLineaTiempo = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblAgregarEvento = new javax.swing.JLabel();
        lblEliminarEvento = new javax.swing.JLabel();
        panelPerfil = new javax.swing.JPanel();
        lblPerfil = new javax.swing.JLabel();
        lblNombrePerfil = new javax.swing.JLabel();
        lblAcercaDe = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JLabel();
        lblTiempoMaya = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelEvento = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextPane();
        lblAnio = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JTextField();
        lblAtras = new javax.swing.JLabel();
        lblSiguiente = new javax.swing.JLabel();
        lblMenuPrincipal = new javax.swing.JLabel();
        lblSiguiente2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tiempo Maya");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBarraMenu.setBackground(new Color(0,0,0,110));
        panelBarraMenu.setForeground(new Color(255,255,255,165));

        lblLineaTiempo.setBackground(new java.awt.Color(204, 204, 204));
        lblLineaTiempo.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        lblLineaTiempo.setForeground(new java.awt.Color(204, 204, 204));
        lblLineaTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLineaTiempo.setText("Linea de Tiempo");

        lblMenu.setBackground(new java.awt.Color(204, 204, 204));
        lblMenu.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(204, 204, 204));
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Men?? Principal");
        lblMenu.setToolTipText("Calendario Haab'");
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        lblAgregarEvento.setBackground(new java.awt.Color(204, 204, 204));
        lblAgregarEvento.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        lblAgregarEvento.setForeground(new java.awt.Color(204, 204, 204));
        lblAgregarEvento.setText("Agregar Evento");
        lblAgregarEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarEventoMouseClicked(evt);
            }
        });

        lblEliminarEvento.setBackground(new java.awt.Color(204, 204, 204));
        lblEliminarEvento.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        lblEliminarEvento.setForeground(new java.awt.Color(204, 204, 204));
        lblEliminarEvento.setText("Eliminar Evento");
        lblEliminarEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarEventoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBarraMenuLayout = new javax.swing.GroupLayout(panelBarraMenu);
        panelBarraMenu.setLayout(panelBarraMenuLayout);
        panelBarraMenuLayout.setHorizontalGroup(
            panelBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraMenuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblAgregarEvento)
                .addGap(49, 49, 49)
                .addComponent(lblEliminarEvento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(lblLineaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBarraMenuLayout.setVerticalGroup(
            panelBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblLineaTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAgregarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEliminarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelBarraMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 50));

        panelPerfil.setBackground(new Color(0,0,0,100));

        lblPerfil.setBackground(new java.awt.Color(204, 204, 204));
        lblPerfil.setFont(new java.awt.Font("AvantGarde LT Medium", 0, 16)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(204, 204, 204));
        lblPerfil.setText("Perfil");
        lblPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPerfilMouseClicked(evt);
            }
        });

        lblNombrePerfil.setBackground(new java.awt.Color(204, 204, 204));
        lblNombrePerfil.setFont(new java.awt.Font("AvantGarde LT Medium", 0, 16)); // NOI18N
        lblNombrePerfil.setForeground(new java.awt.Color(204, 204, 204));

        lblAcercaDe.setBackground(new java.awt.Color(204, 204, 204));
        lblAcercaDe.setFont(new java.awt.Font("AvantGarde LT Medium", 0, 16)); // NOI18N
        lblAcercaDe.setForeground(new java.awt.Color(204, 204, 204));
        lblAcercaDe.setText("Acerca de...");
        lblAcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAcercaDeMouseClicked(evt);
            }
        });

        lblCerrarSesion.setBackground(new java.awt.Color(204, 204, 204));
        lblCerrarSesion.setFont(new java.awt.Font("AvantGarde LT Medium", 0, 16)); // NOI18N
        lblCerrarSesion.setForeground(new java.awt.Color(204, 204, 204));
        lblCerrarSesion.setText("Cerrar Sesion");
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
            }
        });

        lblTiempoMaya.setBackground(new java.awt.Color(204, 204, 204));
        lblTiempoMaya.setFont(new java.awt.Font("AvantGarde LT Medium", 0, 16)); // NOI18N
        lblTiempoMaya.setForeground(new java.awt.Color(204, 204, 204));
        lblTiempoMaya.setText("Tiempo Maya");

        javax.swing.GroupLayout panelPerfilLayout = new javax.swing.GroupLayout(panelPerfil);
        panelPerfil.setLayout(panelPerfilLayout);
        panelPerfilLayout.setHorizontalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPerfilLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTiempoMaya)
                    .addComponent(lblNombrePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCerrarSesion)
                    .addGroup(panelPerfilLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblAcercaDe)))
                .addGap(15, 15, 15))
            .addGroup(panelPerfilLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblPerfil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPerfilLayout.setVerticalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPerfilLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lblTiempoMaya)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombrePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCerrarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAcercaDe)
                .addGap(21, 21, 21))
        );

        getContentPane().add(panelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, 150, 180));

        jLabel2.setFont(new java.awt.Font("AvantGarde LT Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("?? 2021 Form Calendario Maya.  Todos los derechos reservados.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 570, 20));

        panelEvento.setBackground(new Color(0,0,0,100));

        txtDescripcion.setEditable(false);
        txtDescripcion.setBackground(new java.awt.Color(51, 51, 51));
        txtDescripcion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        txtDescripcion.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txtDescripcion);

        lblAnio.setEditable(false);
        lblAnio.setBackground(new Color(0,0,0,150));
        lblAnio.setFont(new java.awt.Font("Caviar Dreams", 1, 16)); // NOI18N
        lblAnio.setForeground(new java.awt.Color(255, 255, 255));
        lblAnio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblAnio.setText("A");
        lblAnio.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblTitulo.setBackground(new Color(0,0,0,150));
        lblTitulo.setFont(new java.awt.Font("Caviar Dreams", 1, 16)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblTitulo.setText("Titulo");
        lblTitulo.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout panelEventoLayout = new javax.swing.GroupLayout(panelEvento);
        panelEvento.setLayout(panelEventoLayout);
        panelEventoLayout.setHorizontalGroup(
            panelEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEventoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelEventoLayout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelEventoLayout.setVerticalGroup(
            panelEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(panelEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 850, 320));

        lblAtras.setFont(new java.awt.Font("AvantGarde LT Medium", 1, 64)); // NOI18N
        lblAtras.setForeground(new java.awt.Color(255, 255, 255));
        lblAtras.setText("<");
        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
        });
        getContentPane().add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 40, 50));

        lblSiguiente.setFont(new java.awt.Font("AvantGarde LT Medium", 1, 64)); // NOI18N
        lblSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        lblSiguiente.setText(">");
        lblSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseClicked(evt);
            }
        });
        getContentPane().add(lblSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 40, 50));

        lblMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendariomaya/img/MenuPrincipal.jpg"))); // NOI18N
        getContentPane().add(lblMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblSiguiente2.setFont(new java.awt.Font("AvantGarde LT Medium", 1, 64)); // NOI18N
        lblSiguiente2.setText(">");
        getContentPane().add(lblSiguiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 40, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPerfilMouseClicked
        // TODO add your handling code here:
        Perfil.getInstancia(this).mostrarPerfil();
    }//GEN-LAST:event_lblPerfilMouseClicked

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Gracias por utilizar esta aplicai??n!");
        this.setVisible(false);
        PerfilActual.getPerfilActual().cerrarSesion();
        InicioSesion.getInstancia().mostrarInicioSesion();
    }//GEN-LAST:event_lblCerrarSesionMouseClicked

    private void lblAgregarEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarEventoMouseClicked
        // TODO add your handling code here:
        AgregarEvento.getInstancia(this).mostrar();
    }//GEN-LAST:event_lblAgregarEventoMouseClicked

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        MenuPrincipal.getInstancia().mostarMenuPrincipal();
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseClicked
        // TODO add your handling code here:
        index++;
        cambiarHecho(hechoHistoricos.get(index));
        if (index == hechoHistoricos.size() - 1) {
            lblSiguiente.setVisible(false);
        } else {
            lblSiguiente.setVisible(true);
        }
        lblAtras.setVisible(true);
    }//GEN-LAST:event_lblSiguienteMouseClicked

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        // TODO add your handling code here:    
        index--;
        cambiarHecho(hechoHistoricos.get(index));
        if (index == 0) {
            lblAtras.setVisible(false);
        } else {
            lblAtras.setVisible(true);
        }
        lblSiguiente.setVisible(true);
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void lblEliminarEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarEventoMouseClicked
        // TODO add your handling code here:
        if (hechoHistoricoActual != null) {
            this.index = 0;
            lblAtras.setVisible(false);
            HechoHistoricoDb.getInstancia().eliminarHechoHistorico(hechoHistoricoActual);
            obtenerHechos();
            verificarPerfil();
            addPrimerHecho();
            Mensaje.getInstancia().informacion("Se elimin?? el evento con ??xito.");
            if (hechoHistoricos != null && hechoHistoricos.size() > 1) {
                lblSiguiente.setVisible(true);
            }
        } else {
            Mensaje.getInstancia().error("Lo siento, no se elimin?? el evento, vuelve a intentarlo.");
        }
    }//GEN-LAST:event_lblEliminarEventoMouseClicked

    private void lblAcercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAcercaDeMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, InformacionDb.getInstancia().getInformacion("inf_acerca_de").getDescripcionEscritorio(), "Acerca de...", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_lblAcercaDeMouseClicked

    public void mostarLineaDeTiempo(){
        if (PerfilActual.getPerfilActual().sesionActiva()) {
            this.index = 0;
            lblAtras.setVisible(false);
            lblNombrePerfil.setText(PerfilActual.getPerfilActual().getNomreUsuario());
            obtenerHechos();
            verificarPerfil();
            addPrimerHecho();
            this.setVisible(true);
        } else {
            this.setVisible(false);
            Mensaje.getInstancia().error("Debes de iniciar sesi??n");
            InicioSesion.getInstancia().mostrarInicioSesion();
        }
    }

    private void addPrimerHecho() {
        if (hechoHistoricos.size() > 0) {
            cambiarHecho(hechoHistoricos.get(0));
        }
    }
    
    public void verificarPerfil(){
        if (PerfilActual.getPerfilActual().getUsuario().getRol() == 1) {
            lblAgregarEvento.setVisible(true);
            lblEliminarEvento.setVisible(true);
        } else {
            lblAgregarEvento.setVisible(false);
            lblEliminarEvento.setVisible(false);
        }
    }
    
    public void obtenerHechos(){
        hechoHistoricos = HechoHistoricoDb.getInstancia().leerHechosHistoricos();
    }
    
    public void cambiarHecho(HechoHistorico hechoHistorico){
        if (hechoHistorico != null) {
            this.hechoHistoricoActual = hechoHistorico;
            lblTitulo.setText("Hecho: " + hechoHistorico.getTitulo());
            txtDescripcion.setText(hechoHistorico.getDescripcion());
            lblAnio.setText(hechoHistorico.getFechaInicio().toLocalDate().getYear() + " A " + hechoHistorico.getFechaFinalizacion().toLocalDate().getYear());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAcercaDe;
    private javax.swing.JLabel lblAgregarEvento;
    private javax.swing.JTextField lblAnio;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblEliminarEvento;
    private javax.swing.JLabel lblLineaTiempo;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JLabel lblNombrePerfil;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JLabel lblSiguiente2;
    private javax.swing.JLabel lblTiempoMaya;
    private javax.swing.JTextField lblTitulo;
    private javax.swing.JPanel panelBarraMenu;
    private javax.swing.JPanel panelEvento;
    private javax.swing.JPanel panelPerfil;
    private javax.swing.JTextPane txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
