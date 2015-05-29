package eje_curso_38;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.event.*;

@SuppressWarnings("serial")
public class Formulario extends JFrame implements ActionListener, ChangeListener{

	// Components
	private JLabel label1;
	private JCheckBox check1;
	private JButton boton1;
	private JButton btnSalir;
	
	
	// Constructs
	public Formulario(){
		
		setLayout(null);
		
		// Uso de los Componentes
		label1 = new JLabel("¿Está de acuerdo con las normas del servicio?");
		label1.setBounds(10, 10, 500, 30);
		add(label1);
		
		check1 = new JCheckBox("Acepto");
		check1.setBounds(10, 50, 100, 30);
		add(check1);
		check1.addChangeListener(this);
		
		boton1 = new JButton("Continuar");
		boton1.setBounds(10, 100, 150, 30);
		add(boton1);
		boton1.addActionListener(this);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(250, 100, 150, 30);
		add(btnSalir);
		btnSalir.addActionListener(this);
		
		// Inabilitamos el Boton Continuar	
		boton1.setEnabled(false);
		
	}
	

	@Override
	public void stateChanged(ChangeEvent e) {
		
		if(check1.isSelected()==true){
			boton1.setEnabled(true);
		}
		else{
			boton1.setEnabled(false);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton1){
			setTitle("Éxito, pueder Avanzar!");
		}
		if(e.getSource()==btnSalir){
			System.exit(0);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Formulario form = new Formulario();
		
		form.setBounds(0, 0, 640, 400);
		form.setVisible(true);
	}

}
