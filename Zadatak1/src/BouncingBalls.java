import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
/**
 * Klasa koja kreira dva kruga ( loptice ) tj. iscrtava ih. U konstuktor samo proslijedjujemo
 * velicinu prozora da bi znali kada loptice treba da se odbijaju. Svaki krug je kreiran iz
 * klase "Circle".  U ovoj klasi implementujemo ActionListener interface da bi mogli kontrolisati
 * loptice da se odbijaju od okvir prozora.
 * @author Vedad
 *
 */

public class BouncingBalls extends JPanel implements ActionListener{
	int frame = 0; 				//integer, broj frameova.
	Circle ourCircle;			// Prvi krug
	Circle ourCircle2;			//Drugi krug
	Dimension windowSize;		//Dimenzije prozora ( okvira )
	
	/**
	 * Konstruktor, prima kao parametar samo dimenzije prozora. 
	 * Sve parametre krugova smo proslijedili direktno u konstuktoru jer ovaj zadatak
	 * koristimo samo kao vjezbu i primjer.
	 * @param windowSize
	 */
	public BouncingBalls (Dimension windowSize){
		 ourCircle = new Circle(100, 100, 100, true, Color.RED,15,10, windowSize);
		 ourCircle2 = new Circle(320,220, 70, false, Color.BLACK,-15,9, windowSize);
		this.windowSize = windowSize;
	}
	
	 
	
	@Override
	/**
	 * Override metoda iz klase JPanel.
	 * U njoj prvo provjeravamo da li se loptice odbijaju ( checkCollision ), prije nego iscrtamo
	 * krugove provjeravamo polozaje dvaju loptica. Nakon toga iscrtavamo krugove.
	 */
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		ourCircle.checkCollision(ourCircle2);
		ourCircle.draw(g);
		ourCircle2.draw(g);
		
	}

	@Override
	/**
	 * Metoda iz ActionListenera, za svaki kreirani event 
	 * (eventi ce se kreirati u tajmeru koji smo postavili u main metodi)
	 * povecava broj frameova i iscrtava novu sliku.
	 */
	public void actionPerformed(ActionEvent e) {
		frame++;
		repaint();
		
	}

}
