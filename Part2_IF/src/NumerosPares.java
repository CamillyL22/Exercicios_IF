import java.util.Scanner;
//diz quantos numeros sao pares
public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumeros = 20;
        int contadorPares = 0;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                contadorPares++;
            }
        }

        sc.close();

        System.out.println("Quantidade de números pares: " + contadorPares);
    }
}
