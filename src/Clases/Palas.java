package Clases;

import java.awt.Rectangle;

import java.awt.geom.Rectangle2D;

public class Palas extends MoverPalas {

	MoverPalas mover= new MoverPalas();
	
	//declaramos donde va a aparecer las palas en el eje x e y y las medidas de las palas
	public int x, y, ancho=15, alto=60;
	
	//Declaramos el constructor
	public Palas(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	//creamos un metodo para que nos devuelva las palas 
	public Rectangle2D palas() {
		
		return new Rectangle2D.Double(x, y, ancho, alto);
		
	}
	
	 public void Moverp1(Rectangle limites) {
	        if (mover.w && y > limites.getMinY()) {
	            y--;
	        }
	        if (mover.s && y < limites.getMaxY()) {
	            y++;
	        }
	    }

	    public void Moverp2(Rectangle limites) {
	        if (mover.arriba && y > limites.getMinY()) {
	            y--;
	        }
	        if (mover.abajo && y < limites.getMaxY()) {
	            y++;
	        }
	
	
	    }
	
}
