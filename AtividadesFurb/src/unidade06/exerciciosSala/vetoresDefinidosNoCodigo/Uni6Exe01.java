package src.unidade06.exerciciosSala.vetoresDefinidosNoCodigo;

import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {

        int array[] = new int[10];

        ler(array);
        escrever(array);


    }

    public static void ler(int array[]) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i ++) {
            System.out.println("Digite o número a ser inserido no vetor = " + i );
            array[i] = scanner.nextInt();
        }
    }

    public static void escrever(int array[]) {

        for (int i = 10; i > 0; i--) {
            System.out.println(array[i - 1]);
        }
    }
}
