/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.gui.perfil;

import calendariomaya.backend.objetos.Usuario;

/**
 *
 * @author bryangmz
 */
public class PerfilActual {
    
    private static PerfilActual perfilActual;
    private Usuario usuario;
    
    private PerfilActual(){}
    
    public static PerfilActual getPerfilActual(){
        if (perfilActual == null) {
            perfilActual = new PerfilActual();
        } return perfilActual;
    }
    
    public boolean sesionActiva(){
        return usuario != null;
    }
    
    public void setSesion(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Usuario getUsuario(){
        return this.usuario;
    }
    
    public String getNomreUsuario(){
        return this.usuario.getUsername();
    }
    
    public void cerrarSesion(){
        usuario = null;
    }
    
}
