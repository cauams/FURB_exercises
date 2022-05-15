package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe21 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a sua massa corporal em kg: ");
    double massa = scanner.nextDouble();

    System.out.println("Informe a sua altura em metros: ");
    double altura = scanner.nextDouble();

    double imc = massa / (altura * altura);

    if (imc >= 40) {
      System.out.println("Obesidade Grau III (Mórbida)");
    } else if (imc >= 35 && imc < 40) {
      System.out.println("Obesidade Grau II (Severa)");
    } else if (imc >= 30 && imc < 35) {
      System.out.println("Obesidade Grau I (Leve)");
    } else if (imc >= 25 && imc < 30) {
      System.out.println("Sobrepeso");
    } else if (imc >= 18.5 && imc < 25) {
      System.out.println("Saudável");
    } else {
      System.out.println("Magreza");
    }
    scanner.close();
  }
}
