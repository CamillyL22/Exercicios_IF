import java.util.Scanner;
//calcular raiz quadrada
public class CalculoRaizQuadradaOuQuadrado {
    private static void calcularRaizQuadradaOuQuadrado(double num) {
        if (num > 0) {
            double raizQuadrada = Math.sqrt(num);// calcular raiz quadrada
            System.out.println("Raiz quadrada de " + num + " é " + raizQuadrada);
        } else {
            double quadrado = num * num;
            System.out.println("O quadrado de " + num + " é " + quadrado);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();
        calcularRaizQuadradaOuQuadrado(num);
    }
}
