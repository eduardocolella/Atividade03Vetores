import java.util.Scanner;

public class MediaVetor {
    public static void main(String[] args) {
        int[] numeros = new int[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Valores inseridos:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        double media = soma / (double) numeros.length;

        System.out.println("A média dos valores é: " + media);


    }
}
