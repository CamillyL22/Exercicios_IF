import java.util.Scanner;
// diz quantas das 20 pessoas são maiores de idade
public class ExibirMaioridade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPessoas = 5;
        int ExibirMaioridade = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();

            if (idade >= 18) {
                ExibirMaioridade++;
            }
        }

        sc.close();

        System.out.println("Número de pessoas maiores de idade: " + ExibirMaioridade);
    }
}
// criar um banco de dados