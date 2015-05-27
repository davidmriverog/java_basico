package eje_curso_18;

import java.util.Scanner;

public class VectoresParalelos {
	
	private Scanner teclado;
	private String[] nombres;
	private int[] notas;
	
	public void cargarDatos(){
		
		teclado = new Scanner(System.in);
		nombres = new String[3];
		notas = new int[3];
		
		System.out.println("Carga de Nombres y Notas");
		
		for (int i = 0; i < nombres.length; i++) {
			
			System.out.println("Ingrese Nombres:");
			nombres[i] = teclado.next();
			
			System.out.println("Ingrese Nota:");
			notas[i] = teclado.nextInt();
			
			
		}
	}
	
	public void ordenar(){
		
		for (int k = 0; k < notas.length; k++) {
			
			for (int i = 0; i < (notas.length-1) - k; i++) {
			  
			  if(notas[i]<notas[i+1]){
				  
				  int auxnota;
				  
				  auxnota = notas[i];
				  notas[i] = notas[i+1];
				  notas[i+1] = auxnota;
				  
				  String auxNombres;
				  
				  auxNombres = nombres[i];
				  nombres[i] = nombres[i+1];
				  nombres[i+1] = auxNombres;				  				  
			  }
			}
		}
	}
	
	public void imprimirOrdenados(){
		System.out.println("Listado de Alumnos");
		
		for (int l = 0; l < notas.length; l++) {
			
			System.out.println("Nombre:"+nombres[l]+" Nota:"+notas[l]);
		}
	}

	public static void main(String[] args) {
		VectoresParalelos vp = new VectoresParalelos();
		
		vp.cargarDatos();
		vp.ordenar();
		vp.imprimirOrdenados();

	}

}
