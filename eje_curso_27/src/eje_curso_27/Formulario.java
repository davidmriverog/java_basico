package eje_curso_27;

import javax.swing.*;

import java.awt.event.*;


public class Formulario extends JFrame implements ActionListener {

	JButton boton1;
	
	public Formulario(){
		setLayout(null);
		
		boton1 = new JButton("Finalizar");
		boton1.setBounds(300, 250, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton1){
			
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		
		Formulario form1 = new Formulario();
		
		form1.setBounds(0, 0, 450,350);
		form1.setVisible(true);
	}

}
