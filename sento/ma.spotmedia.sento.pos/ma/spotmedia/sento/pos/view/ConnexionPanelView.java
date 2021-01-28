package ma.spotmedia.sento.pos.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;


import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ConnexionPanelView extends JDialog{
	private JTextField login;
	private JPasswordField password;
	public ConnexionPanelView() {
		init();
	}
	public ConnexionPanelView(Frame owner) {


		setTitle("Connexion");
		setSize(572, 199);
		init();
		setLocationRelativeTo(null);
		setResizable(false);
		setModal(true);
		//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setVisible(true);


	
	}
	private void init() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		JPanel panelLogin = new JPanel();
		login = new JTextField();
		login.setPreferredSize(new Dimension(90, 25));
		panel.setBorder(BorderFactory.createTitledBorder("connexion"));
		JLabel userLabel = new JLabel("Username:");
		panelLogin.add(userLabel);
		panelLogin.add(login);
		JPanel panelpass = new JPanel();
		password = new JPasswordField();
		password.setPreferredSize(new Dimension(90, 25));
		JLabel passLabel = new JLabel("Password:");
		panelpass.add(passLabel);
		panelpass.add(password);
		panel.setLayout(new BoxLayout(panel , BoxLayout.Y_AXIS));
		panel.add(panelLogin);
		panel.add(panelpass);
		JPanel fieldPanel = new JPanel();
		fieldPanel.setBackground(Color.white);
		fieldPanel.add(panel);
		getContentPane().add(fieldPanel, BorderLayout.CENTER);
		JPanel panBoutton = new JPanel();
		getContentPane().add(panBoutton, BorderLayout.SOUTH);
		panBoutton.setBackground(Color.white);
		JButton connectBoutton = new JButton("Login");
		connectBoutton.setName("connect");
		panBoutton.add(connectBoutton);
		pack();



	}

}
