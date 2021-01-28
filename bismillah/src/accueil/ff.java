package accueil;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class ff extends JFrame {

	public ff() {
		// TODO Auto-generated constructor stub
		setLocation(new Point(100, 100));
		setSize(new Dimension(500, 500));
		Panelss p =new Panelss("click 1");
		setContentPane(p);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	
	
	public static void main(String[] args) {
		new ff();
	}

}
