package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
      "Digite um número para ser verificado se ele possui casas decimais"
    );
    double numero = scanner.nextDouble();

    if (numero % 1 == 0) {
      System.out.println("O número digitado possui casas decimais");
    } else {
      System.out.println("O número digitado não possui casas decimais");
    }
    scanner.close();
  }
}
