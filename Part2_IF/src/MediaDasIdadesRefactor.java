import java.util.Scanner;

public class MediaDasIdadesRefactor {
   static int soma = 0;

    public static void main(String[] args) {
        coletaEsomaIdade();
        double media = (double) soma / 20;

        System.out.println("A média das idades é: " + media);

    }
    private static void coletaEsomaIdade(){
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            soma += idade;
        }
        scanner.close();
    }
}