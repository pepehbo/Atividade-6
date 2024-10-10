	import java.util.Scanner;

public class VetorSomaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int somaPares = 0;

        // Leitura dos 10 números inteiros
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Soma os números pares
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            }
        }

        // Exibe os números no vetor
        System.out.println("Números inseridos no vetor:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Exibe a soma dos números pares
        System.out.println("\nSoma dos números pares: " + somaPares);

        scanner.close();
    }
}
