import java.util.Scanner;
//repete o nome da pessoa
public class NomeUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");

        String nome = scanner.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println("Nome: " + nome);
        }
        scanner.close();
    }
}
