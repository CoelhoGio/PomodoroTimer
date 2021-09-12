import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Timer {
	
	JFrame window = new JFrame();
	JLabel counterLabel = new JLabel();
	Font font1 = new Font("calibri", Font.PLAIN , 70);
	
	public Timer(int w, int h) {
		
			
		window = new JFrame();
		window.setSize(w, h);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		
		counterLabel = new JLabel("this");
		counterLabel.setBounds(300, 230, 200, 100);
		counterLabel.setHorizontalAlignment(JLabel.CENTER);
		counterLabel.setFont(font1);
		
		window.add(counterLabel);
		window.setVisible(true);
	}
}
