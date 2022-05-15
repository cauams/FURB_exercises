package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe14 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o dia");
    int dia = scanner.nextInt();

    System.out.println("Digite o mês");
    int mes = scanner.nextInt();

    System.out.println("Digite o ano");
    int ano = scanner.nextInt();

    if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
      if (
        mes == 1 ||
        mes == 3 ||
        mes == 5 ||
        mes == 7 ||
        mes == 8 ||
        mes == 10 ||
        mes == 12
      ) {
        if (mes != 2 && dia < 31) {
          System.out.println("Data válida");
        } else if (mes == 2 && dia < 29) {
          System.out.println("Data válida");
        } else if (mes == 2 && dia == 29 && ano % 4 == 0) {
          System.out.println("Data válida");
        } else {
          System.out.println("Data inválida");
        }
      }
    }
    scanner.close();
  }
}
