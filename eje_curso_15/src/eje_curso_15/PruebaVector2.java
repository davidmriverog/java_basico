package eje_curso_15;

import java.util.Scanner;

public class PruebaVector2 {
	
	private Scanner teclado;
	private float[] turnoManana;
	private float[] turnoTarde;
	
	public void cargarDatos(){
		
		teclado = new Scanner(System.in);
		turnoManana = new float[3];
		turnoTarde = new float[3];
		
		System.out.println("Sueldos Empleado T. Mañana");
		for (int i = 0; i < turnoManana.length; i++) {
			System.out.print("Ingrese Sueldo:");
			turnoManana[i] = teclado.nextFloat();
		}
		
		System.out.println("Sueldos Empleado T. Tarde");
		for (int j = 0; j < turnoTarde.length; j++) {
			System.out.print("Ingrese Sueldo:");
			turnoTarde[j] = teclado.nextFloat();
		}
		
	}
	
	public void calcularGastos(){
		
		float man=0;
		float tard = 0;
		
		for (int h = 0; h < turnoManana.length; h++) {
			man = man + turnoManana[h];
			tard = tard + turnoTarde[h];
		}
		
		System.out.println("T. Monto Sueldo Turno Mañana es:"+man);
		System.out.println("T. Monto Sueldo Turno Tarde es:"+tard);
		
	}
	

	public static void main(String[] args) {
		PruebaVector2 pv2 = new PruebaVector2();
		
		pv2.cargarDatos();
		pv2.calcularGastos();

	}

}
