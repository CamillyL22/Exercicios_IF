import java.util.Scanner;
//repete nome e idade
public class NomeRepetidasVezes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nome: " + nome);
        }

        scanner.close();
    }
}
