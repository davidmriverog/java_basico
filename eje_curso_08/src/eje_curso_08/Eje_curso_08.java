/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje_curso_08;

import java.util.Scanner;

/**
 *
 * @author davidmriverog
 */
public class Eje_curso_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int suma=0,valor;
        float promedio;
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ciclo Nro:"+(i+1));
            System.out.println("Ingrese Valor:");
            valor = teclado.nextInt();
            
            suma = suma +valor;
        }
        
        promedio = suma /3;
        
        System.out.println("T. Promedio"+promedio);;
        System.out.println("T. Suma:"+suma);
    }
    
}
