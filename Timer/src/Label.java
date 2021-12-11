import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label {
	JFrame window;
	JLabel counterLabel;
	Font fontArial = new Font("Arial", Font.PLAIN, 70);	

	String ddSecond; 
	String ddMinute;

	
	public Label(String ddSecond, String ddMinute) {

			
			
			window = new JFrame();
			window.setSize(1000,400);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setLayout(null);
			
			counterLabel = new JLabel("");
			counterLabel.setBounds(100, 50, 200, 100);
			counterLabel.setHorizontalAlignment(JLabel.CENTER);
			counterLabel.setFont(fontArial);
			
			counterLabel.setText(ddMinute + ":" + ddSecond);
			
			
			window.add(counterLabel);
			window.setVisible(true);
			

			}
}
