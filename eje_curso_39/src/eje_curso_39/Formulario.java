/**
 * 
 * - Swing - JRadioButton
 */

package eje_curso_39;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

@SuppressWarnings("serial")
public class Formulario extends JFrame implements ChangeListener, ActionListener {

	// Components
	private JRadioButton radio1,radio2,radio3;
	private ButtonGroup btnGroups;
	
	private JButton btnSalir;
	
	
	
	// Constructs
	public Formulario(){
		
		setLayout(null);
		setTitle("El Programador Llanero");
		
		btnGroups = new ButtonGroup();
		
		// OptionButton 1
		radio1 = new JRadioButton("640*480");
		radio1.setBounds(10,20, 100, 30);
		add(radio1);
		btnGroups.add(radio1);
		
		// OptionButton 2
		radio2 = new JRadioButton("800*600");
		radio2.setBounds(10,70, 100, 30);
		radio2.addChangeListener(this);
		add(radio2);
		btnGroups.add(radio2);
				
		// OptionButton 3
		radio3 = new JRadioButton("1024*728");
		radio3.setBounds(10,120, 100, 30);
		radio3.addChangeListener(this);
		add(radio3);
		btnGroups.add(radio3);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(10, 150, 250, 40);
		add(btnSalir);
		btnSalir.addActionListener(this);
		
	}
	

	@Override
	public void stateChanged(ChangeEvent e) {
		
		if(radio1.isSelected()){
			setSize(640,480);
		}
		if(radio2.isSelected()){
			setSize(800, 600);
		}
		if(radio3.isSelected()){
			setSize(1024, 728);
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSalir){
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		
		Formulario form = new Formulario();
		
		form.setBounds(0, 0, 400, 300);
		
		form.setVisible(true);

	}


	

}
