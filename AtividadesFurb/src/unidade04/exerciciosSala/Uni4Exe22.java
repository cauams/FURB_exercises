package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe22 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a sua opção de curso (1, 2, 3)");
    int opcao = scanner.nextInt();

    switch (opcao) {
      case 1:
        System.out.println("Bacharel em Ciências da Computação");
        break;
      case 2:
        System.out.println("Licenciado em computação");
        break;
      case 3:
        System.out.println("Bacharel em Sistemas de Informação");
        break;
    }
    scanner.close();
  }
}
