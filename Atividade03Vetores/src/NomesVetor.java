import java.util.Scanner;

public class NomesVetor {
    public static void main(String[] args) {

        String[] nomes = new String[3];

        Scanner sc = new Scanner(System.in);

        int quantidadeNomes = 3;

        for (int i = 0; i < quantidadeNomes; i++) {
            System.out.print("Insira o nome " + (i + 1) + ": ");

            nomes[i] = sc.nextLine();
        }

        System.out.println("Nomes inseridos:");
        for (int i = 0; i < quantidadeNomes; i++) {
            System.out.println(nomes[i]);
        }
    }
}