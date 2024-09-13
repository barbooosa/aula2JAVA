package automovel;


public class Automovel {
	
	// Atributo
	private String ano;
	private String cor;
	private String marca;
	private String modelo;
	
	// Metodos
	
	Automovel(){
		ano = "2014";
		cor = "Vermelho";
		marca = "Volkswalgem";
		modelo = "Trend";
	}
	
	Automovel(String a , String c , String m , String model){
		ano = a;
		cor = c;
		marca = m;
		modelo = model;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String a) {
		this.ano = a;
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
	
	
	public static void main(String[] args) {
		Automovel a1;
		Automovel a2;
		Automovel a3;
		
		// INbstancianoes dos objetos
		a1 = new Automovel();
		a2 = new Automovel("1990","Preto","Fiat","Uno");
		a3 = new Automovel("1500","Verde", "Kia","Ceratto");
		
		
		System.out.println("O automovel A1 tem caracteristicas:");
		System.out.println("Ano:" +a1.getAno());
		System.out.println("Cor:" +a1.getCor());
		System.out.println("Marca:" +a1.getMarca());
		System.out.println("Modelo:" +a1.getModelo());
		
		System.out.println("\nO automovel A2 tem caracteristicas:");
		System.out.println("Ano:" +a2.getAno());
		System.out.println("Cor:" +a2.getCor());
		System.out.println("Marca:" +a2.getMarca());
		System.out.println("Modelo:" +a2.getModelo());

		System.out.println("\nO automovel A3 tem caracteristicas:");
		System.out.println("Ano:" +a3.getAno());
		System.out.println("Cor:" +a3.getCor());
		System.out.println("Marca:" +a3.getMarca());
		System.out.println("Modelo:" +a3.getModelo());
		
		a1.setAno("1888");
		a2.setAno("1800");
		a3.setAno("-1500");
		
		System.out.println("\nO automovel A1 tem caracteristicas:");
		System.out.println("Ano:" +a1.getAno());
		
		
		System.out.println("\nO automovel A2 tem caracteristicas:");
		System.out.println("Ano:" +a2.getAno());
		

		System.out.println("\nO automovel A3 tem caracteristicas:");
		System.out.println("Ano:" +a3.getAno());
		
	}
}
