import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria SO
        SistemaOperacional so1 = new SistemaOperacional("Linux Ubuntu", 32);
        SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);
        SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);

        // Cria HB
        HardwareBasico[] hardware1 = { new HardwareBasico("Processador", 2200), new HardwareBasico("Memória RAM", 8), new HardwareBasico("HD", 500) };
        HardwareBasico[] hardware2 = { new HardwareBasico("Processador", 3370), new HardwareBasico("Memória RAM", 16), new HardwareBasico("HD", 1000) };
        HardwareBasico[] hardware3 = { new HardwareBasico("Processador", 4500), new HardwareBasico("Memória RAM", 32), new HardwareBasico("HD", 2000) };

        // Cria Memória USB
        MemoriaUSB usb1 = new MemoriaUSB("USB", 16);
        MemoriaUSB usb2 = new MemoriaUSB("USB", 32);
        MemoriaUSB usb3 = new MemoriaUSB("USB", 1000);

        // Cria PC
        Computador promo1 = new Computador("Apple", 0, so1, hardware1);
        promo1.addMemoriaUSB(usb1);

        Computador promo2 = new Computador("Samsung", 1234, so2, hardware2);
        promo2.addMemoriaUSB(usb2);

        Computador promo3 = new Computador("Dell", 5678, so3, hardware3);
        promo3.addMemoriaUSB(usb3);

        // Cria Cliente
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua matrícula: ");
        int matricula = scanner.nextInt();
        Cliente cliente = new Cliente(nome, matricula);

        double totalCompra = 0;
        int opcao;

        do {

            System.out.println("\nEscolha uma promoção: ");
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.println("0 - Finalizar compra");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {

                totalCompra += promo1.getPreco() + cliente.getMatricula();
                System.out.println("Você escolheu:");
                System.out.println("Acompanha um PenDrive de 16Gb!");
                promo1.mostraPCConfigs();

            }

            else if (opcao == 2) {
                totalCompra += promo2.getPreco() + cliente.getMatricula();
                System.out.println("Você escolheu:");
                System.out.println("Acompanha um PenDrive de 32Gb!");
                promo2.mostraPCConfigs();

            }

            else if (opcao == 3) {
                totalCompra += promo3.getPreco() + cliente.getMatricula();
                System.out.println("Você escolheu:");
                System.out.println("Acompanha um HD externo de 1Tb!");
                promo3.mostraPCConfigs();

            }
        } while (opcao != 0);

        System.out.println("\nResumo da Compra");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Total da compra: R$" + totalCompra);

        scanner.close();
    }
}
