package accueil;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panelss extends JPanel  implements ActionListener  {
private JButton b1;
private JTextField t1;
	public Panelss(String titre) {
		// TODO Auto-generated constructor stub
		setBackground(Color.GREEN);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		b1=new JButton(titre);
		this.add("North",b1);
		b1.addActionListener(this);
		t1=new JTextField(20);
		this.add("Center",t1);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton bb=new JButton("");
		bb=(JButton)e.getSource();
		bb.setText("mehdi");
		t1.setText("mehdi");
	}

}
