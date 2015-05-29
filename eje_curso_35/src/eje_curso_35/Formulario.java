/**
 * 
 * - Swing - JMenuBar, JMenu, JMenuItem
 */
package eje_curso_35;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Formulario extends JFrame implements ActionListener {

	// Components
	private JMenuBar mb;
	private JMenu menu1;
	private JMenuItem mi1,mi2,mi3,mi4;
	
	
	public Formulario(){
	   setLayout(null);
	   
	   // Menu Principal
	   mb = new JMenuBar();
	   setJMenuBar(mb);	   
	   menu1 = new JMenu("Opciones");
	   mb.add(menu1);
	   
	   // Items 1 (Opciones - Rojo)
	   mi1 = new JMenuItem("Rojo");
	   mi1.addActionListener(this);
	   menu1.add(mi1);
	   // Items 2 (Opciones - Verde)
	   mi2 = new JMenuItem("Verde");
	   mi2.addActionListener(this);
	   menu1.add(mi2);
	   // Items 3 (Opciones - Azul)
	   mi3 = new JMenuItem("Azul");
	   mi3.addActionListener(this);
	   menu1.add(mi3);
	   // Items 4 (Opciones - Salir)
	   mi4 = new JMenuItem("Salir");
	   mi4.addActionListener(this);
	   menu1.add(mi4);
	   
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Container content = this.getContentPane();
		
		if(e.getSource()==mi1){
			
			// si es rojo
			setTitle("Seleccionaste el Color Rojo");
			content.setBackground(new Color(255,0,0));
		}
		else if(e.getSource()==mi2){
			setTitle("Seleccionaste el Color Verde");
			content.setBackground(new Color(0,255,0));
		}
		else if(e.getSource()==mi3){
			setTitle("Seleccionaste el Color Azul");
			content.setBackground(new Color(0,0,255));
		}
		else if(e.getSource()==mi4){
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		
		Formulario form = new Formulario();
		
		form.setBounds(10, 20, 300, 200);
		form.setVisible(true);
	}
	

}
