package juego;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

import javax.swing.JPanel;


public class Juego extends JPanel {

	/**
	 * 
	 */

	// sonido del juego
	URL direccionSonidoSalto,direccionSonidoColision;
	AudioClip SonidoColision,sonidoSalto;
	
	//objetos de las clases cazador,fondo, y enemigo
	cazador cazador=new cazador(this);
	Fondo fondo=new Fondo(this);
	Enemigo enemigo=new Enemigo(this);
	
	
	//variables para el juego
	static boolean juegoFinalizado=false;
	static boolean perderVida=false;
	static int vidas=3;
	static int nivel=1;
	static int puntos=0;
	
	
	
	public Juego() {
	 
		direccionSonidoColision=getClass().getResource("Imagenes/explosion");
	   SonidoColision=Applet.newAudioClip(direccionSonidoColision);
	   
	   direccionSonidoSalto=getClass().getResource("/Imagenes/cazadorCor");
	   sonidoSalto=Applet.newAudioClip(direccionSonidoSalto);
	   
	   addKeyListener(new KeyListener() {

		@Override
		public void keyTyped(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_SPACE) {
				sonidoSalto.play();
				cazador.keyPressed(e);
				
			
			
			}	}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		   
	   });
	   setFocusable(true);
	   
	   
	   
	}

	
	public void paintComponent(Graphics2D g) {
		super.paintComponents(g);
		Graphics2D g2=(Graphics2D)g;
		dibujar(g2);
		dibujarPuntaje(g2);
		
	}
	public void dibujar(Graphics2D g) {
		fondo.paint(g);
		cazador.paint(g);
		enemigo.paint(g);
		
		
	}
	public void dibujarPuntaje(Graphics2D g) {
		Graphics2D g1=g,g2=g;
		Font score=new Font("Arial",Font.BOLD,30);
		g.setFont(score);
		g.setColor(Color.blue);
		g1.drawString("Puntaje: "+puntos,1100,30);
		g1.drawString("Vidas: "+vidas,1100,30);
		g1.drawString("Nivel: "+nivel,570,30);
		
		if(juegoFinalizado) {
			g2.setColor(Color.red);
			
		}
		
		
	}


	
	
}
