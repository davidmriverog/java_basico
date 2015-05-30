/**
 * 
 * - Pilas desde cero
 */

package eje_curso_42;

public class Main {

	public static void main(String[] args) {
		// Instanciamos el objeto donde alberga la pila
		Pila pil = new Pila(3);
		
		// add 
		pil.push("1");
		pil.push("2");
		pil.push("3");
		
		// Mostramos
		System.out.println(pil.peek());
		// Verificamos como tiene datos retorna false
		System.out.println(pil.empty());
		// removemos el registro HOla
		System.out.println(pil.pop());
		// verificamos nuevamente dando como resultado true
		System.out.println(pil.empty());
		System.out.println(pil.pop());
		System.out.println(pil.empty());
		System.out.println(pil.pop());
		System.out.println(pil.empty());

	}

}
