/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package launcher;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Sergio Tark
 */
public class Tools {


public static void SetImageLabel(JLabel labelName, String root) {
        
        ImageIcon image = new ImageIcon(root);
        Image img = image.getImage(); //Obtener la imagen como objeto image
        
        //Obtención del tamaño del jlabel
        int labelWidth = labelName.getWidth();
        int labelHeight = labelName.getHeight();
        
        
        
        
        
        Icon icon = new ImageIcon( img.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
    }
    

 public static void SetImageLabel(JLabel labelName, String root, Dimension dimension){
        
        ImageIcon image = new ImageIcon(root);
        Image img = image.getImage();
        
        int targetWidth = dimension.width;
        int targetHeight = dimension.height;
       
        
        
        Icon icon = new ImageIcon (
                img.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH)
                    
        );
    labelName.setIcon(icon);
    
    }

  

    
}
