import java.util.Scanner;
// ordem inversa
public class ImpressaoOrdemInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numA = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numB = scanner.nextDouble();

        System.out.println("Na ordem inversa:");
        System.out.println("NumA = " + numB);
        System.out.println("NumB = " + numA);
    }
}

