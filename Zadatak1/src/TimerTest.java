import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;



public class TimerTest {
	
	//Timer 1
	private static class TimerHandler implements ActionListener{
		int counter = 0;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(counter++);
		}
		
	}
	
	//Timer 2
	private static class OtherTimerHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Neki string");
		}
		
	}
	
	
		public static void main(String[] args) {
		Timer t  = new Timer(1000, new TimerHandler());
		t.start();
		Timer t2 = new Timer(2000, new OtherTimerHandler());
		t2.start();
	}
		
		
}
