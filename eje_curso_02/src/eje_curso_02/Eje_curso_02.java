package eje_curso_02;

import java.util.Scanner;


public class Eje_curso_02 {
    
    /**
     * Condiciones compuestas con operadores lógicos
     */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Uso del || "OR"
        Scanner teclado = new Scanner(System.in);
        
        int dia,mes,anio;
        
        System.out.println("Ingrese Día:");
        dia = teclado.nextInt();
        System.out.println("Ingrese Mes:");
        mes = teclado.nextInt();
        System.out.println("Ingrese Año:");
        anio = teclado.nextInt();
        
        if(mes==1||mes==2||mes==3){
            System.out.println("Corresponde con el Trimeste I");
            
        }
        else{
            System.out.println("No Corresponde con el Trimestre I");
        }
    }
    
}
