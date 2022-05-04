package com.dou.ud20.t2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author joseporiollopezbosch / David Dalmau / Octavio Bernal
 *
 */

public class Exercise2 implements ActionListener{

	private JFrame frame;
	private JLabel lblPrincipal;
	private JButton btn1;
	private JButton btn2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise2 window = new Exercise2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercise2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Creating elementos
		frame = new JFrame();
		btn1 = new JButton("Boton1");
		lblPrincipal = new JLabel("Has pulsado: ");
		btn2 = new JButton("Boton2");
		
		//Seting params
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblPrincipal.setBounds(19, 16, 162, 16);
		btn1.setBounds(193, 11, 117, 29);
		btn2.setBounds(322, 11, 117, 29);	
		
		//ActionListeners
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		//Adding to contentPane
		frame.getContentPane().add(lblPrincipal);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
		
	}
	//Override to control the click events
	@Override
	public void actionPerformed(ActionEvent e) {
		//Geting info from the event
		JButton btnPress = (JButton)e.getSource();
		//Getting the text of the widget
		String name = btnPress.getText();
		//Switching the acction request
		switch(name) {
			case "Boton1":
				lblPrincipal.setText("Has pulsado: ");
				lblPrincipal.setText(lblPrincipal.getText()+" "+ btn1.getText().toString());
				break;
			case "Boton2":
				lblPrincipal.setText("Has pulsado: ");
				lblPrincipal.setText(lblPrincipal.getText()+" "+ btn2.getText().toString());
				break;
		}
	}
	
}
