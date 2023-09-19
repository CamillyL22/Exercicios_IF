import java.util.Scanner;

//TRATAMENTO DE ERR0

public class SequenciaNumerosCrescentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.print("Escolha a opção de listagem (crescente ou decrescente): ");
        scanner.nextLine();
        String opcao = scanner.nextLine();

        if (opcao.equalsIgnoreCase("crescente")) {
            for (int i = 0; i <= numero; i++) {
                System.out.println(i);
            }
        } else if (opcao.equalsIgnoreCase("decrescente")) {
            while (numero >= 0) {
                System.out.println(numero);
                numero--;
            }
        } else {
            System.out.println("Opção inválida. Por favor, escolha 'crescente' ou 'decrescente'.");
        }
        scanner.close();
    }
}
