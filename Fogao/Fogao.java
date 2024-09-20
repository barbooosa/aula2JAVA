public class Fogao {
    // Atributos
    private String marca;
    private String modelo;
    private int quantidadeBocas;
    private String tipoCombustivel;

    // Construtor
    public Fogao(String marca, String modelo, int quantidadeBocas, String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.quantidadeBocas = quantidadeBocas;
        this.tipoCombustivel = tipoCombustivel;
    }

    // Métodos de acesso (getters)
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
        return "O fogão foi ligado.";
    }

    public String fogaoDesligado() {
        return "O fogão foi desligado.";
    }

    // Métodos para alterar as propriedades (setters)
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

    // Método principal (main) para testar a classe Fogao
    public static void main(String[] args) {
        // Criando um objeto da classe Fogao
        Fogao fogao1 = new Fogao("Brastemp", "Clean", 4, "Gás");

        // Exibindo as características do fogão usando os getters
        System.out.println("Marca do fogão: " + fogao1.getMarca());
        System.out.println("Modelo do fogão: " + fogao1.getModelo());
        System.out.println("Quantidade de bocas: " + fogao1.getQuantidadeBocas());
        System.out.println("Tipo de combustível: " + fogao1.getTipoCombustivel());

        // Ligando e desligando o fogão
        System.out.println(fogao1.fogaoLigado());
        System.out.println(fogao1.fogaoDesligado());

        // Alterando algumas propriedades usando os setters
        fogao1.setMarca("Electrolux");
        fogao1.setModelo("Premium");
        fogao1.setQuantidadeBocas(6);
        fogao1.setTipoCombustivel("Elétrico");

        // Exibindo as novas características do fogão após alterações
        System.out.println("\nApós as alterações:");
        System.out.println("Marca do fogão: " + fogao1.getMarca());
        System.out.println("Modelo do fogão: " + fogao1.getModelo());
        System.out.println("Quantidade de bocas: " + fogao1.getQuantidadeBocas());
        System.out.println("Tipo de combustível: " + fogao1.getTipoCombustivel());

        // Ligando e desligando o fogão novamente
        System.out.println(fogao1.fogaoLigado());
        System.out.println(fogao1.fogaoDesligado());
}
}