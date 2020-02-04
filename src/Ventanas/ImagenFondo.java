/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;

/**
 *
 * @author User
 */
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.*;
import javax.swing.border.*;

public class ImagenFondo implements Border{
  public BufferedImage back;

    public ImagenFondo(String rut) {
        try{
         //URL imagePath=new URL(getClass().getResource("../Imagenes/logo.png").toString());
            URL imagePath=new URL(getClass().getResource("../Imagenes/"+rut).toString());
         back=ImageIO.read(imagePath);
        }
        catch(Exception ex){}
    }
    public void paintBorder(Component c,Graphics g,int x,int y,int width,int heigth){
     //g.drawImage(back, (x+(width-back.getWidth())/2), (y+(heigth-back.getHeight())/2), Color.yellow, c);
      g.drawImage(back, (x+(width-back.getWidth())/2), (y+(heigth-back.getHeight())/2), c);  
    }
    public Insets getBorderInsets(Component c){
      return new Insets(0,0,0,0);
    }
    public boolean isBorderOpaque(){
      return false;
    }
}
