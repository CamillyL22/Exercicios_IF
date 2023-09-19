import java.util.Scanner;
//diz quantas das 20 pessoas são maiores de idade
public class MaioresDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            if (idade >= 18) {
                contador++;
            }
        }

        System.out.println("Quantidade de pessoas maiores de idade: " + contador);
        scanner.close();
    }
}
