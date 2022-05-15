package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe15 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual o salário bruto do funcionário?");

    System.out.println("A quantos meses o funcionário está na empresa?");
    int meses = scanner.nextInt();

    if (meses < 12) {
      System.out.println("O funcionário irá receber 5% de reajuste");
    } else if (meses >= 13 && meses <= 48) {
      System.out.println("O funcionário irá receber 7% de reajuste");
    } else {
      System.out.println("Nós jogamos este funcionário na fogueira");
    }
    scanner.close();
  }
}
