package eje_curso_25;

import javax.swing.*;

public class Formulario extends JFrame{
	
	public Formulario(){
		setLayout(null);
	}

	public static void main(String[] args) {
		
		Formulario form = new Formulario();
		form.setBounds(10,20,500, 200);
		form.setVisible(true);
	}

}
