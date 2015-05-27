package eje_curso_19;

import java.util.Scanner;

public class Matrices {
	
	private Scanner teclado;
	private int[][] matriz;
	
	public void cargarDatos(){
		
		teclado = new Scanner(System.in);
		matriz = new int[3][5];
		
		// Fila
		for (int f = 0; f < 2; f++) {
			// Columna
			for (int c = 0; c < 3; c++) {
				System.out.print("Ingrese Valor F"+(f+1)+"C"+(c+1)+":");
				matriz[f][c] = teclado.nextInt();
				
			}
		}
	}
	
	public void imprimirMatriz(){
		// Fila
		for (int f = 0; f < 2; f++) {
		   System.out.print("|");
		   // Columna
		   for (int c = 0; c < 3; c++) {
			   System.out.print(""+matriz[f][c]+"");
			   if (c!=3-1) {
				  System.out.print("\t");
			   }
			}
		   System.out.println("|");
		}
	}
	
	public static void main(String[] args) {
		Matrices matriz = new Matrices();
		
		matriz.cargarDatos();
		matriz.imprimirMatriz();

	}

}
