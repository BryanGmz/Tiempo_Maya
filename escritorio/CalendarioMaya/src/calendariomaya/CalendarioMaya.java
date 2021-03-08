/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya;

import calendariomaya.backend.modelos.ConexionDb;
import calendariomaya.gui.menu.Inicio;
import calendariomaya.source.ApiOptionPane;
import java.sql.SQLException;

/**
 *
 * @author bryangmz
 */
public class CalendarioMaya {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        ApiOptionPane.getInstancia().aplicarDisenio();
        ConexionDb.obtenerConexion();
        Inicio.getInstancia().setVisible(true);
    }
}
