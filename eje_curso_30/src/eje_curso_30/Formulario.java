
package eje_curso_30;

import javax.swing.*;

@SuppressWarnings("serial")
public class Formulario extends JFrame{
	
	private JTextField text1;
	private JTextArea textarea1;
	
	public Formulario(){
		setLayout(null);
		
		text1 = new JTextField();
		text1.setBounds(10, 10,200, 30);
		add(text1);
		
		textarea1 = new JTextArea();
		textarea1.setBounds(10, 50, 400, 200);
		
		add(textarea1);
		
	}

	public static void main(String[] args) {
		
		Formulario form = new Formulario();
		
		form.setBounds(0, 0, 540, 400);
		form.setVisible(true);
		
	}

}
