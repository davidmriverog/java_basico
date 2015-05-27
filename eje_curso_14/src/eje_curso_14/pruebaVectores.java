package eje_curso_14;

import java.util.Scanner;

public class pruebaVectores {
	
	private Scanner teclado;
	private float[] sueldos;
	
	public void cargarDatos(){
		
		teclado = new Scanner(System.in);
		
		sueldos = new float[3];
		
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println("Ingrese Sueldo"+(i+1)+":");
			sueldos[i] =  teclado.nextFloat();
		}
	}
	
	public void imprimirResultados(){
		
		for (int j = 0; j < sueldos.length; j++) {
			System.out.println("El Sueldo de la POS:"+(j+1)+" es:"+sueldos[j]);
		}
	}

	public static void main(String[] args) {
		
		pruebaVectores pv = new pruebaVectores();
		
		pv.cargarDatos();
		pv.imprimirResultados();
	}

}
