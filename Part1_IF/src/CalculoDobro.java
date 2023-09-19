import java.util.Scanner;

public class CalculoDobro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = sc.nextInt();
        int dobro = numero * 2;
        System.out.println("O dobro de " + numero + " é igual a " + dobro);
        sc.close();
    }
}

