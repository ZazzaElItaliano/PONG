package Presentacion;



import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ppal extends JFrame{
	
	creditos creditos=new creditos();
	 GridBagLayout layout = new GridBagLayout();
	Helicoptero helicoptero=new Helicoptero();
	GridBagConstraints config = new GridBagConstraints();
	 JButton boton1 = new JButton("Creditos");
	
	 
	 public Ppal() {
		 
		 this.setSize(600, 600); 
	        this.setLocationRelativeTo(null);  
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       
	        this.setLayout(layout);  
	this.setLayout(layout);
		
		
		
		
	  config.gridx=0;
       config.gridy=0;
       config.gridwidth=2;
       config.gridheight=1;
       config.weightx=1.0;
       config.weighty=1.0;
       config.anchor=GridBagConstraints.CENTER;
       config.fill= GridBagConstraints.BOTH;
        add(helicoptero,config);  
        add(creditos,config);
    
	
       config.gridx=0;
       config.gridy=1;
       config.gridwidth=1;
       config.gridheight=1;
       config.ipadx=100;
       config.ipady=10;
       config.weighty=0.0;
       config.anchor=GridBagConstraints.CENTER;
       config.fill= GridBagConstraints.CENTER;
		add(boton1, config);
       
		helicoptero.setVisible(true);
		creditos.setVisible(false);
		
		boton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(helicoptero.isVisible()) {
					creditos.setVisible(true);
					boton1.setVisible(false);
					helicoptero.setVisible(false);
					validate();
				}
				
			}
			
		});
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ppal frame=new Ppal();
		frame.setVisible(true);
	}

}
