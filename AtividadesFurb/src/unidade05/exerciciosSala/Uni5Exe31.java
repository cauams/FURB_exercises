package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();

        int i = 0;

        while (valor > 1) {
            for (i = 2; i <= valor; i++) {
                if (valor % i == 0) {
                    System.out.println(i);
                    valor = valor / i;
                    break;
                }
            }
        }

        scanner.close();
    }
    
}
