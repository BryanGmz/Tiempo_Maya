/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.backend.objetos;

import java.sql.Date;

/**
 *
 * @author jose_
 */
public class Usuario {
    
    private String username, password, email, nombre, apellido, telefono;
    private Date nacimiento;
    private int rol;

    public Usuario() {
    }

    public Usuario(String username, String password, String email, String nombre, String apellido, String telefono, Date nacimiento, int rol) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
        @Override
    public String toString() {
        return "\n Usuario{" + "username=" + username + ", password=" + password + ", email=" + email + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", nacimiento=" + nacimiento + ", rol=" + rol + '}';
    }

    
}
