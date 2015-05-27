package eje_curso_16;

import java.util.Scanner;

public class vectorMayor {
	
	private Scanner teclado;
	private String[] nombres;
	private float[] sueldos;
	
	public void cargarDatos(){
		
		teclado = new Scanner(System.in);
		
		nombres = new String[3];
		sueldos = new float[3];
		
		for (int i = 0; i < sueldos.length; i++) {
			
			System.out.print("Ingrese Nombre Empleado(a):");
			nombres[i] = teclado.next();
			
			System.out.print("Sueldo:");
			sueldos[i] = teclado.nextFloat();			
			
		}
	}
	
	public void calcularMayorSueldo(){
		
		float mayor;
		int pos;
		
		mayor= sueldos[0];
		pos = 0;
		
		for (int h = 0; h < sueldos.length; h++) {
			
			if (sueldos[h]>mayor) {
				mayor = sueldos[h];
				pos= h;
			}
		}
		
		System.out.println("esta en la posición:"+pos);
		System.out.println("El monto Mayor es:"+mayor);
			
	}

	public static void main(String[] args) {
		
		vectorMayor vm = new vectorMayor();
		
		vm.cargarDatos();
		vm.calcularMayorSueldo();

	}

}
