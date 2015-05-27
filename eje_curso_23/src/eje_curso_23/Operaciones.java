/**
 *  - Ejemplo de Herencias (Clase Padre)
 */
package eje_curso_23;

import java.util.Scanner;

public class Operaciones {
	
	protected Scanner teclado;
	
	protected int valor1;
	protected int valor2;
	protected int resultado;
	
	public Operaciones(){
		teclado = new Scanner(System.in);
	}
	
	public void cargarDato1(){
	  System.out.println("Ingrese el Primer Valor:");
	  valor1 = teclado.nextInt();
	}
	
	public void cargarDato2(){
		System.out.println("Ingrese el Segundo Valor:");
		valor2 = teclado.nextInt();
	}
	
	public void mostrarResultado(){
		System.out.println("El Resultado es:"+resultado);
	}

}
