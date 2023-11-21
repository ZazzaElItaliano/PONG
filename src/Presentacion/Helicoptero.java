package Presentacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Helicoptero extends JPanel {
	 JLabel label = new JLabel();  
	  GridBagLayout layout = new GridBagLayout();
	    GridBagConstraints config = new GridBagConstraints();
	 public Helicoptero(){
		    
	        this.setLayout(layout);
	        this.setBackground(Color.YELLOW);
	        
	       
	        
	        
	        
	    }
	
	 @Override
	    public void paint(Graphics g){
	        Dimension dimension = this.getSize();
	        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/chicote.jpeg"));
	        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
	        setOpaque(false);
	        super.paintChildren(g);
	    }
}
