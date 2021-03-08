/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.backend.manejadores;

import calendariomaya.backend.objetos.Nahual;
import java.awt.Image;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextPane;

/**
 *
 * @author bryangmz
 */
public class ManejadorCalcularNahuales {
    
    private static ManejadorCalcularNahuales instancia;
    
    private ManejadorCalcularNahuales(){}
    
    public static ManejadorCalcularNahuales getInstancia(){
        if (instancia == null) {
            instancia = new ManejadorCalcularNahuales();
        }   return instancia;
    }
    
     private Icon getIconNahual(Nahual nahual, JLabel label){
        ImageIcon imIcon = new ImageIcon(nahual.getImagen().getDirEscritorio());
        Icon icono = new ImageIcon(imIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        return icono;
    }
    
    public void pintarNahuales(int indice, List<Nahual> listaDeNahuales, JLabel lblNahualAnterior, JLabel lblNahualSiguiente, JLabel lblNahualActual,
            JTextPane txtPaneDescripcion, JTextPane txtPaneSignificado, JLabel lblNombreNahual){
        System.out.println("Indice " + indice);
        if(indice == 0){
            lblNahualAnterior.setIcon(getIconNahual(listaDeNahuales.get(listaDeNahuales.size()-1), lblNahualAnterior));
            lblNahualActual.setIcon(getIconNahual(listaDeNahuales.get(indice), lblNahualActual));
            lblNahualSiguiente.setIcon(getIconNahual(listaDeNahuales.get(indice+1), lblNahualSiguiente));
        } else if (indice == listaDeNahuales.size()-1){
            lblNahualAnterior.setIcon(getIconNahual(listaDeNahuales.get(indice-1), lblNahualAnterior));
            lblNahualActual.setIcon(getIconNahual(listaDeNahuales.get(indice), lblNahualActual));
            lblNahualSiguiente.setIcon(getIconNahual(listaDeNahuales.get(0), lblNahualSiguiente));
        } else {
            lblNahualAnterior.setIcon(getIconNahual(listaDeNahuales.get(indice-1), lblNahualAnterior));
            lblNahualActual.setIcon(getIconNahual(listaDeNahuales.get(indice), lblNahualActual));
            lblNahualSiguiente.setIcon(getIconNahual(listaDeNahuales.get(indice+1), lblNahualSiguiente));
        }
        txtPaneDescripcion.setText(listaDeNahuales.get(indice).getDescripcion());
        txtPaneSignificado.setText(listaDeNahuales.get(indice).getSignificado());
        lblNombreNahual.setText("Nahual: " + listaDeNahuales.get(indice).getId() + " - " + listaDeNahuales.get(indice).getNombre());
    }
}
