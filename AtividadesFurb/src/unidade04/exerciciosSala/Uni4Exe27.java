package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe27 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Entre com o horário de chegada: ");
    int horaChegada = scanner.nextInt();
    int minChegada = scanner.nextInt();

    System.out.println("Entre com o horário de partida: ");
    int horaPartida = scanner.nextInt();
    int minPartida = scanner.nextInt();

    int minChegadaPartida = (horaChegada * 60) + minChegada;
    int minPartidaChegada = (horaPartida * 60) + minPartida;

    int minutos = minPartidaChegada - minChegadaPartida;

    if (minutos < 30) {
      minutos = 30;
    }

    int horas = minutos / 60;
    int minutosRestantes = minutos % 60;

    if (minutosRestantes > 0) {
      horas++;
    }

    if (horas > 24) {
      horas = 24;
    }

    double preco = 0;

    if (horas <= 2) {
      preco = horas * 5;
    } else if (horas <= 4) {
      preco = (horas - 2) * 7.5 + 10;
    } else {
      preco = 10 + (horas - 4) * 10;
    }

    System.out.println("O preço a ser pago é: " + preco);
    scanner.close();
  }
}
