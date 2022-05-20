package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0, k = 0, m = 0, i = 0, soma = 0, soma2 = 0;

        System.out.println("Digite o valor de N: ");

        n = scanner.nextInt();

        System.out.println("Digite o valor de K: ");

        k = scanner.nextInt();

        System.out.println("Digite o valor de M: ");

        m = scanner.nextInt();

        int[] vetor = new int[n];

        for (i = 0; i < n; i++) {
            vetor[i] = n - i * k;
        }

        for (i = 0; i < n; i++) {
            if (vetor[i] <= m) {
                soma += vetor[i];
                m -= vetor[i];
            } else {
                soma2 += vetor[i];
            }
        }

        System.out.println("Os elementos a serem colocados na mochila são: ");

        for (i = 0; i < n; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("Os elementos que entraram na mochila são: ");

        for (i = 0; i < n; i++) {
            if (vetor[i] <= m) {
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Os elementos que ficaram fora da mochila são: ");

        for (i = 0; i < n; i++) {
            if (vetor[i] > m) {
                System.out.println(vetor[i]);
            }
        }

        System.out.println("A soma dos elementos que entraram na mochila é: " + soma);

        System.out.println("A soma dos elementos que não entraram na mochila é: " + soma2);

        scanner.close();
    }
    
}
