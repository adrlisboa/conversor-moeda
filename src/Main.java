import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ConversorMoeda convMoeda = new ConversorMoeda();

        int opcao;
        do {
            System.out.println("===== CONVERSOR DE UNIDADES =====");
            System.out.println("1 - Real para Dólar");
            System.out.println("2 - Dólar para Real");
            System.out.println("3 - Real para Euro");
            System.out.println("4 - Euro para Real");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor em Real: R$ ");
                    double real = sc.nextDouble();
                    System.out.printf("Resultado: $ %.2f USD\n", convMoeda.realParaDolar(real));
                    break;

                case 2:
                    System.out.println("Digite o valor em Dólar: $ ");
                    double dolar = sc.nextDouble();
                    System.out.printf("Resultado: R$ %.2f BRL\n", convMoeda.dolarParaReal(dolar));
                    break;

                case 3:
                    System.out.println("Digite o valor em Real: R$ ");
                    real = sc.nextDouble();
                    System.out.printf("Resultado: £ %.2f EUR\n", convMoeda.realParaEuro(real));
                    break;

                case 4:
                    System.out.println("Digite o valor em Euro: £ ");
                    double euro = sc.nextDouble();
                    System.out.printf("Resultado: R$ %.2f BRL\n", convMoeda.euroParaReal(euro));
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);

        sc.close();
    }
}