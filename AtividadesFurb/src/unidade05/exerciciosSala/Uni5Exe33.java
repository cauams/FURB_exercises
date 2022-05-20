package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe33 {

  public static void main(String[] args) {
    /*
        Em uma eleição para presidência, existem 4 candidatos. Os votos são informados através de código. Os dados utilizados para votação obedecem a seguinte codificação:

1, 2, 3, 4 = voto para o respectivo candidato;
5 = voto nulo;
6 = voto em branco.
Elabore um programa que calcule e escreva:

total de votos para cada candidato;
total de votos nulos;
total de votos em branco;
percentual dos votos em branco e nulos sobre o total.
Se o usuário informar um número de operação incorreto, emitir a mensagem “Opção incorreta” e persistir solicitando um número de opção correto. Para interromper a operação, o usuário poderá fornecer o número 0.
        
        */

    int candidato1 = 0;
    int candidato2 = 0;
    int candidato3 = 0;
    int candidato4 = 0;
    int nulo = 0;
    int branco = 0;
    int opcao = 0;
    int total = 0;

    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("Digite o número do candidato: ");
      opcao = scanner.nextInt();
      switch (opcao) {
        case 1:
          candidato1++;
          total++;
          break;
        case 2:
          candidato2++;
          total++;
          break;
        case 3:
          candidato3++;
          total++;
          break;
        case 4:
          candidato4++;
          total++;
          break;
        case 5:
          nulo++;
          total++;
          break;
        case 6:
          branco++;
          total++;
          break;
        default:
          System.out.println("Opção incorreta");
          break;
      }
    } while (opcao != 0);

    double percentual1 = (candidato1 * 100) / (double) total;
    double percentual2 = (candidato2 * 100) / (double) total;
    double percentual3 = (candidato3 * 100) / (double) total;
    double percentual4 = (candidato4 * 100) / (double) total;
    double percentualNulo = (nulo * 100) / (double) total;

    System.out.println(
      "Candidato 1: " + candidato1 + " votos (" + percentual1 + "%)"
    );
    System.out.println(
      "Candidato 2: " + candidato2 + " votos (" + percentual2 + "%)"
    );
    System.out.println(
      "Candidato 3: " + candidato3 + " votos (" + percentual3 + "%)"
    );
    System.out.println(
      "Candidato 4: " + candidato4 + " votos (" + percentual4 + "%)"
    );
    System.out.println("Nulos: " + nulo + " votos (" + percentualNulo + "%)");

    scanner.close();
  }
}
