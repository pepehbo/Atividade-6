	import java.util.Scanner;

public class Ma{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaração dos vetores
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorSoma = new int[10];

        // Preenchendo o primeiro vetor
        System.out.println("Preencha o primeiro vetor (Vetor A):");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        // Preenchendo o segundo vetor
        System.out.println("Preencha o segundo vetor (Vetor B):");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorB[i] = scanner.nextInt();
        }

        // Somando os elementos das posições correspondentes
        for (int i = 0; i < vetorA.length; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }

        // Apresentando os três vetores
        System.out.println("\nVetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\nVetor Soma (A + B):");
        for (int i = 0; i < vetorSoma.length; i++) {
            System.out.print(vetorSoma[i] + " ");
        }

        scanner.close(); // Fecha o scanner
    }
}
