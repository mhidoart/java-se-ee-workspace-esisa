package ma.spotmedia.sento.pos.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class HomeMsgPanel extends JPanel {
	private  JLabel heure;
	private  DateTimeFormatter dtf;
	private Thread t1;
	public HomeMsgPanel() {
		// TODO Auto-generated constructor stub
		init();

	}

	public void init()
	{	heure = new JLabel("");
	dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
	LocalDateTime now = LocalDateTime.now(); 
	heure.setFont(UIManager.getFont("Label.font").deriveFont(Font.BOLD, 48f));
	heure.setText(dtf.format(now).toString());

	setLayout(new BorderLayout());
	add("East",heure);

	t1=new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true)
			{
				synchno();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	});
	t1.start();





	}
	public void synchno()
	{

		Component k= getComponent(0);
		if (k instanceof JLabel)
		{
			JLabel tmp=(JLabel) k;
			LocalDateTime now = LocalDateTime.now();  
			tmp.setText(dtf.format(now).toString());
		}
	}

}
