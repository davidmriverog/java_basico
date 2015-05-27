/**
 * - Estructura repetitiva while II
 */
package eje_curso_04;

import java.util.Scanner;

/**
 *
 * @author davidmriverog
 */
public class Eje_curso_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int cant,x=1;
        
        System.out.println("Ingrese Total de Mensajes:");
        cant = teclado.nextInt();
        
        while (x<=cant) {            
            System.out.println("Mensaje:"+x+" de "+cant);
            x++;
        }
    }
    
}
