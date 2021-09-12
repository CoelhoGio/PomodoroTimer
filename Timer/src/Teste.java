import javax.swing.JFrame;

public class Teste {
	
	JFrame window = new JFrame();
	
	
	public Teste(int w, int h) {
		
			
		window = new JFrame();
		window.setSize(w, h);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		
		window.setVisible(true);
	}
}
