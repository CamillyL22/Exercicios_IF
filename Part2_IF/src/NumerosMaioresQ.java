import java.util.Scanner;
//numeros maiores que 8
public class NumerosMaioresQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumeros = 20;
        int contadorMaioresQue8 = 0;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();

            if (numero > 8) {
                contadorMaioresQue8++;
            }
        }

        sc.close();

        System.out.println("Quantidade de números maiores que 8: " + contadorMaioresQue8);
    }
}
