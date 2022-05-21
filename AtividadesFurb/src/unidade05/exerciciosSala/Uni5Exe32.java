package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe32 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Em qual dia da semana começa o mês?)");
        int dia = scanner.nextInt();
        System.out.println("Quantos dias tem o mês?");
        int dias = scanner.nextInt();
        System.out.println("D S T Q Q S S");
        System.out.println("-------------");
        for(int i = 1; i < dia; i++){
            System.out.print("  ");
        }
        for(int i = 1; i <= dias; i++){
            System.out.print("|" + i);
            if(dia == 7){
                dia = 1;
                System.out.print("\n");
            }else{
                dia++;
            }
        }

        scanner.close();

    }
    
}
