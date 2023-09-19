import java.util.Scanner;
// verifica se os numeros sao iguais ou diferentes, e qual o maior e menor entre eles
public class VerificacaoNumerosIguaisDiferentes {
    private static void verificarNumeros(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            int maior = Math.max(num1, num2);
            int menor = Math.min(num1, num2);
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        verificarNumeros(num1, num2);
    }
}
