public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Promoções
        Computador promo1 = new Computador("Appe", "Pentium Core i3", 2200, 8, 500, "Linux Ubuntu (32 bits)", "Pendrive 16Gb", 0 );
        Computador promo2 = new Computador("Samsung", "Pentium Core i5", 3370, 16, 1000, "Windows 8 (64 bits)", "Pendrive 32Gb", 1234);
        Computador promo3 = new Computador("Dell", "Pentium Core i7", 4500, 32, 2000, "Windows 10 (64 bits)", "HD externo 1Tb", 5678);
 
        // Cria cliente
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua matrícula: ");
        int matricula = scanner.nextInt();
        Cliente cliente = new Cliente(nome, matricula);
 
        // Compra PC
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
 
                totalCompra += promo1.preco + cliente.matricula;
                System.out.println("Você escolheu:");
                promo1.mostrarInformacoes();
                System.out.println("Adicional de matricula: R$" + cliente.matricula);
 
            }
 
            else if (opcao == 2) {
 
                totalCompra += promo2.preco + cliente.matricula;
                System.out.println("Você escolheu:");
                promo2.mostrarInformacoes();
                System.out.println("Adicional de matricula: R$" + cliente.matricula);
 
            }
 
            else if (opcao == 3) {
 
                totalCompra += promo3.preco + cliente.matricula;
                System.out.println("Você escolheu:");
                promo3.mostrarInformacoes();
                System.out.println("Adicional de matricula: R$" + cliente.matricula);
 
            }
 
        } while (opcao != 0);
 
        System.out.println("\nResumo da Compra");
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Total da compra: R$" + totalCompra);
 
        scanner.close();
    }
}
