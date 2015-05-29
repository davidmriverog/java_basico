package eje_curso_32;

import javax.swing.*;

import java.awt.event.*;

@SuppressWarnings("serial")
public class Formulario extends JFrame implements ActionListener{
	
	// Components
	private JScrollPane scrollpanel;
	private JTextArea textarea1;
	private JButton boton1;
	

	// Construct
	public Formulario(){
		setLayout(null);
		
		textarea1 = new JTextArea();
		scrollpanel = new JScrollPane(textarea1);
		scrollpanel.setBounds(10, 10, 300, 200);
		add(scrollpanel);
		
		boton1 = new JButton("Verificar");
		boton1.setBounds(10, 260, 100, 30);
		add(boton1);
		
		boton1.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton1){
			
			// Capturamos los valores del textArea
			
			String text = textarea1.getText();
			
			if(text.indexOf("Venezuela")!=-1){
				setTitle("Si Contiente el  texto");	
			}
			else{
				setTitle("No Contiente el  texto");	
			}
				
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Formulario form = new Formulario();
		
		form.setBounds(0, 0, 400, 380);
		form.setVisible(true);

	}

}
