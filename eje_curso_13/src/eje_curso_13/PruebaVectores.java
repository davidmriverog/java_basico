package eje_curso_13;

import java.util.Scanner;


public class PruebaVectores{
    
    private Scanner teclado;
    private float[] sueldos;
    
    public void cargar(){
        
        teclado = new Scanner(System.in);
        sueldos = new float[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese Valor:");
            sueldos[i] = teclado.nextFloat();
        }
        
        
    }
    
    public void imprimir(){
        
        for (int f= 0; f < sueldos.length; f++) {
            System.out.println("El Sueldo de la Posicion"+(f+1)+" es:"+sueldos[f]);            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PruebaVectores vect = new PruebaVectores();
        
        vect.cargar();
        vect.imprimir();
    }
    
}
