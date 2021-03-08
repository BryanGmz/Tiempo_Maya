/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.backend.modelos;

import calendariomaya.backend.objetos.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author jose_
 */
public class UsuarioDb {
    
    public static String VALIDACION_LOGEO = "SELECT * FROM usuario WHERE username = ? AND password = ?";
    private static UsuarioDb usuarioDb;
    
    private final Mensaje mensajes = Mensaje.getInstancia();
    
    private UsuarioDb (){}
    
    public static UsuarioDb getInstancia(){
        if (usuarioDb == null) {
            usuarioDb = new UsuarioDb();
        } return usuarioDb;
    }
    
    public boolean crearUsuario(Usuario usuarioACrear) {//creamos un nuevo usuario
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("INSERT INTO usuario "
                    + "(username, password, email, nombre, apellido, nacimiento, telefono, rol) "
                    + "VALUES (?,?,?,?,?,?,?,?);");
            System.out.println("QUERY: " + statement);
            statement.setString(1, usuarioACrear.getUsername());
            statement.setString(2, usuarioACrear.getPassword());
            statement.setString(3, usuarioACrear.getEmail());
            statement.setString(4, usuarioACrear.getNombre());
            statement.setString(5, usuarioACrear.getApellido());
            statement.setDate(6, usuarioACrear.getNacimiento());
            statement.setString(7, usuarioACrear.getTelefono());
            statement.setInt(8, usuarioACrear.getRol());
            statement.executeUpdate();
            mensajes.informacion("Se ha creado el usuario con exito.");
            return true;
        } catch (SQLException ex) {
            mensajes.error("Ingrese otro usuario, asegurese que el nombre de usuario '" + usuarioACrear.getUsername() + "' no se repita");
            return false;
        }
    }

    public boolean actualizarUsuario(Usuario usuarioActualizar, String userNameAntiguo) {//actualizamos usuario
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("UPDATE usuario SET "
                    + "userName=? , password =? , email=?,  "
                    + "nombre=? ,  apellido=? , nacimiento= ? , "
                    + "telefono = ? , rol=?  "
                    + "WHERE username=?;");
            statement.setString(1, usuarioActualizar.getUsername());
            statement.setString(2, usuarioActualizar.getPassword());
            statement.setString(3, usuarioActualizar.getEmail());
            statement.setString(4, usuarioActualizar.getNombre());
            statement.setString(5, usuarioActualizar.getApellido());
            statement.setDate(6, usuarioActualizar.getNacimiento());
            statement.setString(7, usuarioActualizar.getTelefono());
            statement.setInt(8, usuarioActualizar.getRol());
            statement.setString(9, userNameAntiguo);
            statement.executeUpdate();
            mensajes.informacion("Se ha modificado el usuario con exito.");
            return true;
        } catch (SQLException ex) {
            mensajes.error("No se actualizo el usuario. Asegurese que el usuario '" + userNameAntiguo + "' exista");
        }
        return false;
    }

    public void eliminarUsuario(Usuario usuarioAEliminar) {//eliminamos usuario
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("DELETE FROM usuario WHERE username=?;");
            statement.setString(1, usuarioAEliminar.getUsername());
            statement.executeUpdate();
            mensajes.informacion("Se ha eliminado el usuario con exito.");
        } catch (SQLException ex) {
            mensajes.error("No se elimino el usuario " + usuarioAEliminar.getUsername() + " . Asegurese que el usuario exista");
        }
    }

    public LinkedList<Usuario> leerUsuarios() { //mostramos todos los usuarios y devolvemos en una lista
        LinkedList<Usuario> listaUsuarios = new LinkedList<>();
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM usuario;");
            ResultSet resultado = statement.executeQuery();
            while (resultado.next()) {
                Usuario usuario = convertirAUsuario(resultado);
                listaUsuarios.add(usuario);
            }
        } catch (SQLException ex) {
            System.out.println("No se leyeron los usuarios de la DB");
        }
        return listaUsuarios;
    }

    public Usuario leerUsuario(Usuario usuarioABuscar) {//leemos un usuario en especifico y lo devolvemos
        Usuario usuario = null;
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM usuario WHERE username= ? ;");
            statement.setString(1, usuarioABuscar.getUsername());
            ResultSet resultado = statement.executeQuery();
            while (resultado.next()) {
                usuario = convertirAUsuario(resultado);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: \n no se encontro el usuario");
        }
        return usuario;
    }

    public Usuario convertirAUsuario(ResultSet resultado) {//del resultado de la busqueda obtener el usuario
        Usuario usuarioDevolver = null;
        try {
            usuarioDevolver = new Usuario(resultado.getString(1), resultado.getString(2), resultado.getString(3), 
                    resultado.getString(4), resultado.getString(5), resultado.getString(7),
                    resultado.getDate(6), resultado.getInt(8));
        } catch (SQLException ex) {
            System.out.println("error en conversion de usuario");
        }
        return usuarioDevolver;
    }
    
    //Verificacion durante logeo de un usuario
    public Usuario validacionUsuario(String usuario, String password){
        Usuario aDevolver = null;
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement(VALIDACION_LOGEO);
            statement.setString(1, usuario);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                aDevolver = convertirAUsuario(result);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return aDevolver;
    }
}
