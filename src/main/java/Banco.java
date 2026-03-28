import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("     MENU     ");
            System.out.println("1. Ver saldo ");
            System.out.println("2. Fazer depósito ");
            System.out.println("3. Fazer PIX ");
            System.out.println("4. SAIR ");

            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é: R$100,00.");
            } else if (opcao == 2) {
                System.out.println("Depósito realizado com sucesso!");
            } else if (opcao == 3) {
                System.out.println("PIX realizado com sucesso!");
            } else if (opcao == 4) {
                System.out.println("Programa finalizado.");
            } else {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

    }
}
