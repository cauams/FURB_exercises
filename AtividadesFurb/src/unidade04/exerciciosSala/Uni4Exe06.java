package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe06 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o seu gênero:");
    System.out.println("M para Masculino");
    System.out.println("F para Feminino");
    System.out.println("I para Não informado");
    Character genero = scanner.nextLine().charAt(0);

    if (Character.toUpperCase(genero) == 'M') {
      System.out.println("Masculino");
    } else if (Character.toUpperCase(genero) == 'F') {
      System.out.println("Feminino");
    } else if (Character.toUpperCase(genero) == 'I') {
      System.out.println("Não informado");
    } else {
      System.out.println("Entrada incorreta.");
    }
    scanner.close();
  }
}
