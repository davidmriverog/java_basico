/**
 * - Constructor de la clase
 */
package eje_curso_20;

import java.util.Scanner;

public class Operador {
	
	private Scanner teclado;
	private float[] sueldos;
	
	// Metodo Contructor
	public Operador() {
	   teclado = new Scanner(System.in);
	   sueldos= new float[3];
	   
	   for (int i = 0; i < sueldos.length; i++) {
		 System.out.print("Ingrese Valor:");
		 sueldos[i] = teclado.nextFloat();
	   }
	}
	
	public void imprimir(){
		
		for (float f : sueldos) {
			System.out.println("Sueldo:"+f+"\n");
		}
		
	}

	public static void main(String[] args) {
		Operador op = new Operador();
		
		op.imprimir();

	}

}
