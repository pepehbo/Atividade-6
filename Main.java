	import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        // Lendo os 10 números reais
        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        // Imprimindo os elementos nas posições pares
        System.out.println("Elementos nas posições pares:");
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) { // Verifica se a posição é par
                System.out.println("Posição " + i + ": " + numeros[i]);
            }
        }
    }
}