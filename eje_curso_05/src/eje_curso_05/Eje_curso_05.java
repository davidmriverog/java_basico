/*
 * - Estructura repetitiva while
 */
package eje_curso_05;

import java.util.Scanner;

/**
 *
 * @author davidmriverog
 */
public class Eje_curso_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int x=1,suma=0,limite,valor;
        float promedio;
        
        // Limite de Iteraciones
        System.out.println("Ingrese Limite:");
        limite = teclado.nextInt();
        
        // Implementamos la Suma
        while (x<=limite) {            
            System.out.println("Ciclo:"+x);
            
            System.out.println("Ingrese Valor:");
            valor = teclado.nextInt();
            
            suma = suma + valor;
            x++;
        }
        
        // Calculamos Promedio
        promedio = suma / limite;
        
        // Resultados Totales
        System.out.println("Total de Suma:"+suma);
        System.out.println("Promedio:"+promedio);
    }
    
}
