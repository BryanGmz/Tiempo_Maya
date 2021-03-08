/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya.source;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author bryangmz
 */
public class ApiOptionPane {
    
    private static ApiOptionPane instancia;
    
    private ApiOptionPane(){}
    
    public static ApiOptionPane getInstancia(){
        if (instancia == null) {
            instancia = new ApiOptionPane();
        }   return instancia;
    }
    
    public void aplicarDisenio(){
        UIManager.put("Button.foreground", Color.BLACK);
        UIManager.put("Button.background", Color.GRAY);
        UIManager.put("OptionPane.background", new ColorUIResource(52,52,52));
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(204,204,204));
        UIManager.put("Panel.background", new ColorUIResource(52,52,52));
    }
}
