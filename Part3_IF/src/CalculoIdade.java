import java.util.Scanner;

public class CalculoIdade {
    private static int calcularIdade(int anoNascimento, int anoAtual) {
        return anoAtual - anoNascimento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idade = calcularIdade(anoNascimento, anoAtual);
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.next();

        try {
            if (idade < 18) {
                throw new Exception("Menor de idade"); //throw new é exceção
            }
            System.out.println(nome + ", sua entrada foi permitida.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + ": " + nome + ", sua entrada foi negada.");
        }
    }
}


