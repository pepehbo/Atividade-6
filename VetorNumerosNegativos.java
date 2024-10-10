	import java.util.Scanner;

public class VetorNumerosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        // Leitura dos 10 números reais
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Exibe os números no vetor
        System.out.println("Números inseridos no vetor:");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }

        // Exibe as posições dos números negativos
        System.out.println("\nPosições que armazenam números negativos:");
        boolean encontrouNegativo = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.println("Posição: " + i + " (Número: " + numeros[i] + ")");
                encontrouNegativo = true;
            }
        }
    }
}