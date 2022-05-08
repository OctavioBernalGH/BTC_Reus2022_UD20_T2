<table>
 <tr>
    <td> <img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
    <td><h1>Ejercicio UD20 T02</h1></td>
  
 </tr>
</table>
 
 [comment]: <> (<img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/><br>)
 
<hr>
 
 [comment]: <> (### Ejercicios SQL Unidad UD16<hr>)

[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white&labelColor=101010)]()
[![GitHub](https://img.shields.io/badge/GITHUB-%20-yellow)]()
<br>
Este ejercicio ha sido realizado por los miembros del equipo 1. Dicho equipo esta formado por:

  [- J.Oriol López Bosch](https://github.com/mednologic)<br>
  [- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
  [- David Dalmau](https://github.com/DavidDalmauDieguez)
  
En este ejercicio se deberá crear una aplicación gráfica mediante JFrameForm que contenga una etiqueta y dos botones de operación. Al pulsar dichos botones se deberá reflejar en el texto de la etiqueta cuál es el último botón que el usuario ha pulsado.

En la siguiente imagen se podrá observar de forma gráfica el funcionamiento de los botones con la label.

![UD20-T2](https://user-images.githubusercontent.com/103035621/167310936-250698e6-44bd-4032-b76c-dc0e0f3d856a.png)

<p align="justify">Para realizar este ejercicio de la forma más simple y reducida se ha utilizado una sola clase llamada Exercise2.java mediante la tecnología de estructura de proyecto de Maven. En esta clase se definen los componentes que forman la vista, se les cambia el nombre de componente y se crea el actionListener utilizado para los eventos de los botones y la label.</p>

<details>
  <summary>En este spoiler se muestra el código creado en la Clase CartaClass.java</summary>
<br>

  ```java
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

  ```
 </details>

