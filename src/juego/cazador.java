package juego;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;



public class cazador {
	Juego juego;
	static boolean saltando=false;
	boolean sube=false;
	boolean baja=false;
	

	
	int anchoCazador=30;
	int altoCazador= 80;
	
	static int x_inicial=50;
	static int y_inicial=270;
	
	int x_auxiliar=0;
	int y_auxiliar=0;
	
	
	
	public cazador(Juego juego){
		this.juego=juego;
		
	}
	public void paint(Graphics2D g) {
		ImageIcon cazador=new ImageIcon(getClass().getResource("/Imagenes/cazadorCor.jpg"));
		g.drawImage(cazador.getImage(),x_inicial,y_inicial,anchoCazador,altoCazador,null);
		
	}
	public void keyPressed(KeyEvent e ){
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			saltando=true;
			
		}
	}
}
