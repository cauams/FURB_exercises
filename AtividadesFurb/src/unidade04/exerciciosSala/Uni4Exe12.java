package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe12 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Entre com o comprimento do lado 1: ");
    int lado1 = scanner.nextInt();
    System.out.println("Entre com o comprimento do lado 2: ");
    int lado2 = scanner.nextInt();
    System.out.println("Entre com o comprimento do lado 3: ");
    int lado3 = scanner.nextInt();

    if (
      lado1 < (lado2 + lado3) &&
      lado2 < (lado1 + lado3) &&
      lado3 < (lado1 + lado2)
    ) {
      if (lado1 == lado2 && lado1 == lado3) {
        System.out.println("é equilatero");
      } else {
        if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
          System.out.println("é isósceles");
        } else {
          System.out.println("é escaleno");
        }
      }
    } else {
      System.out.println("Não é um triangulo");
    }
    scanner.close();
  }
}
