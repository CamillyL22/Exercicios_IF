import java.util.Scanner;
//reajuste de 1.01 no saldo
public class ReajusteSaldo {
    private static double reajustarSaldo(double saldo) {
        return saldo * 1.01; // Reajuste de 1%
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();
        double saldoReajustado = reajustarSaldo(saldo);
        System.out.println("Saldo com reajuste: " + saldoReajustado);
    }
}
