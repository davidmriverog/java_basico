
/***
 * - Tabla de Multiplicar
 */
package eje_curso_12;

import java.util.Scanner;

public class TablaMultiplicar {
    private int valor;
    
    public void cargarValor(){
        Scanner teclado = new Scanner(System.in);
        
       
        do {                
            
            System.out.println("Ingrese valor:");
            valor=teclado.nextInt();
            
            if (valor!=-1) {
                calcular(valor);
            }
        } while (valor!=-1||valor==0);
        
    }
    
    public void calcular(int v){
   
        int j=0;
        
        for(int f=v;f<=v*10;f=f+v){
            
            System.out.println(v+"x"+(j+1)+"="+f);
            
            j++;
        
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TablaMultiplicar tabla = new TablaMultiplicar();
       
       // Cargamos Datos
       tabla.cargarValor();;
    }
    
}
