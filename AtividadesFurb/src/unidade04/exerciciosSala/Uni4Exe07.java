package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe07 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entre com o peso da carta: ");
    int peso = scanner.nextInt();

    double valorPagar = 0;

    if (peso <= 50) {
      valorPagar = 0.45;
    } else {
      double pesoExcedido = peso - 50;
      double qtAdcional = (pesoExcedido / 20) + 1;
      valorPagar = 0.45 + 0.45 * qtAdcional;
    }

    System.out.println("Custo do selo: " + valorPagar);
    scanner.close();
  }
}
