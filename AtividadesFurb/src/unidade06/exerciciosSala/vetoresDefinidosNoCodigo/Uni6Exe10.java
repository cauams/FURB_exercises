package unidade06.exerciciosSala.vetoresDefinidosNoCodigo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Uni6Exe10 {

  private Uni6Exe10() {
    List<Integer> intLista = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha uma opção: ");
    System.out.println("===================\n");

    System.out.println("1 -> Incluir valor");
    System.out.println("2 -> Pesquisar valor");
    System.out.println("3 -> Alterar valor");
    System.out.println("4 -> Excluir valor");
    System.out.println("5 -> Mostrar valores");
    System.out.println("6 -> Ordenar valores");
    System.out.println("7 -> Inverter valores");
    System.out.println("8 -> Sair do sistema\n");

    while (true) {

    System.out.println("Qual opção você deseja? = ");
    int opt = scanner.nextInt();
    System.out.println();

      switch (opt) {
        case 1:
          adcionarNumero(intLista, scanner);
          System.out.println();
          break;

        case 2:
          procurarNumero(intLista, scanner);
          System.out.println();
          break;

        case 3:
          aletrarNumero(intLista, scanner);
          System.out.println();
          break;
        case 4:
          deletarNumero(intLista, scanner);
          System.out.println();
          break;
        case 5:
          mostrarLista(intLista);
          break;
        case 6:
          ordenarNumero(intLista);
          break;
        case 7:
          inverterLista(intLista);
          break;
        case 8:
          fecharSistema();
          break;
      }

      
    }
  }

  private void adcionarNumero(List<Integer> lista, Scanner userInput) {
    System.out.println("Digite o número a ser incluido na lista");
    int numero = userInput.nextInt();

    if (lista.size() >= 3) {
      System.out.println(
        "O número: " +
        numero +
        " não foi inserido na lista, pois ela já está cheia!"
      );
    } else {
      lista.add(numero);
      System.out.println("O número: " + numero + " foi adcionado na lista!");
    }
  }

  private void procurarNumero(List<Integer> lista, Scanner userInput) {
    System.out.println("Digite o valor que você quer pesquisar na lista: ");
    int valor = userInput.nextInt();

    if(lista.contains(valor)) {
      System.out.println("O número: " + valor + " está presente na lista!");
    } else {
      System.out.println("O número: " + valor + " não está na lista!");
    }
  }

  private void aletrarNumero(List<Integer> lista, Scanner userInput) {
    System.out.println();
    System.out.println("Digite o número que você deseja alterar: ");

    int numero = userInput.nextInt();

    if(lista.contains(numero)) {
      int indexNumero = lista.indexOf(numero);
      System.out.println("Digite qual número você quer por no lugar de: " + numero);
      int novoNumero = userInput.nextInt();

      lista.set(indexNumero, novoNumero);

      System.out.println("O número foi alterado com sucesso.");
    } else {
      System.out.println("O número: " + numero + " não está presente na lista!");
    }
  }

  private void deletarNumero(List<Integer> lista, Scanner userInput) {
    System.out.println("Digite o número que você quer deletar: ");
    int numero = userInput.nextInt();

    if (lista.contains(numero)) {
      int indexNumero = lista.indexOf(numero);
      lista.remove(indexNumero);
      System.out.println("Número " + numero + " deletado com sucesso.");
    } else {
      System.out.println("O número: " + numero + " não está presente na lista!");
    }
  }

  private void mostrarLista(List<Integer> lista) {
    
    if(lista.isEmpty()) {
      System.out.println("A lista está vazia. \n");
    } else {
      System.out.println("Valores na lista: " + lista + "\n");
    }
  }

  private void ordenarNumero(List<Integer> lista) {
    Collections.sort(lista);
  }

  private void inverterLista(List<Integer> lista) {
    Collections.reverse(lista);
  }

  private void fecharSistema() {
    System.exit(0);
  }

  // Construtor 
  public static void main(String[] args) {
    new Uni6Exe10();
  }
}
