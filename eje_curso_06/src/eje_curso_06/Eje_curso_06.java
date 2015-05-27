/*
 *  - Estructura repetitiva while
 */
package eje_curso_06;

import java.util.Scanner;

/**
 *
 * @author davidmriverog
 */
public class Eje_curso_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int x=1,cantidad=0,limite;
        float largo;
        
        System.out.println("Ingrese el Limite:");
        limite = teclado.nextInt();
        
        while(x<=limite) {
            System.out.println("Clico Nro:"+x);
            
            System.out.println("Ingrese Largo:");
            largo = teclado.nextFloat();
            
            if (largo>=1.20&&largo<=1.30) {
                cantidad++;
            }
            x++;
        }
        System.out.println("Total de Largo que Cumple con el Condicional:"+cantidad);
    }
    
}
