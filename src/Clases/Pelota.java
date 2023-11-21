package Clases;

import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;

public class Pelota {

	public int x,y, ancho=26, alto=26, sumax=1,sumay=1;  //suma es el valor que se le va a sumar a la psoicion x e y de la pelota para que se vaya moviendo
	public int puntos1=0, puntos2=0;
	public static 	boolean FinalJuego=false;
	public Pelota(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Ellipse2D getPelota() {
		return new Ellipse2D.Double(x, y, ancho, alto);
	}
	
	
	//aqui lo que estamos haciendo es calcular el tamaño maximo del Jpanel con el objeto Rectangle  poir que si queremos que la pelota rebote en el eje x y eje y tenemos que saber el tamañomaximo que alcanza
	public void MoverPelota(Rectangle limites, boolean colisionp1, boolean colisionp2) {
		//estamos haciendo que para que la bola se mueva le vamos sumando 1 cada vez que se mueva, al empezar en el 0,0 ira 1,1 2,2 etc
		x+=sumax;
		y+=sumay;
		
		if(colisionp1==true) {
			sumax=-sumax;
			x=25;
		}
		
		if(colisionp2==true) {
			sumax=-sumax;
			x=795;
		}
		// aqui le decimos que si la pelota supera el tamaño maximo del eje x e y , se le vaya restando 1 posicion al eje x , es decir "rebotara" y pasara a mover de dcha a izq en vez de izq dcha
		if(x>limites.getMaxX()) {
			puntos1++;
			x=(int) limites.getCenterX();
			y=(int)limites.getCenterY();
			
			sumax=-sumax;
		}
		
		if(y>limites.getMaxY()) {
		
			sumay=-sumay;
			
		}
	
		//aqui pasa al contrario que arriba si la pelota llega a la minima posicion de los ejes(0,0), tendra que volver a rebotar ya que sino desapareceria del Jpanel y Jframe y moverse de izq a dcha en vez de dcha izq
		
		if(x<0) {	
			puntos2++;
			sumax=-sumax;
			x=(int) limites.getCenterX();
			y=(int)limites.getCenterY();
		}
		if(y<0) {
			sumay=-sumay;
		}
	
	
	
	}
	
	public int puntuacionJUG1() {
		return puntos1;
	}
	
	public int puntuacionJUG2() {
		return puntos2;
	}
}
