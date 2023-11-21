package Clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;


public class Tablero extends JPanel {

	Pelota pelota1=new Pelota(0,0); //Creamos un objeto de la clase pelota y le pasamos los parametros de donde aparecera la pelota(x,y)
	Palas pala1=new Palas(10,200); //creamos un objeto de la clase palas y le pasamos al constructor los parametros donde debe aparecer dejando espacios entre el eje x e y 
	Palas pala2=new Palas(954, 461);//Lo mismo de arriba, el porque de esos valores está más abajo
	
	public Tablero() {
		
		setBackground(Color.pink); //Establecemos el color de fondo del Jframe
	}
	
	@Override        //sobreescribimos el metodo puesto que se hereda de la clase padre paint  
	
	public void paint(Graphics g) { //La clase graphics no se puede usar directamente, por lo que tenemos que usar la calse   paint y pasarle como argumento la clase graphics 
		super.paint(g); // estamos llamando al metodo padre (Graphics), de la clase paint 
		Graphics2D graficos=(Graphics2D)g; 
		graficos.setColor(Color.darkGray); //Color del ovalo que hemos dibuhado	// Aqui estamos instanciando la clase graphics2d a partir de la clase Graphics (que tiene + funcionalidades que la clase graphics base) 		
		dibujar(graficos); // usamos el metodo creado abajo para dibujar la pelota 
		ActPelota();
		Marcador(graficos);
		
	}

	public void dibujar(Graphics2D g) { //Creamos metodo para dibujar la pelota
	
	g.fill(pelota1.getPelota()); // para crear el metodo hemos usado en la clase Pelota la clase elipse, para dibujar una elipse que se parezca a un balon
	 // lo mismo de arriba pero con el eje y 
	  Line2D.Double linea = new Line2D.Double(getBounds().getCenterX(), 0, getBounds().getCenterX(), getBounds().getMaxY());
      g.draw(linea);
	g.fill(pala1.palas());
	g.fill(pala2.palas());
	}
// para crear la segunda pala necesito saber los limites del jPanel puesto que esta en el extremo derecho de la pantalla, para hacer la primera no es necesario puesto  que empezaria en el 0,0 y basta con decirle cuanto espacio queremos entre eje x y eje y 
	
	public void ActPelota() {
		pelota1.MoverPelota(getBounds(), impacto(pala1.palas()), impacto(pala2.palas()));
		pala1.Moverp1(getBounds());
		pala2.Moverp2(getBounds());

	}


	// con este metodo detectamos cuando la pelota (obteniendo su valor con el metodo get) colisiona con las palas, usando el metodo inteserct
public boolean impacto(Rectangle2D pala) {
	return pelota1.getPelota().intersects(pala);
}

public void Marcador (Graphics2D g) {
	
	 Graphics2D g1=g, g2=g;
	 
	 Font puntuacion = new Font("Arial", Font.BOLD, 30);
     g.setFont(puntuacion);
	
	 g1.drawString(Integer.toString(pelota1.puntuacionJUG1()), (float) getBounds().getCenterX() - 50, 30);
     g2.drawString(Integer.toString(pelota1.puntuacionJUG2()), (float) getBounds().getCenterX() + 25, 30);
     if (pelota1.puntuacionJUG1() == 5) {
         g.drawString("GANÓ El JUGADOR 1", (float) getBounds().getCenterX() - 155, (float) getBounds().getCenterY() - 100);
         pelota1.FinalJuego= true;
     }
     if (pelota1.puntuacionJUG2() == 5) {
         g.drawString("GANÓ EL JUGADOR 2", (float) getBounds().getCenterX() - 155, (float) getBounds().getCenterY() - 100);
         pelota1.FinalJuego = true;
     }
     
 }









}