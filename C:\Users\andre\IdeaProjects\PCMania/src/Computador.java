class Computador {
    private String marca;
    private double preco;
    private SistemaOperacional sistema;
    private HardwareBasico[] hardwares;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, double preco, SistemaOperacional sistema, HardwareBasico[] hardwares) {
        this.marca = marca;
        this.preco = preco;
        this.sistema = sistema;
        this.hardwares = hardwares;
    }

    public void addMemoriaUSB(MemoriaUSB usb) {
        this.memoriaUSB = usb;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Sistema Operacional: " + sistema.getNome() + " (" + sistema.getTipo() + " bits)");

        for (HardwareBasico h : hardwares) {

            System.out.println(h.getNome() + ": " + h.getCapacidade());

        }

        if (memoriaUSB != null) {

            System.out.println("Memória: " + memoriaUSB.getNome() + " - " + memoriaUSB.getCapacidade() + "GB");

        }

        System.out.println("Preço: R$" + preco);
    }

    public double getPreco() {

        return preco;
    }
}
