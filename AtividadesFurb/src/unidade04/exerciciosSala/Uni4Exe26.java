package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe26 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha uma opção: ");
    System.out.println(
      "T: calcular a área de um triângulo de base b e altura h"
    );
    System.out.println("Q: calcular a área de um quadrado de lado l");
    System.out.println(
      "R: calcular a área de um retângulo de base b e altura h"
    );
    System.out.println("C: calcular a área de um círculo de raio r");

    String opcao = scanner.nextLine();

    switch (opcao.toLowerCase()) {
      case "t":
        System.out.println("Entre com o valor da base: ");
        double base = scanner.nextDouble();
        System.out.println("Entre com o valor da altura: ");
        double altura = scanner.nextDouble();
        System.out.println("A área do triângulo é: " + (base * altura) / 2);
        break;
      case "q":
        System.out.println("Entre com o valor do lado: ");
        double lado = scanner.nextDouble();
        System.out.println("A área do quadrado é: " + Math.pow(lado, 2));
        break;
      case "r":
        System.out.println("Entre com o valor da base: ");
        double baseR = scanner.nextDouble();
        System.out.println("Entre com o valor da altura: ");
        double alturaR = scanner.nextDouble();
        System.out.println("A área do retângulo é: " + baseR * alturaR);
        break;
      case "c":
        System.out.println("Entre com o valor do raio: ");
        double raio = scanner.nextDouble();
        System.out.println(
          "A área do círculo é: " + Math.pow(raio, 2) * Math.PI
        );
        break;
    }
    scanner.close();
  }
}
