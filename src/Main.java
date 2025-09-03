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

            }
        } while(opcao != 0);

        sc.close();
    }
}