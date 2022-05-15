package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe09 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número");
    int numero1 = scanner.nextInt();
    System.out.println("Digite o segundo número");
    int numero2 = scanner.nextInt();

    if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
      System.out.println("São multiplos");
    } else {
      System.out.println("Não são multiplos");
    }
    scanner.close();
  }
}
