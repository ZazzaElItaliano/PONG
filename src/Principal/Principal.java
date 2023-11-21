package Principal;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

import Clases.Pantalla;  //Importamos la clase pantalla

public class Principal extends JFrame {
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pantalla pantalla1= new Pantalla(); //Creamos el objeto ventna 
		
		pantalla1.setVisible(true); //Ponemos la ventana visible
		pantalla1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para que cuando le demos al simbolo de cerrar pestaña la ejecucion se detenga 
		
		/*try {
			Clip sonido=AudioSystem.getClip();
			sonido.open(AudioSystem.getAudioInputStream(new File("src/Audios/jazz.wav")));
			sonido.start();
			while(sonido.isRunning())
				Thread.sleep(1000);
			sonido.close();
		} catch (Exception e) {
			System.out.println("no se");
		}*/
		
		
		
		
	}

}
