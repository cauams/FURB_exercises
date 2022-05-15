package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe08 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escreva uma letra");
    String letra = scanner.nextLine();

    if (
      letra.toLowerCase().equals("a") ||
      letra.toLowerCase().equals("e") ||
      letra.toLowerCase().equals("i") ||
      letra.toLowerCase().equals("o") ||
      letra.toLowerCase().equals("u")
    ) {
      System.out.println("É vogal.");
    } else {
      System.out.println("Não é vogal.");
    }
    scanner.close();
  }
}
