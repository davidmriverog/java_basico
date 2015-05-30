package eje_curso_42;

public class Pila {

	// Texto
	String arr[];
	// tamaño maximo de la pila
	int maxSize;
	// verificador tope de la pila
	int top;
	
	public Pila(int n){
	  maxSize = n;
	  
	  arr = new String[maxSize];
	  top = 0;
	}
	
	// Para verificar si esta vacía
	public boolean empty(){
	
		if(top==0){
			return true;
		}
		else{
			return false;	
		}		
	}
	
	// Para añadir nuevos registros
	public void push(String str){
		
		// verificar el posible desbordamiento de la pila
		if(top< maxSize){
		

			//add
			arr[top] = str;
			//incrementamos a la siguiente posicion
			top++;
		}
		
		
	}
	
	
	// Para mostrar elementos de una pila
	public String peek(){
	
		// Verificar si esta vacia
		if(top>0){
			// Mostramos el ultimo elemento que se añadió en la pila
			return arr[top-1];
		}else{
			return null;
		}
		
	}
	
	// Para mostrar el último elemento de una pila y eliminarlo
	public String pop(){
		
	
		String temp=null;
		
		if(top>0){
			//Almacenamos el ultimo registro a la variable temp
		    temp = arr[top-1];
		    
		    // Vaciamos la casilla asignadola nula despues de haberla removido
		    arr[top-1]=null;
		    top--;
		    
		}
		return temp;
	}
	
	
}
