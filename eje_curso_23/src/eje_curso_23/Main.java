package eje_curso_23;

public class Main {

	public static void main(String[] args) {
		
		// - Llamamos la Clase Hija para efectuar la Suma
		Suma sum = new Suma();
		sum.cargarDato1();
		sum.cargarDato2();
		sum.operar();
		sum.mostrarResultado();
		
		// - Llamamos la Clase Hija para efectuar la Resta
		Resta res = new Resta();
		res.cargarDato1();
		res.cargarDato2();
		res.operar();
		res.mostrarResultado();
	}

}
