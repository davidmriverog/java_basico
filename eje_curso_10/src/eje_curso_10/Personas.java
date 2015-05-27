/*
 *  - Clases
 */
package eje_curso_10;

// Clases

import java.util.Scanner;

public class Personas {
    
    // Atributos
    private Scanner teclado;
    private String nombres;
    private int edad;
    

    /**
     * Metodo que no retorna dato.
     */
    public void inicializar(){
         // Cargamos datos
        teclado = new Scanner(System.in);
        
        System.out.println("Ingrese Nombre:");
        nombres = teclado.next();
        System.out.println("Ingrese Edad:");
        edad = teclado.nextInt();       
    }
    
    public void imprimir(){
        
        System.out.println("Nombre:"+nombres);
        System.out.println("Edad:"+edad);
    }
    
    public void validateEdad(){
        
        if (edad>=18) {
            System.out.println(nombres+"Es Mayor de Edad");
        } else {
            System.out.println(nombres+"No eres mayor de Edad");
        }
    }
    
    // Metodo Main
    
    public static void main(String[] args) {
        
        Personas persona = new Personas();
        // Cargamos Datos
        persona.inicializar();
        // Mostramos Información
        persona.imprimir();
        // Validamos la Edad de la Persona
        persona.validateEdad();
        
    }
    
    
}
