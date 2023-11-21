package Clases;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Pantalla extends JFrame  {
	
	public Tablero lienzo;
	
	
	

	int alto=1000, ancho=700;
	
	public Hilos hilo;
	
	public Pantalla() {
		
		MoverPalas mover1=new MoverPalas();
		
		setTitle("P O N G ");
		setSize(alto,ancho);
		setLocationRelativeTo(null);
		setResizable(true);	
		lienzo= new Tablero();
		add(lienzo);
		
		addKeyListener(mover1);
		hilo=new Hilos(lienzo);
		hilo.start();
	
		
	
	}

	
		
	


	

	
	
}
