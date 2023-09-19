 import java.util.Scanner;
//maior menor ou igual a 20
public class VerificacaoMaiorMenorIgual {
    private static void verificarMaiorMenorIgual(int num) {
        if (num == 20) {
            System.out.println("O número é igual a 20.");
        } else if (num < 20) {
            System.out.println("O número é menor que 20.");
        } else {
            System.out.println("O número é maior que 20.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        verificarMaiorMenorIgual(num);
    }
}

