package eje_curso_26;

// Importamos el Componente del FORM
import javax.swing.*;

public class Formulario extends JFrame{
	
	private JLabel label1,label2;
	
	public Formulario(){
		
		setLayout(null);
		
		// Mensaje 1
		label1 = new JLabel("Sistema de Facturación");
		label1.setBounds(12, 20, 300, 30);
		add(label1);
		
		// Mensaje 2
		label2 = new JLabel("Versión 0.1");
		label2.setBounds(10,100, 100, 30);
		add(label2);
		
	}

	public static void main(String[] args) {
		Formulario form1 = new Formulario();
		
		// Layout del Formulario
		form1.setBounds(0, 0, 300,200);
		// Desactivamos el Auto Ajuste de Anchos al Formulario
		form1.setResizable(false);
		// Mostrar Formulario
		form1.setVisible(true);
	}

}
