import java.util.Scanner;

public class MultiplicacaoSomasRepetidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = 0;

        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }
        System.out.println(num1 + " * " + num2 + " = " + resultado);
        scanner.close();
    }
}
