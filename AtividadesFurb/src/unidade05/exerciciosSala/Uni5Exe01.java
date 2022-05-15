package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite 20 números! Número atual: " + i);
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par!");
            } else {
                System.out.println("O número " + numero + " é impar!");
            }
        }

        scanner.close();
    }
}