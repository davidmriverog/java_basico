/*
 *- Estructura repetitiva for
 */
package eje_curso_09;

import java.util.Scanner;

/**
 *
 * @author davidmriverog
 */
public class Eje_curso_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner teclado =new Scanner(System.in);
        
        int aprobados=0,reprobados=0;
        
        float nota;
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Ciclo:"+(i+1));
            
            System.out.println("Ingrese Nota:");
            nota = teclado.nextFloat();
            
            if (nota>=10) {
                aprobados++;
            } else {
                reprobados++;
            }
        }
        
        System.out.println("T. Aprobados:"+aprobados);
        System.out.println("T. Reprobados:"+reprobados);
    }
    
}
