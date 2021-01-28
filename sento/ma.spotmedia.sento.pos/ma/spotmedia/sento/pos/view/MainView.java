package ma.spotmedia.sento.pos.view;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame {
private ConnexionPanelView connexion;
private JPanel p1;
private HomeMsgPanel sectionf;
	public MainView() {
		
		connexion =new ConnexionPanelView(this);
		
		setTitle("HOME");
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	public void init()
	{sectionf=new HomeMsgPanel();
		p1=new JPanel();
		p1.setLayout(new BorderLayout());
		p1.add("North",sectionf );
	
		setContentPane(p1);
	}

}
