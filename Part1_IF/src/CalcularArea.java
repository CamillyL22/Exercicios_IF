
import java.util.Scanner;

public class CalcularArea {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o comprimento do terreno:");
        double comprimento = sc.nextDouble();

        System.out.println("Digite a largurado terreno: ");
        double largura = sc.nextDouble();

        sc.close();

        double area = comprimento * largura;
        System.out.println("A área do terreno é:" + area);
    }
}
