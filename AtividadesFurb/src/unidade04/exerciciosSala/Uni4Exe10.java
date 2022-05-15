package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe10 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a idade de Marquinhos");
    int idadeMarquinhos = scanner.nextInt();
    System.out.println("Informe a idade de Zezinho");
    int idadeZezinho = scanner.nextInt();
    System.out.println("Informe a idade de Luluzinho");
    int idadeLuluzinho = scanner.nextInt();

    if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinho) {
      System.out.println("Marquinhos é o caçula");
    } else if (
      idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinho
    ) {
      System.out.println("Zezinho é o caçula");
    } else if (
      idadeLuluzinho < idadeMarquinhos && idadeLuluzinho < idadeZezinho
    ) {
      System.out.println("Luluzinho é o caçula");
    } else {
      System.out.println("Não há caçula");
    }
    scanner.close();
  }
}
