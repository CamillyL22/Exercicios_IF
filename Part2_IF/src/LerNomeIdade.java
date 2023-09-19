import java.util.Scanner;
// lê o nome e a idade e diz quem é o mais novo
public class LerNomeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPessoas = 5;
        String nomeMaisNovo = null;
        int idadeMaisNova = Integer.MAX_VALUE;
        //Integer.MAX_VALUE é uma constante no Java que representa o valor máximo que um inteiro (tipo int) pode armazenar. Ela é igual a 2.147.483.647.

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade=0;
            try {
               idade = sc.nextInt();
            } catch(Exception e) {
                System.out.println("número inserido errado.");
            }
            sc.nextLine(); // Consumir a nova linha após a idade

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }

        sc.close();

        if (nomeMaisNovo != null) {
            System.out.println("A pessoa mais nova é: " + nomeMaisNovo + " com " + idadeMaisNova + " anos.");
        } else {
            System.out.println("Nenhuma pessoa foi inserida.");
            //tratamento de erro?
        }
    }
}
