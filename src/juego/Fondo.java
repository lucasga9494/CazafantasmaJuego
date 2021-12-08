package juego;



import java.awt.Graphics2D;

import javax.swing.ImageIcon;


public class Fondo  {
	Juego juego;
	
	int anchoFondo=1300;
	int altoFondo=400;
	
	int x1=1300;
	int y1=0;
	
	int x2=0;
	int y2=0;
	
	public Fondo(Juego juego){
		this.juego=juego;
		
	}
	public void paint (Graphics2D g) {
		ImageIcon fondo=new ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"));
		g.drawImage(fondo.getImage(),x1,y1,anchoFondo,altoFondo,null);
		g.drawImage(fondo.getImage(),x2,y2,anchoFondo,altoFondo,null);
		
	}
}
