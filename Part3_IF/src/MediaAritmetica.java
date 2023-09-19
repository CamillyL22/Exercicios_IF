public class MediaAritmetica {
    //calcule a média
    private static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        double media1 = calcularMedia(8, 9, 7);
        double media2 = calcularMedia(4, 5, 6);
        double somaMedias = media1 + media2;

        System.out.println("Média dos números 8, 9 e 7: " + media1);
        System.out.println("Média dos números 4, 5 e 6: " + media2);
        System.out.println("-----------------------");
        System.out.println("Soma das duas médias: " + somaMedias);
        System.out.println("-----------------------");
        System.out.println("Média das médias: " + (somaMedias / 2)); // Média das médias
    }
}
