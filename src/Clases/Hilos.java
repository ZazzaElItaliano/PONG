package Clases;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Hilos extends Thread  {

	Tablero lienzo;
	Pelota pelota = new Pelota(0,0);
	public Hilos (Tablero lienzo) {
		this.lienzo=lienzo;
	}
	
	
	@Override
	public void run() {
		while(!Pelota.FinalJuego) {
			lienzo.repaint();
			  try {
	                Thread.sleep(2);
	            } catch (InterruptedException ex) {
	                Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
	            }
	            
	          
	        }
	    }
	
	}
	
	
	
	

