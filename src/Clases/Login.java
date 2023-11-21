package Clases;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Login extends JPanel {
	
	JLabel label = new JLabel("LOGIN PITOSEOOOO");
	 JButton boton1 = new JButton("Jugar con tus muertos");
    Font fuente = new Font("Comic Sans MS", Font.ITALIC, 40);
   
    public Login() {
    	label.setFont(fuente);
    	  this.setBackground(Color.YELLOW);
    	
    }

   
    public void paint(Graphics g){
        Dimension dimension = this.getSize();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/IMG_2988.jpeg"));
        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
        setOpaque(false);
        super.paintChildren(g);
    }







}
    
    
