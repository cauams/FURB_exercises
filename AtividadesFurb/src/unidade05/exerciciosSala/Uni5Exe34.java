package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe34 {

    public static void main(String[] args) {

        String nome = "";
        double diarias = 0;
        int conta = 0;
        int opcao = 0;
        double total = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite o número da opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do hóspede: ");
                    nome = scanner.next();
                    System.out.println("Digite o número de diárias: ");
                    diarias = scanner.nextInt();
                    if (diarias < 15) {
                        total = diarias * 50 + 7.5;
                    } else if (diarias == 15) {
                        total = diarias * 50 + 6.5;
                    } else {
                        total = diarias * 50 + 5;
                    }
                    System.out.println("O nome do hóspede é: " + nome);
                    System.out.println("O total a ser pago é: " + total);
                    conta++;
                    break;
                case 2:
                    System.out.println("O número de hóspedes que deixaram o hotel é: " + conta);
                    break;
                case 3:
                    System.out.println("Obrigado por utilizar o programa!");
                    break;
                default:
                    System.out.println("Opção incorreta!");
                    break;
            }
        } while (opcao != 3);


        scanner.close();
        

    }
    
}
