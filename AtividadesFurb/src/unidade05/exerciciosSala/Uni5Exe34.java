package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe34 {

    public static void main(String[] args) {
        
        /*
        Um hotel cobra R$ 50,00 de diária por hóspede e mais uma taxa de serviços. A taxa de serviços é de:

R$ 7,50 por diária, caso o número de diárias seja menor que 15;
R$ 6,50 por diária, caso o número de diárias seja igual a 15;
R$ 5,00 por diária, caso o número de diárias seja maior que 15.
Descreva um algoritmo que apresente as seguintes opções ao recepcionista:

(1) encerrar a conta de um hóspede;
(2) verificar número de contas encerradas;
(3) sair.
Caso a opção escolhida seja a primeira, leia o nome e o número de diárias do hóspede e escreva o nome e total a ser pago. Caso a opção escolhida seja a segunda, informe o número de hóspedes que deixaram o hotel (número de contas encerradas). Caso a opção escolhida seja a terceira finalize a execução do algoritmo.


        
        
        */

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
