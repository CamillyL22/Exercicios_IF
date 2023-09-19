import java.util.Scanner;

public class VerificaNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[2];

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        sc.close();

        double media = (notas[0] + notas[1]) / 2;
        double mediaPorcentagem = media * 10;

        if (mediaPorcentagem >= 60) {
            System.out.println("Média: " + mediaPorcentagem + "%");
            System.out.println("Aprovado");
        } else {
            System.out.println("Média: " + mediaPorcentagem + "%");
            System.out.println("Reprovado");
        }
    }
}


// conversao de notas por %
// calcular 2 notas e dizer se foi aprovado ou não