package eje_curso_33;

import javax.swing.*;

import java.awt.event.*;


@SuppressWarnings("serial")
public class Formulario extends JFrame implements ItemListener{
	
	private JComboBox<String> combo1;
	
	public Formulario(){
		setLayout(null);
		
		combo1 = new JComboBox<String>();
		combo1.setBounds(10, 10, 80, 20);
		add(combo1);
		
		// Llenamos el Combo Estaticamente
		combo1.addItem("David Rivero");
		combo1.addItem("Leyla Rivero");
		combo1.addItem("Davidmar Rivero");
		
		// Accion
		combo1.addItemListener((ItemListener) this);
	}

	
	@Override
	public void itemStateChanged(ItemEvent a) {
		
		if(a.getSource()==combo1){
			
			String seleccionado = (String) combo1.getSelectedItem();
			
			setTitle(seleccionado);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Formulario form = new Formulario();
		
		form.setBounds(0, 0, 200, 150);
		form.setVisible(true);
	}

	

}
