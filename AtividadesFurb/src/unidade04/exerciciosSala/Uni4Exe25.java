package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe25 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha uma opção: ");
    System.out.println("1 - Soma de dois números.");
    System.out.println("2 - Diferença entre doi números.");
    System.out.println("3 - Produto entre dois números.");
    System.out.println("4 - Divisão entre dois números.");

    int opcao = scanner.nextInt();

    switch (opcao) {
      case 1:
        System.out.println("Insira o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Insira o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("A soma dos dois números é: " + (num1 + num2));
        break;
      case 2:
        System.out.println("Insira o primeiro número: ");
        int num3 = scanner.nextInt();
        System.out.println("Insira o segundo número: ");
        int num4 = scanner.nextInt();
        System.out.println(
          "A diferença entre os dois números é: " + (num3 - num4)
        );
        break;
      case 3:
        System.out.println("Insira o primeiro número: ");
        int num5 = scanner.nextInt();
        System.out.println("Insira o segundo número: ");
        int num6 = scanner.nextInt();
        System.out.println(
          "O produto entre os dois números é: " + (num5 * num6)
        );
        break;
      case 4:
        System.out.println("Insira o primeiro número: ");
        int num7 = scanner.nextInt();
        System.out.println("Insira o segundo número: ");
        int num8 = scanner.nextInt();
        System.out.println(
          "A divisão entre os dois números é: " + (num7 / num8)
        );
        break;
      default:
        System.out.println("Opção inválida.");
        break;
    }
    scanner.close();
  }
}
