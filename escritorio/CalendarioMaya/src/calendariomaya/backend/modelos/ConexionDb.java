/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.backend.modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jose_
 */
public class ConexionDb {//Aquí la conexion a la base de datos
    
    public static Connection conexion = null;
    //llenar con credenciales de su DB , datos de ejemplo
    private static final String NOMBRE_DB = "CalendarioMaya";
    private static final String USUARIO_DB = "root";
    private static final String PASSWORD_DB = "Haha7090!";

    private ConexionDb() {}

    //Nos conectamos a nuestra db
    public static Connection obtenerConexion() throws SQLException, ClassNotFoundException {
        if (conexion == null) {
            try {
                //Buscamos nuestra db por medio de su ubicacion <entorno  local>, mandando el nombre y nuestra password
                Class.forName("com.mysql.cj.jdbc.Driver");
                String stringConnection = "jdbc:mysql://localhost/" + NOMBRE_DB + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
                conexion = DriverManager.getConnection(stringConnection, USUARIO_DB, PASSWORD_DB);
                
            }//en caso de que no se encuentre la base de datos //en caso de que no se encuentre la base de datos //en caso de que no se encuentre la base de datos //en caso de que no se encuentre la base de datos //en caso de que no se encuentre la base de datos //en caso de que no se encuentre la base de datos //en caso de que no se encuentre la base de datos //en caso de que no se encuentre la base de datos 
            catch (SQLException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        return conexion;
    }

    //cerramos conexion , liberamos nuestra DB 
    public static void cerrar() throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }

}
