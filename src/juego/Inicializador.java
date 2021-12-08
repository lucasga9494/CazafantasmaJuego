package juego;


import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;


public class Inicializador {
	
	public static void main (String[] args ) {
		JFrame ventana=new JFrame("cazafantasmas");
		Juego juego=new Juego();
		ventana.add(juego);
		ventana.setSize(1300,400);
		ventana.setLocation(70,200);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(true) {
			juego.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException ex) {
			
				Logger.getLogger(Inicializador.class.getName()).log(Level.SEVERE,null,ex);
				
			}
		}
	}
}
