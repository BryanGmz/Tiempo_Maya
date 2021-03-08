/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.backend.manejadores;

import calendariomaya.backend.modelos.ImagenDb;
import calendariomaya.backend.modelos.InformacionDb;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author bryangmz
 */
public class ManejadorInformacionOptionPane {
    
    private static ManejadorInformacionOptionPane manejadorInformacion;
    
    private ManejadorInformacionOptionPane(){}
    
    public static ManejadorInformacionOptionPane getInstancia(){
        if (manejadorInformacion == null) {
            manejadorInformacion = new ManejadorInformacionOptionPane();
        } return manejadorInformacion;
    }
    
    public void mostrarInfCalendarioLunar(){
        String mensaje = InformacionDb.getInstancia().getInformacion("inf_calendario_lunar").getDescripcionEscritorio();
        JOptionPane.showMessageDialog(null, mensaje, "Calendario Lunar", JOptionPane.INFORMATION_MESSAGE, 
                new javax.swing.ImageIcon(getClass().getResource(ImagenDb.getInstancia().getImagen(42).getDirEscritorio())));
    }
    
    public void mostarInfFormasDeContar(){
        String mensaje = InformacionDb.getInstancia().getInformacion("inf_formas_contar").getDescripcionEscritorio();
        JOptionPane.showMessageDialog(null, mensaje, "Formas de Contar", JOptionPane.INFORMATION_MESSAGE, 
                new javax.swing.ImageIcon(getClass().getResource(ImagenDb.getInstancia().getImagen(43).getDirEscritorio())));
    }
    
    public void mostrarInfDiasCholquij(){
        String mensaje = InformacionDb.getInstancia().getInformacion("inf_dias_cholquij").getDescripcionEscritorio();
        JOptionPane.showMessageDialog(null, mensaje, "Dias del Calendario", JOptionPane.INFORMATION_MESSAGE, 
                new javax.swing.ImageIcon(getClass().getResource(ImagenDb.getInstancia().getImagen(45).getDirEscritorio())));
    }
    
    public void mostrarInfCholquij() {
        String mensaje = InformacionDb.getInstancia().getInformacion("inf_cholquij").getDescripcionEscritorio();
        JOptionPane.showMessageDialog(null, mensaje, "Calendario", JOptionPane.INFORMATION_MESSAGE, 
                new javax.swing.ImageIcon(getClass().getResource(ImagenDb.getInstancia().getImagen(46).getDirEscritorio())));
    }
    
    public void mostrarInfHabb(){
        String mensaje = InformacionDb.getInstancia().getInformacion("inf_haab_escritorio").getDescripcionEscritorio();
        ImageIcon imIcon = new ImageIcon(getClass().getResource(ImagenDb.getInstancia().getImagen(47).getDirEscritorio()));
        Icon icono = new ImageIcon(imIcon.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT));
        JOptionPane.showMessageDialog(null, mensaje, "Calendario Habb'", JOptionPane.INFORMATION_MESSAGE, icono);
    }
    
    public void mostrarWinalHabb(){
        String mensaje = InformacionDb.getInstancia().getInformacion("inf_uinal_haab_escritorio").getDescripcionEscritorio();
        JOptionPane.showMessageDialog(null, mensaje, "Winal (Mes)", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarKinalHabb(){
        String mensaje = InformacionDb.getInstancia().getInformacion("inf_kin_haab_escritorio").getDescripcionEscritorio();
        JOptionPane.showMessageDialog(null, mensaje, "Kinal (Día)", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mostrarUayebHabb(){
        String mensaje = InformacionDb.getInstancia().getInformacion("in_calendario_habb_uayeb").getDescripcionEscritorio();
        JOptionPane.showMessageDialog(null, mensaje, "Uayeb", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mostrarRuedaCalendarica(){
        String mensaje = InformacionDb.getInstancia().getInformacion("inf_rueda_calendarica").getDescripcionEscritorio();
        JOptionPane.showMessageDialog(null, mensaje, "Rueda Calendarica", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mostrarRuedaCalendaricaMecanismos(){
        String mensaje = InformacionDb.getInstancia().getInformacion("inf_rueda_calendarica_mecanismo").getDescripcionEscritorio();
        JOptionPane.showMessageDialog(null, mensaje, "Mecanismo", JOptionPane.INFORMATION_MESSAGE);
    }
}
