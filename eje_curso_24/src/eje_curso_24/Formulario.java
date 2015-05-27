/**
 * - Formularios en Java (Interfaz Gráfica)
 */
package eje_curso_24;

import javax.swing.*;

public class Formulario  extends JFrame{
	// label - Mensaje
	private JLabel label1;
	
	public Formulario(){
		// Capa
		setLayout(null);
		
		// Inicializamos el valor del Label
		label1 = new JLabel("Hola Mundo esta es mi primera Interfaz en Java");
		label1.setBounds(10, 20, 400, 30);
		add(label1);
	}
	

	public static void main(String[] args) {
	
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(10,10,400, 300);
		formulario1.setVisible(true);
		
	}

}
