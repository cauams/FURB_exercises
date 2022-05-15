package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entre com as horas trabalhadas do mês:");
    int horasMes = scanner.nextInt();

    System.out.println("Entre com o valor pago por hora");
    double horasValor = scanner.nextDouble();

    double salarioTotal = horasMes * horasValor;

    if (horasMes > 160) {
      double salarioExtra = (horasMes - 160) * (horasValor * 2);
      salarioTotal += salarioExtra;
    }

    System.out.println("O salario total é: " + salarioTotal);
    scanner.close();
  }
}
