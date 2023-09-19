import java.util.Scanner;
// maior entre 3
public class MaiorEntreTresNumeros {
    private static double encontrarMaior(double num1, double num2, double num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        double maior = encontrarMaior(num1, num2, num3);
        System.out.println("O maior número é: " + maior);
    }
}
