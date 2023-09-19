import java.util.Scanner;
// emprestimo e prestação
public class VerificacaoEmprestimo {
    private static boolean verificarEmprestimo(double salario, double prestacao) {
        return prestacao <= 0.2 * salario;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();
        System.out.print("Digite a prestação: ");
        double prestacao = scanner.nextDouble();

        if (verificarEmprestimo(salario, prestacao)) {
            System.out.println("Empréstimo pode ser concedido.");
        } else {
            System.out.println("Empréstimo não pode ser concedido.");
        }
    }
}
