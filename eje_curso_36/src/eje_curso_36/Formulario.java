package eje_curso_36;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Formulario extends JFrame implements ActionListener {

	// Componentes
	private JMenuBar barraPrincipal;
	private JMenu menu1,menu2,menu3;
	private JMenuItem mi1,mi2,mi3,mi4,mi5;
	
	public Formulario(){
		setLayout(null);
		
		barraPrincipal = new JMenuBar();
		setJMenuBar(barraPrincipal);
		
		// Menu Opciones
		menu1 =new JMenu("Opciones");
		barraPrincipal.add(menu1);
		
		/* Sub menus */
		
		// Menu Opciones -> Submenu (Tamaño de Ventana)
		menu2 =new JMenu("Tamaño de Ventana");
		menu1.add(menu2);
		// Menu Opciones -> Submenu (Color de Fondo)
		menu3 = new JMenu("Color de Fondo");
		menu1.add(menu3);
		
		
		/* Items de los sub - menus */
		
		// tamaño de ventana
		mi1 = new JMenuItem("640*480");
		menu2.add(mi1);
		mi1.addActionListener(this);
		
		mi2 = new JMenuItem("1024*768");
		menu2.add(mi2);
		mi2.addActionListener(this);
		
		// Color de Fondo
		mi3 = new JMenuItem("Rojo");
		menu3.add(mi3);
		mi3.addActionListener(this);
		
		mi4 = new JMenuItem("Verde");
		menu3.add(mi4);
		mi4.addActionListener(this);
		
		// Salir
		mi5 = new JMenuItem("Salir");
		menu1.add(mi5);
		mi5.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==mi1){ // tamaño de ventanas
			setSize(640,480);
		}
		else if(e.getSource()==mi2){
			setSize(1024,768);
		}
		else if(e.getSource()==mi3){ // color para el contenedor
			getContentPane().setBackground(new Color(255,0,0));
		}
		else if(e.getSource()==mi4){
			getContentPane().setBackground(new Color(0,255,0));
		}
		else if(e.getSource()==mi5){ // salir
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		
		Formulario form = new Formulario();
		
		
		form.setBounds(0, 0, 300, 200);
		form.setVisible(true);

	}

	

}
