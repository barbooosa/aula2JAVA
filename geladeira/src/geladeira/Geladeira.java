package geladeira;


public class Geladeira {
	
	// Atributo
	private String modelo;
	private String cor;
	private String marca;
	private String capacidade;
	
	// Metodos
	
	Geladeira(){
		modelo = "Frost Free";
		cor = "Cinza";
		marca = "Electrolux";
		capacidade = "100L";
	}
	
	Geladeira(String a , String c , String m , String ca){
		modelo = a;
		cor = c;
		marca = m;
		capacidade = ca;
	}
	
	public String getModelo(String a) {
		return modelo;
	}
	public String getCor() {
		return cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String m) {
		this.marca = m;
	}	
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String model) {
		this.modelo = model;
	}	
	public String getCor(String c) {
		return cor;
	}
	public String getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(String ca) {
		this.capacidade = ca;
	}	
	
	
	public static void main(String[] args) {
		Geladeira g1;
		Geladeira g2;
		Geladeira g3;
		
		// INbstancianoes dos objetos
		g1 = new Geladeira();
		g2 = new Geladeira("1990","Preto","Fiat","Uno");
		g3 = new Geladeira("1500","Verde", "Kia","Ceratto");
		
		
		System.out.println("A Geladeira G1 tem caracteristicas:");
		System.out.println("Cor:" +g1.getCor());
		System.out.println("Marca:" +g1.getMarca());
		System.out.println("Modelo:" +g1.getModelo());
		System.out.println("Capacidade:" +g1.getCapacidade());
		
		System.out.println("A Geladeira G2 tem caracteristicas:");
		System.out.println("Cor:" +g1.getCor());
		System.out.println("Marca:" +g1.getMarca());
		System.out.println("Modelo:" +g1.getModelo());
		System.out.println("Capacidade:" +g1.getCapacidade());
		

		System.out.println("A Geladeira G3 tem caracteristicas:");
		System.out.println("Cor:" +g3.getCor());
		System.out.println("Marca:" +g3.getMarca());
		System.out.println("Modelo:" +g3.getModelo());
		System.out.println("Capacidade:" +g3.getCapacidade());
		
		
		g1.setMarca("Samsung");
		g2.setMarca("SEMP");
		g3.setMarca("Electrolux");
		
		System.out.println("\nO automovel A1 tem caracteristicas:");
		System.out.println("Ano:" +g1.getMarca());
		
		
		System.out.println("\nO automovel A2 tem caracteristicas:");
		System.out.println("Ano:" +g2.getMarca());
		

		System.out.println("\nO automovel A3 tem caracteristicas:");
		System.out.println("Ano:" +g3.getMarca());
		
	}
}
