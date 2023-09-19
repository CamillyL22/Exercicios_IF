import java.util.Scanner;
// lê 10 numeros e diz a soma de todos eles
public class SomaDe10Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);
        scanner.close();
    }
}
