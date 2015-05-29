/**
 * 
 * - Swing - JCheckBox
 */
package eje_curso_37;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

@SuppressWarnings("serial")
public class Formulario extends JFrame implements ChangeListener, ActionListener{

	// Components
	private JCheckBox check1,check2,check3;
	private JButton boton;
	
	// Construct
	public Formulario(){
		
		setLayout(null);
		
		check1 = new JCheckBox("Inglés");
		check1.setBounds(10, 10, 150, 30);
		check1.addChangeListener(this);
		add(check1);
		
		check2 = new JCheckBox("Francés");
		check2.setBounds(10,50,150,30);
		check2.addChangeListener(this);
		add(check2);
		
		
		check3 = new JCheckBox("Alemán");
		check3.setBounds(10,90,150,30);
		check3.addChangeListener(this);
		add(check3);
		
		boton = new JButton("Salir");
		boton.setBounds(10, 120, 150, 20);
		add(boton);
		
		boton.addActionListener(this);
	}
	

	// Event
	
	@Override
	public void stateChanged(ChangeEvent arg0) {
		
		String cad = "";
		
		
		if (check1.isSelected()==true) {
			cad = cad +"Inglés-";
		}
		if(check2.isSelected()==true){
			cad = cad + "Francés-";
		}
		if(check3.isSelected()==true){
			cad = cad + "Alemán";
		}
		setTitle(cad);
		
	}
	
	//Event Button
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getSource()==boton) {
			System.exit(0);
		}
	}

	
	// Main
	public static void main(String[] args) {
		
		Formulario form = new Formulario();
			
		form.setBounds(0, 0, 640,400);
		form.setVisible(true);

	}


	
}
