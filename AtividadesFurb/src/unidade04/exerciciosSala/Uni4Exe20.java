package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe20 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a primeira nota: ");
    double nota1 = scanner.nextDouble();
    System.out.println("Digite a segunda nota: ");
    double nota2 = scanner.nextDouble();
    System.out.println("Digite a terceira nota: ");
    double nota3 = scanner.nextDouble();
    System.out.println("Digite a nota de exercicios: ");
    double notaExe = scanner.nextDouble();

    double media = (nota1 + nota2 + nota3 + notaExe) / 7;

    if (media >= 9) {
      System.out.println("A");
    } else if (media >= 7.5 && media < 9) {
      System.out.println("B");
    } else if (media >= 6 && media < 7.5) {
      System.out.println("C");
    } else if (media >= 4 && media < 6) {
      System.out.println("D");
    } else {
      System.out.println("E");
    }
    scanner.close();
  }
}
