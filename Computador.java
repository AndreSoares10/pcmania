public class Computador {
 
    String marca;
    String hardwareBasico;
    int capacidade;
    int memoria;
    int hd;
    String sistemaOperacional;
    String acessorio;
    double preco;
 
    // Construtor para os atributos do PC
    Computador(String marca, String hardwareBasico,int capacidade, int memoria, int hd, String sistemaOperacional, String acessorio, double preco) {
        this.marca = marca;
        this.hardwareBasico = hardwareBasico;
        this.capacidade = capacidade;
        this.memoria = memoria;
        this.hd = hd;
        this.sistemaOperacional = sistemaOperacional;
        this.acessorio = acessorio;
        this.preco = preco;
    }
 
    // Mostra informações do PC
    void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Hardware Básico: " + hardwareBasico);
        System.out.println("Capacidade: " + capacidade + "MHz");
        System.out.println("Memória RAM: " + memoria + "GB de RAM");
        System.out.println("HD: " + hd + "GB");
        System.out.println("Sistema Operacional: " + sistemaOperacional);
        System.out.println("Acessório: " + acessorio);
        System.out.println("Preço: R$" + preco);
    }
}
