/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Paquete;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class ImagenPanel  extends JPanel{
   private Image img;
    public ImagenPanel(Image img) {
        this.img=img;
        Dimension dimension=new Dimension(img.getWidth(null),img.getHeight(null));
        this.setPreferredSize(dimension);
        this.setMaximumSize(dimension);
        this.setMinimumSize(dimension);
        this.setSize(dimension);
        this.setLayout(null);
    }
    @Override
    protected void paintComponent(Graphics g){
       g.drawImage(img, 0,0, null);
    }
}

