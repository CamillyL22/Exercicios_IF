import java.util.Scanner;
//qunatidade de numeros entre 0 e 100
public class NumerosEntre0e100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumeros = 20;
        int contadorEntre0e100 = 0;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();

            if (numero >= 0 && numero <= 100) {
                contadorEntre0e100++;
            }
        }

        sc.close();

        System.out.println("Quantidade de números entre 0 e 100: " + contadorEntre0e100);
    }
}
