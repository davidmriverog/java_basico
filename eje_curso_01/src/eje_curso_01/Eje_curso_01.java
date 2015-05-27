package eje_curso_01;

import java.util.Scanner;

public class Eje_curso_01 {
    
    /**
     * Condiciones compuestas con operadores lógicos
     */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Operador &&
        Scanner teclado = new Scanner(System.in);
        
        int num1,num2,num3;
        
        System.out.println("Ingrese 1er Valor:");
        num1=teclado.nextInt();
        System.out.println("Ingrese 2do Valor:");
        num2=teclado.nextInt();
        System.out.println("Ingrese 3er Valor:");
        num3=teclado.nextInt();
        
        if(num1>num2&&num1>num3){
            
            System.out.println("Mayor Nro:"+num1);
        }
        else if(num2>num3){
            System.out.println("Mayor Nro:"+num2);
        }
        else{
            System.out.println("Mayor Nro:"+num3);
        }
       
        
    }
    
}
