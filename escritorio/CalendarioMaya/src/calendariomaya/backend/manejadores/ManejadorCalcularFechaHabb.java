/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.backend.manejadores;

import calendariomaya.backend.modelos.FechaHaabDb;
import calendariomaya.backend.modelos.Utilidades;
import calendariomaya.backend.objetos.FechaHaab;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author bryangmz
 */
public class ManejadorCalcularFechaHabb {
    
    private static ManejadorCalcularFechaHabb instancia;
    
    private ManejadorCalcularFechaHabb(){}
    
    public static ManejadorCalcularFechaHabb getInstancia(){
        if (instancia == null) {
            instancia = new ManejadorCalcularFechaHabb();
        }   return instancia;
    }
    
    public void escribirFecha(JLabel lblDia, JLabel lblMes, JLabel lblImgCargador, JLabel lblImgDia, JLabel lblImgMes, Date fecha){
        FechaHaab fechaActual = FechaHaabDb.getInstancia().getFechaEspecifica(Utilidades.DateToLocalDate(fecha));
        lblDia.setText("Día - " + fechaActual.getNahual().getNombre());
        lblMes.setText("Mes - " + fechaActual.getWinal().getNombre());
        fechaActual.getNahual().getImagen().colocarImagen(lblImgDia);
        fechaActual.getWinal().getImagen().colocarImagen(lblImgMes);
        fechaActual.getCargador().colocarImagen(lblImgCargador);
    }
    
    public void escribirFechaRuedaCalendarica(JLabel lblDia, JLabel lblMes, JLabel lblImgDia, JLabel lblImgMes, Date fecha){
        FechaHaab fechaActual = FechaHaabDb.getInstancia().getFechaEspecifica(Utilidades.DateToLocalDate(fecha));
        lblDia.setText("Día - " + fechaActual.getNahual().getNombre());
        lblMes.setText("Mes - " + fechaActual.getWinal().getNombre());
        fechaActual.getNahual().getImagen().colocarImagen(lblImgDia);
        fechaActual.getWinal().getImagen().colocarImagen(lblImgMes);
    }
    
    public Date fechaSiguiente(Date fecha){
        LocalDate temp = Utilidades.DateToLocalDate(fecha);
        temp = temp.plusDays(2);
        return Utilidades.LocalDateToDate(temp);
    }
    
    public Date fechaAnterior(Date fecha){
        LocalDate temp = Utilidades.DateToLocalDate(fecha);
        temp = temp.minusDays(0);
        return Utilidades.LocalDateToDate(temp);
    }
 
     public Date mesSiguiente(Date fecha){
        LocalDate temp = Utilidades.DateToLocalDate(fecha);
        if (temp.getDayOfYear() > 360) {
            temp = LocalDate.of(temp.getYear() + 1, Month.JANUARY, temp.getDayOfYear() - 360);
        } else if (temp.getDayOfYear() > 345) {
            temp = LocalDate.of(temp.getYear(), Month.DECEMBER, 31);
        } else {
            temp = temp.plusDays(21);
        }
        return Utilidades.LocalDateToDate(temp);
    }
    
     public Date mesAnterior(Date fecha){
        LocalDate temp = Utilidades.DateToLocalDate(fecha);
        if (temp.getDayOfYear() <= 5) {
            temp = LocalDate.of(temp.getYear(), Month.DECEMBER, 26 + temp.getDayOfYear());
        } else if (temp.getDayOfYear() <= 20) {
            temp = LocalDate.of(temp.getYear(), Month.DECEMBER, 31);
        } else {
            temp = temp.minusDays(19);
        }
        return Utilidades.LocalDateToDate(temp);
    }
     
}
