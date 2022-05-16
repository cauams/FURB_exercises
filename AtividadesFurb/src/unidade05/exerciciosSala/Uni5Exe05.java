package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("quantas vezes você quer que essa operação ocorra");
        int numerovezes = scanner.nextInt();
       
       int num2 = 2;
       int result = 6;
       int soma = 8;
       boolean condition = true;
     for(int i = 1; i<= numerovezes; i++) 
     {
       if(condition)
       {
           soma += 2;
       }
       else
       {
           soma += result;
           result = num2 * result + num2;
       }
       condition = !condition;
       System.out.print(soma + " - ");
    }
       scanner.close();
    }    
}
