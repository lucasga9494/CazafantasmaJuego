package juego;



import java.awt.Graphics2D;

import javax.swing.ImageIcon;

public class Enemigo {

	Juego juego;
	int anchoEnemigo=50;
	int altoEnemigo=50;
	
	static int x_inicial=1300;
	static int y_inicial=270;
	
	static int x_auxiliar=-4;
	
	public Enemigo(Juego juego){
		this.juego=juego;
		
		
		
		
		
	}
	public void paint (Graphics2D g ) {
		ImageIcon enemigo=new ImageIcon(getClass().getResource("/Imagenes/monstruoCor.jpg"));
		g.drawImage(enemigo.getImage(),x_inicial,y_inicial,anchoEnemigo,altoEnemigo,null);
		
	}
}
