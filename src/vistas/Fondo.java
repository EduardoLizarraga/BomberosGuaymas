package vistas;



import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;


public class Fondo implements Border {
public BufferedImage back;
    public Fondo (String nombre) {
    try{
    URL path= new URL(getClass().getResource("../Fondo/"+nombre+".jpg").toString());
    back= ImageIO.read(path);
}catch(Exception e){
    
}
}

    
@Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(back,(x +(width- back.getWidth())/2),(y+ (height-back.getHeight())/2),null);
    }

    @Override
    public Insets getBorderInsets(Component cmpnt) {
        return new Insets(0,0,0,0);
        
    }

    @Override
    public boolean isBorderOpaque() {
       return false;
    }}
    
