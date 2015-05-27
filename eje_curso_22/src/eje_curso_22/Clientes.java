package eje_curso_22;

public class Clientes {
	// Atributes
	private String nombre;
	private float monto;
	
	// Construct
	public Clientes(String nom){
		
		nombre = nom;
		monto = 0;
	}
	
	public void depositar(float m){
		monto = monto +m;
	}
	
	public void extraer(float m){
		
		monto = monto -m;
		
	}
	
	public float retornarMonto(){
		
		
		return monto;
	}
	
	public void imprimir(){
	  System.out.println("Cliente:"+nombre+" Monto:"+monto);
	}

}
