import java.util.Scanner;
// quantidade de salario minimo o usuario recebe 
public class SalariosMinimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o valor do salário do usuário: ");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.println("O usuário ganha " + quantidadeSalariosMinimos + " salários mínimos.");
    }
}
