/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.backend.modelos;

import calendariomaya.backend.objetos.FechaHaab;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose_
 */
public class FechaHaabDb {
    
    private static FechaHaabDb instancia;
    
    private FechaHaabDb(){}
    
    public static FechaHaabDb getInstancia(){
        if (instancia == null) {
            instancia = new FechaHaabDb();
        } return instancia;
    }
    
    public void crear(FechaHaab fecha){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("INSERT INTO calendariohaab "
                    + "(nahual,winal,nombre,descripcion,fecha) VALUES (?,?,?,?,?);");
            statement.setInt(1,fecha.getNahual().getId());
            statement.setInt(2, fecha.getWinal().getId());
            statement.setString(3, fecha.getNombre());
            statement.setString(4, fecha.getDescripcion());
            statement.setDate(5, fecha.getFecha());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void modificar(FechaHaab fecha){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("UPDATE calendariohaab"
                    + "SET nahual=?, winal=?, nombre=?, descripcion=?, fecha=? WHERE id=?;");
            statement.setInt(1, fecha.getNahual().getId());
            statement.setInt(2, fecha.getWinal().getId());
            statement.setString(3, fecha.getNombre());
            statement.setString(4, fecha.getDescripcion());
            statement.setDate(5, fecha.getFecha());
            statement.setInt(6, fecha.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void eliminar(FechaHaab fecha){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("DELETE FROM calendariohaab WHERE id=?;");
            statement.setInt(1, fecha.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public List<FechaHaab> getFechas(){
        List<FechaHaab> fechas = new ArrayList();
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM calendariohaab;");
            ResultSet resultado = statement.executeQuery();
            while(resultado.next()) fechas.add(instanciarDeResultSet(resultado, 1));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return fechas;
    }
    
    public FechaHaab getFecha(int id){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM calendariohaab WHERE id=?;");
            statement.setInt(1, id);
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()) return instanciarDeResultSet(resultado, 1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public FechaHaab getFechaEspecifica(LocalDate fecha) {
        try {
            int cargador = obtenerCargador(fecha);
            LocalDate fechaBusqueda = LocalDate.of(2020, fecha.getMonthValue(), fecha.getDayOfMonth());
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM calendariohaab WHERE fecha=?;");
            statement.setDate(1, Date.valueOf(fechaBusqueda));
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()) return instanciarDeResultSet(resultado, cargador);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }   
    
    private FechaHaab instanciarDeResultSet(ResultSet resultado, int cargador) throws SQLException{
        NahualDb accesoNahual = NahualDb.getInstancia();
        WinalDb accesoWinal = WinalDb.getInstancia();
        CargadorDb accesoCargador = CargadorDb.getInstancia();
        return new FechaHaab(
                resultado.getInt("id"),
                accesoNahual.getNahual(resultado.getInt("nahual")),
                accesoWinal.getWinal(resultado.getInt("winal")),
                resultado.getString("nombre"),
                resultado.getString("descripcion"),
                resultado.getDate("fecha"),
                accesoCargador.getCargador(cargador)
        );
    }
    
    private int obtenerCargador(LocalDate fecha){
        int cargador = 1;
        if(fecha.getYear() < 2020){
            for (int i = 0; i < (2020-fecha.getYear()); i++) {
                if(cargador==1){
                    cargador = 4;
                }else{
                    cargador--;
                }
            }
        } else if(fecha.getYear() > 2020){
            for (int i = 0; i < (fecha.getYear()-2020); i++) {
                if(cargador==4){
                    cargador = 1;
                }else{
                    cargador++;
                }
            }
        }
        return cargador;
    }
}
