package eje_curso_28;

import javax.swing.*;

import java.awt.event.*;


public class Formulario extends JFrame implements ActionListener{

	private JButton boton1,boton2,boton3;
	
	public Formulario(){
	   setLayout(null);
	   
	   // Boton 1
	   boton1= new JButton("1");
	   boton1.setBounds(10, 100,90, 30);
	   add(boton1);
	   
	   boton1.addActionListener(this);
	   
	   // Boton 2
	   boton2 = new JButton("2");
	   boton2.setBounds(110, 100, 90, 30);
	   add(boton2);
	   
	   boton2.addActionListener(this);
	   
	   // Boton 3
	   boton3 = new JButton("3");
	   boton3.setBounds(210, 100, 90, 30);
	   add(boton3);
	   
	   boton3.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
		if(arg0.getSource()==boton1){
			
			setTitle("Boton 1");
			
		}
		else if(arg0.getSource()==boton2){
			setTitle("Boton 2");
		}
		else{
			setTitle("Boton 3");
		}
	}
	
	public static void main(String[] args) {
		Formulario form1 = new Formulario();
		
		form1.setBounds(0, 0, 350, 200);
		form1.setVisible(true);

	}	

}
