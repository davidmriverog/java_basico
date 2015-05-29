/**
 * 
 * Uso de Scroll Panel
 */

package eje_curso_31;

import javax.swing.*;

public class Formulario extends JFrame {

	private JTextField texto;
	private JScrollPane scrollpanel;
	private JTextArea textarea;
	
	public Formulario(){
		
		setLayout(null);
		
		texto = new JTextField();
		texto.setBounds(10,20, 200, 30);
		add(texto);
		
		
		// Aplicamos el Scroll en el Textarea
		textarea = new JTextArea();
		scrollpanel = new JScrollPane(textarea);
		scrollpanel.setBounds(10, 50,400, 200);
		add(scrollpanel);
		
	}
	
	public static void main(String[] args) {
		
		Formulario form = new Formulario();
		
		
		form.setBounds(0, 0, 800, 600);
		form.setVisible(true);
		

	}

}
