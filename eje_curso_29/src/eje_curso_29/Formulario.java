package eje_curso_29;

import javax.swing.*;

import java.awt.event.*;


public class Formulario extends JFrame implements ActionListener {

	private JTextField textfield1;
	private JLabel label1;
	private JButton boton1;
	
	public Formulario(){
		setLayout(null);
		
		label1 = new JLabel("Usuario:");
		label1.setBounds(10,10, 100, 20);
		add(label1);
		
		textfield1 = new JTextField();
		textfield1.setBounds(120, 10, 150, 30);
		add(textfield1);
		
		
		boton1 = new JButton("Aprobar");
		boton1.setBounds(10, 650, 100, 30);	
		
		add(boton1);
		boton1.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource()==boton1){
			
			String cad = textfield1.getText();
			setTitle(cad);
		}
		
	}
	
	public static void main(String[] args) {
	   
		Formulario form1 = new Formulario();
		
		form1.setBounds(0, 0, 1024, 728);
		form1.setVisible(true);
	}

	

}
