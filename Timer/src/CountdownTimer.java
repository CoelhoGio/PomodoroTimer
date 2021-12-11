import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
import java.text.DecimalFormat;



public class CountdownTimer {

	DecimalFormat dFormat = new DecimalFormat("00");
	String ddSecond; 
	String ddMinute;
	




	public void countdownTimer(int minute, int second) {



		Timer countdownTimer = new Timer(1000, new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
  
				second--;
				ddSecond = dFormat.format(second);
				ddMinute = dFormat.format(minute);	


				if(second==-1) {
					second = 59;
					minute--;
					ddSecond = dFormat.format(second);
					ddMinute = dFormat.format(minute);	
					
				}
			


			}
		});
	}





	public void start() {
		
		
	}
}
