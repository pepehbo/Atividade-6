	import java.util.Scanner;

public class Mai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10]; // Criação do vetor para armazenar os números

        // Lendo os 10 números reais
        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble(); // Armazena o número no vetor
        }

        // Imprimindo os elementos nas posições pares
        System.out.println("Elementos nas posições pares:");
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) { // Verifica se a posição é par
                System.out.println("Posição " + i + ": " + numeros[i]);
            }
        }

        scanner.close(); // Fecha o scanner
    }
}

scanner.close();
}
}

