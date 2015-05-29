package eje_curso_34;

// Importamos Librerias para el Formulario
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class Formulario extends JFrame implements ActionListener{

	private JLabel label1,label2,label3;
	private JComboBox<String> combo1,combo2,combo3;
	private JButton boton1;
	
	public Formulario(){
		
		setLayout(null);
		
		// 1er Combo
		label1 = new JLabel("Rojo:");
		label1.setBounds(10, 10, 100, 30);
		add(label1);
		combo1 = new JComboBox<String>();
		combo1.setBounds(120, 10, 100, 30);
		
		for (int i = 0; i<=255; i++) {
			combo1.addItem(String.valueOf(i));
			
		}
		add(combo1);
		
		// 2do Combo
		label2 = new JLabel("Verde:");
		label2.setBounds(10, 50, 50, 30);
		add(label2);
		
		combo2 = new JComboBox<String>();
		combo2.setBounds(120, 50, 50, 30);
		
		for (int i = 0; i <=255; i++) {
		   combo2.addItem(String.valueOf(i));
		}
		add(combo2);
		
		// 3er Combo
		label3 = new JLabel("Azul:");
		label3.setBounds(10, 90, 100, 30);
		add(label3);
		
		combo3 = new JComboBox<String>();
		combo3.setBounds(120, 90, 50, 30);
		
		for (int i = 0; i <=255; i++) {
			combo3.addItem(String.valueOf(i));
		}
		add(combo3);
		
		// Button
		boton1 = new JButton("Fijar Color");
		boton1.setBounds(10, 130, 150, 30);
		add(boton1);
		
		boton1.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton1){
			
			// Tomamos los datos
			String cad1 = (String)combo1.getSelectedItem();
			String cad2 = (String)combo2.getSelectedItem();
			String cad3 = (String)combo3.getSelectedItem();
			
			int rojo = Integer.parseInt(cad1);
			int verde = Integer.parseInt(cad2);
			int azul = Integer.parseInt(cad3);
			
			// Objeto para el color
			Color color1 = new Color(rojo,verde,azul);
			boton1.setBackground(color1);			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Formulario form = new Formulario();
		
		form.setBounds(0, 0, 600, 400);
		form.setVisible(true);

	}

	

}
