package unidade04.exerciciosSala;

import java.util.Scanner;

public class Uni4Exe16 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a idade do primeiro homem: ");
    int idadeHomem1 = scanner.nextInt();
    System.out.println("Digite a idade do segundo homem: ");
    int idadeHomem2 = scanner.nextInt();

    int idadeHomemMaisVelho = 0;
    int idadeHomemMaisNovo = 0;

    System.out.println("Digite a idade do primeiro mulher: ");
    int idadeMulher1 = scanner.nextInt();
    System.out.println("Digite a idade do segunda mulher: ");
    int idadeMulher2 = scanner.nextInt();

    int idadeMulherMaisVelha = 0;
    int idadeMulherMaisNova = 0;

    if (idadeHomem1 > idadeHomem2) {
      idadeHomemMaisVelho = idadeHomem1;
      idadeHomemMaisNovo = idadeHomem2;
    } else {
      idadeHomemMaisVelho = idadeHomem2;
      idadeHomemMaisNovo = idadeHomem1;
    }

    if (idadeMulher1 > idadeMulher2) {
      idadeMulherMaisVelha = idadeMulher1;
      idadeMulherMaisNova = idadeMulher2;
    } else {
      idadeMulherMaisVelha = idadeMulher2;
      idadeMulherMaisNova = idadeMulher1;
    }

    // soma das idades do homem mais velho com a mulher mais nova
    int somaIdades = idadeHomemMaisVelho + idadeMulherMaisNova;

    System.out.println(
      "A soma das idades do homem mais velho com a mulher mais nova é: " +
      somaIdades
    );

    // produto das idades do homem mais novo com a mulher mais velha
    int produtoIdades = idadeHomemMaisNovo * idadeMulherMaisVelha;

    System.out.println(
      "O produto das idades do homem mais novo com a mulher mais velha é: " +
      produtoIdades
    );

    scanner.close();
  }
}
