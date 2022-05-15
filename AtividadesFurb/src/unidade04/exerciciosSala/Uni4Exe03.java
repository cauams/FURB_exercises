package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número inteiro");
    int numero1 = scanner.nextInt();

    System.out.println("Digite outro número inteiro");
    int numero2 = scanner.nextInt();

    if (numero1 > numero2) {
      System.out.println(
        "O número: " + numero1 + " é maior que o número: " + numero2
      );
    } else if (numero2 > numero1) {
      System.out.println(
        "O número: " + numero2 + " é maior que o número: " + numero1
      );
    } else {
      System.out.println("Os números são iguais");
    }
    scanner.close();
  }
}
