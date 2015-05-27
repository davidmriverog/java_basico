package eje_curso_22;


public class Banco {
	
	private Clientes cliente1;
	private Clientes cliente2;
	
	
	public Banco(){
		
		cliente1 = new Clientes("David Rivero");
		cliente2 = new Clientes("Leyla Pastran");
		
	}
	
	public void operar(){
		
		cliente1.depositar(300);
		cliente2.depositar(100);
	}
	
	public void depositosTotales(){
		
		float m = cliente1.retornarMonto() + cliente2.retornarMonto();
		
		System.out.println("El monto Total es:"+m);
		
		System.out.println("\n");
		
		
		cliente1.imprimir();
		cliente2.imprimir();
		
	}

}
