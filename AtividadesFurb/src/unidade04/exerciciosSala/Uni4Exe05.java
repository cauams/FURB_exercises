package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("A cor é azul?");
    String resposta = scanner.nextLine();

    if (resposta.toLowerCase().equals("sim")) {
      System.out.println("Sim!");
    } else if (resposta.toLowerCase().equals("nao")) {
      System.out.println("Não!");
    } else {
      System.out.println("Não entendi!");
    }
    scanner.close();
  }
}
