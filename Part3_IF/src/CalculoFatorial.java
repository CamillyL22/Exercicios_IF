import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Calcula o fatorial e exibe o resultado
        long resultado = calcularFatorial(numero);
        System.out.println(numero + "! = " + resultado);

        scanner.close();
    }
    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            return -1;
        } else if (numero == 0 || numero == 1) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 2; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}
