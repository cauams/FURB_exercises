package unidade06.exerciciosSala.vetoresDefinidosNoCodigo;

import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) {

        double[] array = new double[12];

        ler(array);
        ajustar(array);
        escrever(array);
    }

    private static void ler(double array[]) {
        for (int i = 0; i < 12; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insira um número no vetor = " + i);
            array[i] = scanner.nextInt();
        }
    }

    private static void ajustar(double array[]) {
        for (int i = 0; i < 12; i++) {
            if (i % 2 != 0) {
                array[i] += array[i] * 0.5;
            } else {
                array[i] += array[i] * 0.2;
            }
        }

    }

    private static void escrever(double Array[]) {
        for (int i = 0; i < 12; i++) {
            System.out.println(Array[i]);
        }
    }
}




