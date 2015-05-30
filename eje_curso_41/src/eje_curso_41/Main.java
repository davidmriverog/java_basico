package eje_curso_41;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos la pila
		
		//[ ]
		
		Stack<String> pila = new Stack<String>();
		
		// [Mundo]		
		pila.push("Mundo");
		
		//[Mundo, Hola]
		pila.push("Hola");
		
		// Mostramos el ultimo registro
		//System.out.println(pila.peek());
		
		// Sacamos un elemento
		System.out.println(pila.pop());
		// Despues de usar el pop la pila se convirtio en [Mundo]
		
		// Verificamos si esta vacia con System.out.println(pila.empty());
		
		// quitamos otro registro		
		System.out.println(pila.pop());
		// debe dar true
		System.out.println(pila.empty());
		
		
		
		// Volvemos a mostrar
		// System.out.println(pila.peek());
		
		
		
		
		// push -- añadir un elemento a la pila
		// pop  -- vaciar  sacar elemento final
		// peek -- ver la ultima pero no las saca
		// empty -- saber si la pila esta vacia
		
	}

}
