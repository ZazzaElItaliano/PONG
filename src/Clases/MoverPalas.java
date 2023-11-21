package Clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MoverPalas extends KeyAdapter {
	static boolean w, s, arriba, abajo;

    @Override
    public void keyPressed(KeyEvent e) {

        int id = e.getKeyCode();
        
        if (id == KeyEvent.VK_W) {
            w = true;
        }
        if (id == KeyEvent.VK_S) {
            s = true;
        }
        if (id == KeyEvent.VK_UP) {
            arriba = true;
        }
        if (id == KeyEvent.VK_DOWN) {
            abajo = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        int id = e.getKeyCode();
        
        if (id == KeyEvent.VK_W) {
            w = false;
        }
        if (id == KeyEvent.VK_S) {
            s = false;
        }
        if (id == KeyEvent.VK_UP) {
            arriba = false;
        }
        if (id == KeyEvent.VK_DOWN) {
            abajo = false;
        }
    }

}


	
	
	