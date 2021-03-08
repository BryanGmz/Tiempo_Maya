/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.gui.perfil.inicio_sesion;

import calendariomaya.backend.modelos.Mensaje;
import calendariomaya.backend.modelos.UsuarioDb;
import calendariomaya.backend.objetos.Usuario;
import calendariomaya.gui.perfil.PerfilActual;

/**
 *
 * @author bryangmz
 */
public class ComprobacionesInicioSesion {
    
    private static ComprobacionesInicioSesion inicioSesion;
    
    private ComprobacionesInicioSesion() {}
    
    public static ComprobacionesInicioSesion getInicioSesion() {
        if (inicioSesion == null) {
            inicioSesion = new ComprobacionesInicioSesion();
        } return inicioSesion;
    }

    public boolean comprobarUsuario(String user, String password){
        Usuario usuario = UsuarioDb.getInstancia().validacionUsuario(user, password);
        if(usuario != null){
            PerfilActual.getPerfilActual().setSesion(usuario);
            return true;
        } else {
            Mensaje.getInstancia().error("El usuario o contraseña son incorrectos!");
            return false;
        }
    }
    
}
