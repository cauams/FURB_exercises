package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe11 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o ano de nascimento do primeiro irmão");
    int anoNascimento1 = scanner.nextInt();
    System.out.println("Informe o ano de nascimento do segundo irmão");
    int anoNascimento2 = scanner.nextInt();
    System.out.println("Informe o ano de nascimento do terceiro irmão");
    int anoNascimento3 = scanner.nextInt();

    if (anoNascimento1 == anoNascimento2 && anoNascimento2 == anoNascimento3) {
      System.out.println("São TRIGÊMEOS");
    } else if (
      anoNascimento1 == anoNascimento2 || anoNascimento2 == anoNascimento3
    ) {
      System.out.println("São GÊMEOS");
    } else {
      System.out.println("São APENAS IRMÃOS");
    }
    scanner.close();
  }
}
