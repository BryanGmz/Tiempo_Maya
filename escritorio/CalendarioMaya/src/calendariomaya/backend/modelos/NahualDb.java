/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.backend.modelos;

import calendariomaya.backend.objetos.Nahual;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose_
 */
public class NahualDb {

    private static NahualDb instanciaNahual;
    
    private NahualDb(){}
    
    public static NahualDb getInstancia(){
        if (instanciaNahual == null) {
            instanciaNahual = new NahualDb();
        } return instanciaNahual;
    }
    
    public void crear(Nahual nahual){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("INSERT INTO nahual "
                    + "(nombre,idImagen,signficado,descripcion,fechaInicio,fechaFinalizacion,nombreYucateco,nombreSp) VALUES (?,?,?,?,?,?,?,?)");
            statement.setString(1, nahual.getNombre());
            statement.setInt(2, nahual.getImagen().getId());
            statement.setString(3, nahual.getSignificado());
            statement.setString(4, nahual.getDescripcion());
            statement.setDate(5, nahual.getFechaInicio());
            statement.setDate(6, nahual.getFechaFinalizacion());
            statement.setString(7, nahual.getNombreYucateco());
            statement.setString(8, nahual.getNombreEsp());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void modificar(Nahual nahual){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("UPDATE nahual SET "
                    + "nombre=?, idImagen=?, significado=?, descripcion=?, fechaInicio=?, fechaFinalizacion=?,"
                    + "nombreYucateco=?, nombreSp=? WHERE id=?;");
            statement.setString(1, nahual.getNombre());
            statement.setInt(2, nahual.getImagen().getId());
            statement.setString(3, nahual.getSignificado());
            statement.setString(4, nahual.getDescripcion());
            statement.setDate(5, nahual.getFechaInicio());
            statement.setDate(6, nahual.getFechaFinalizacion());
            statement.setString(7, nahual.getNombreYucateco());
            statement.setString(8, nahual.getNombreEsp());
            statement.setInt(9, nahual.getId());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void eliminar(Nahual nahual){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("DELETE FROM nahual WHERE id=?;");
            statement.setInt(1, nahual.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public List<Nahual> getNahuales(){
        List<Nahual> nahuales = new ArrayList();
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM nahual;");
            ResultSet resultado = statement.executeQuery();
            while(resultado.next()) nahuales.add(instanciarDeResultSet(resultado));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return nahuales;
    }
    
    public Nahual getNahual(int id){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM nahual WHERE id=?;");
            statement.setInt(1, id);
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()) return instanciarDeResultSet(resultado);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    private Nahual instanciarDeResultSet(ResultSet resultado) throws SQLException{
        return new Nahual(
                resultado.getInt("id"),
                resultado.getString("nombre"),
                ImagenDb.getInstancia().getImagen(resultado.getInt("idImagen")),
                resultado.getString("significado"),
                resultado.getString("descripcion"),
                resultado.getDate("fechaInicio"),
                resultado.getDate("fechaFinalizacion"),
                resultado.getString("nombreYucateco"),
                resultado.getString("nombreSp")
        );
    }
}
