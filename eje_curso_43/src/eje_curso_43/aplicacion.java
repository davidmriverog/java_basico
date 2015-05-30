package eje_curso_43;

public class aplicacion {

	public static void main(String[] args) {
	
	Pila pil = new Pila();
		
		// add 
		pil.push("1");
		pil.push("2");
		pil.push("3");
		
		pil.push("4");
		pil.push("5");
		pil.push("6");																
		
		pil.push("7");
		pil.push("8");
		pil.push("9");
		
		pil.push("10");
		
		
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
