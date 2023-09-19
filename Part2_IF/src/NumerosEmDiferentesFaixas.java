import java.util.Scanner;
//quantidade de numeros entre tal e tal numero
public class NumerosEmDiferentesFaixas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumeros = 20;
        int contadorEntre0e100 = 0;
        int contadorEntre101e200 = 0;
        int contadorMaioresQue200 = 0;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();

            if (numero >= 0 && numero <= 100) {
                contadorEntre0e100++;
            } else if (numero >= 101 && numero <= 200) {
                contadorEntre101e200++;
            } else {
                contadorMaioresQue200++;
            }
        }

        sc.close();

        System.out.println("Quantidade de números entre 0 e 100: " + contadorEntre0e100);
        System.out.println("Quantidade de números entre 101 e 200: " + contadorEntre101e200);
        System.out.println("Quantidade de números maiores que 200: " + contadorMaioresQue200);
    }
}
