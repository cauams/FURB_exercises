package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe24 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira o primeiro número: ");
    int num1 = scanner.nextInt();
    System.out.println("Insira o segundo número: ");
    int num2 = scanner.nextInt();
    System.out.println("Insira o terceiro número: ");
    int num3 = scanner.nextInt();

    System.out.println();

    System.out.println("Escolha uma opção: ");
    System.out.println("1 - os 3 valores em ordem crescente");
    System.out.println("2 - os 3 valores em ordem decrescente");
    System.out.println(
      "3 - os 3 valores de forma que o maior valor fique no meio"
    );

    int opcao = scanner.nextInt();

    switch (opcao) {
      case 1:
        if (num1 < num2 && num2 < num3) {
          System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num1 < num3 && num3 < num2) {
          System.out.println(num1 + " " + num3 + " " + num2);
        } else if (num2 < num1 && num1 < num3) {
          System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num2 < num3 && num3 < num1) {
          System.out.println(num2 + " " + num3 + " " + num1);
        } else if (num3 < num1 && num1 < num2) {
          System.out.println(num3 + " " + num1 + " " + num2);
        } else if (num3 < num2 && num2 < num1) {
          System.out.println(num3 + " " + num2 + " " + num1);
        }
        break;
      case 2:
        if (num1 > num2 && num2 > num3) {
          System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num1 > num3 && num3 > num2) {
          System.out.println(num1 + " " + num3 + " " + num2);
        } else if (num2 > num1 && num1 > num3) {
          System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num2 > num3 && num3 > num1) {
          System.out.println(num2 + " " + num3 + " " + num1);
        } else if (num3 > num1 && num1 > num2) {
          System.out.println(num3 + " " + num1 + " " + num2);
        } else if (num3 > num2 && num2 > num1) {
          System.out.println(num3 + " " + num2 + " " + num1);
        }
        break;
      case 3:
        if (num1 > num2 && num1 > num3) {
          System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num2 > num1 && num2 > num3) {
          System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num3 > num1 && num3 > num2) {
          System.out.println(num3 + " " + num1 + " " + num2);
        }
        break;
      default:
        System.out.println("Opção inválida!");
    }
    scanner.close();
  }
}
