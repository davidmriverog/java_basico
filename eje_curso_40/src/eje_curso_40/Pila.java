package eje_curso_40;

public class Pila {
	
	// Estructura de la pila
	class Nodo {
		int info;
		Nodo sig;
	}
	
	// Pila
	private Nodo raiz;
	
	// Construct
	public Pila(){
		raiz = null;
	}
	
	public void insertar(int x){
		
		// instanciamos para localizar el atributo a cargar en la pila
		Nodo nuevo;
		nuevo = new Nodo();
		
		// Insertamos datos
		nuevo.info = x;
		
		if(raiz==null){
			nuevo.sig = null;
			raiz = nuevo;
		}
		else{
			nuevo.sig = raiz;
			raiz = nuevo;
		}
		
	}
	
	public int extraer(){
		
		if(raiz!=null){
			
			int informacion = raiz.info;
			raiz = raiz.sig;
			
			return informacion;
		}
		else{
			return Integer.MAX_VALUE;
		}
		
	}
	
	public void imprimir(){
		
		Nodo reco = raiz;
		
		System.out.println("Listado de Todos los elementos de Una Pila!");
		
		while(reco!=null){
			
			// Mostramos los datos registrado en la pila
			System.out.print(reco.info+"-");
			reco = reco.sig;
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		Pila p = new Pila();
		
		p.insertar(10);
		p.insertar(40);
		p.insertar(3);
		
		p.imprimir();
		
		System.out.println("Extraemos la pila:"+p.extraer());
		p.imprimir();

	}

}
