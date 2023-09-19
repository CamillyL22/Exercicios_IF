import java.util.Scanner;
// calcula a média das idades
public class MediaDasIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            soma += idade;
        }

        double media = (double) soma / 20;

        System.out.println("A média das idades é: " + media);
        scanner.close();
    }
}
