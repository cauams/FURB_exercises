package src.unidade06.exerciciosSala.vetoresDefinidosNoCodigo;

import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[10];

        ler(array1, array2);
        somar(array1, array2, array3);
        escrever(array1, array2, array3);

    }

    static void ler(int array1[], int array2[]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i ++) {
            System.out.println("Adcione números ao primeiro vetor: | número atual: " + (i + 1));
            array1[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Adcione números ao segundo vetor: | número atual: " + (i + 1));
            array2[i] = scanner.nextInt();
        }
    }
    static void somar(int array1[], int array2[], int array3[]) {
        for (int i = 0; i < 10; i++) {
            array3[i] = array1[i] + array2[i];
        }
    }

    static void escrever(int array1[], int array2[], int array3[]) {
        for (int i = 0; i < 10; i++) {
            System.out.println(array1[i] + " + " + array2[i] + " = " + array3[i]);
        }
    }

}
