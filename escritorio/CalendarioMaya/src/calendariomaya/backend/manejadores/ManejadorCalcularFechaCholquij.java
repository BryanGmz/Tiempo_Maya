/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.backend.manejadores;

import calendariomaya.backend.modelos.ImagenDb;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.swing.Icon;

/**
 *
 * @author bryangmz
 */
public class ManejadorCalcularFechaCholquij {
    
    private static ManejadorCalcularFechaCholquij manejadorCalcular;
    
    private ManejadorCalcularFechaCholquij(){}
    
    public static ManejadorCalcularFechaCholquij getInstancia(){
        if (manejadorCalcular == null) {
            manejadorCalcular = new ManejadorCalcularFechaCholquij();
        } return manejadorCalcular;
    }
    
    public Icon getIcon(int caso){
        return (new javax.swing.ImageIcon(getClass().getResource(ImagenDb.getInstancia().getImagen(40).getDirEscritorio() + caso + ".jpg"))); // NOI18N
    }
    
    public Icon getIconLvl(int caso){
        return (new javax.swing.ImageIcon(getClass().getResource(ImagenDb.getInstancia().getImagen(41).getDirEscritorio() + caso + ".jpg"))); // NOI18N
    }
    
    public int nahual(int cont){
        int contador = cont;
        int contadorNahual = 16;
        if (contador < 0) {
            while (contador != 0) {
                if (contadorNahual == 20) {
                    contadorNahual = 1;
                } else {
                    contadorNahual++;
                } contador++;
            } return contadorNahual;
        }
        while (contador != 0) {
            if (contadorNahual == 1) {
                contadorNahual = 20;
            } else {
                contadorNahual--;
            } contador--;
        } return contadorNahual;
        
    }
    
    public int nivel(int cont){
        int contador = cont;
        int contadorNahual = 4;
        if (contador < 0) {
            while (contador != 0) {
                if (contadorNahual == 13) {
                    contadorNahual = 1;
                } else {
                    contadorNahual++;
                } contador++;
            } return contadorNahual;
        }
        while (contador != 0) {
            if (contadorNahual == 1) {
                contadorNahual = 13;
            } else {
                contadorNahual--;
            } contador--;
        } return contadorNahual;
        
    }
    
    public int timeCholqij(long date){
        try {
            String string = "Nov 15, 2020 00:00:00 AM";
            SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.ROOT);
            Date datePivote = sdf.parse(string);
            long regresar = TimeUnit.DAYS.convert(datePivote.getTime() - date, TimeUnit.MILLISECONDS);  
            return (int) regresar;
        } catch (ParseException ex) {
            System.out.println("Exception: " + ex.toString());
        } return 1;
    }
}
