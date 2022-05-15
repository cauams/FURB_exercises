package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe17 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a sua renda anual:");
    double rendaAnual = scanner.nextDouble();

    System.out.println("Digite o número de dependentes");
    int dependentes = scanner.nextInt();

    double descontoDependentes = rendaAnual * (0.2 * dependentes);
    double rendaLiquida = rendaAnual - descontoDependentes;

    if (rendaLiquida > 10000) {
      System.out.println("Você deverá pagar 15% de DIRPF");
    } else if (rendaLiquida > 5000 && rendaLiquida <= 10000) {
      System.out.println("Você deverá pagar 10% de DIRPF");
    } else if (rendaLiquida > 2000 && rendaLiquida <= 5000) {
      System.out.println("Você deverá pagar 5% de DIRPF");
    } else {
      System.out.println("Você está insento de ter que pagar o DIRPF");
    }

    scanner.close();
  }
}
