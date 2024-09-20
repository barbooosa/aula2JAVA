public class Fogao {
    // Atributos
    private String marca;
    private String modelo;
    private int quantidadeBocas;
    private String tipoCombustivel;

    public Fogao(String marca, String modelo, int quantidadeBocas, String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.quantidadeBocas = quantidadeBocas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getQuantidadeBocas() {
        return quantidadeBocas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public String fogaoLigado() {
        return "O fogao foi ligado.";
    }

    public String fogaoDesligado() {
        return "O fogao foi desligado.";
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQuantidadeBocas(int quantidadeBocas) {
        this.quantidadeBocas = quantidadeBocas;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public static void main(String[] args) {
        Fogao fogao1 = new Fogao("Brastemp", "Clean", 4, "Gás");

        System.out.println("Marca do fogao: " + fogao1.getMarca());
        System.out.println("Modelo do fogao: " + fogao1.getModelo());
        System.out.println("Quantidade de bocas: " + fogao1.getQuantidadeBocas());
        System.out.println("Tipo de combustível: " + fogao1.getTipoCombustivel());

        System.out.println(fogao1.fogaoLigado());
        System.out.println(fogao1.fogaoDesligado());

        fogao1.setMarca("Electrolux");
        fogao1.setModelo("Premium");
        fogao1.setQuantidadeBocas(6);
        fogao1.setTipoCombustivel("Eletrico");

        System.out.println("\nApos as alteracoes:");
        System.out.println("Marca do fogao: " + fogao1.getMarca());
        System.out.println("Modelo do fogao: " + fogao1.getModelo());
        System.out.println("Quantidade de bocas: " + fogao1.getQuantidadeBocas());
        System.out.println("Tipo de combustivel: " + fogao1.getTipoCombustivel());

        System.out.println(fogao1.fogaoLigado());
        System.out.println(fogao1.fogaoDesligado());
}
}