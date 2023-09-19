import java.util.Scanner;

public class VerificacaoParImpar {
    private static void verificarParImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        verificarParImpar(numero);
    }
}

