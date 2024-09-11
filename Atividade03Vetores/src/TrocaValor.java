public class TrocaValor {
    public static void main(String[] args) {
        int[] numeros = {5, 10};

        System.out.println("Antes da troca: ");
        System.out.println("numeros[0] = " + numeros[0]);
        System.out.println("numeros[1] = " + numeros[1]);

        int temp = numeros[0];
        numeros[0] = numeros[1];
        numeros[1] = temp;

        System.out.println("Após a troca: ");
        System.out.println("numeros[0] = " + numeros[0]);
        System.out.println("numeros[1] = " + numeros[1]);
    }
}

