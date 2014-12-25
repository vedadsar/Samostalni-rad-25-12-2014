import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 * Klasa sa main metodom. U njoj cemo kreirati okvir, i pozivati klasu BouncingBalls da pozovemo loptice.
 * Detaljnije svaku bitnu funkciju/metodu koju sam koristio cu zakomentarisati.
 * Cilj aplikacije je da se dvije loptice pomjeraju u odredjenom smjeru. Ukolik se loptice sudare
 * ili ukoliko udare u zid framea mjenjaju svoj smjer.
 * @author Vedad
 *
 */

public class BouncingBallsPlay extends JPanel{
	
	int frame; 
	
	@Override // Override metoda
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//g.setColor(Color.CYAN);
		//g.fillOval(50+frame, 50+frame, 50, 50); koristeno za vjezbu, prije ove aplikacije
		
	}
		
	
	public static void main(String[] args) {
		JFrame window = new JFrame("Our window"); // kreiramo novi frame i postavljamo ga.
		window.setSize(500, 500);  				  // 
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	
		window.setResizable(false);
		
		// Kreiramo 'objekat' bouncing balls
		BouncingBalls drawingPanel = new BouncingBalls(window.getSize());
		window.setContentPane(drawingPanel); 	// Postavljamo nas objekat ( bouncingBalls) na window.
		
		Timer t = new Timer(50, drawingPanel); // Timer koji svakih 50ms kreira novi event ( drawingPanel)
		t.start(); 							   // Pocetak timera	
		window.setVisible(true);			//Postavljamo vidljivost prozora.	
	}


}
