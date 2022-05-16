package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva numero de vezes que a piramide");
        int nmbVezes = sc.nextInt();
        int result = 1;
        for(int i = 1; i <= nmbVezes; i++)
        {
            for(int ii = 1; ii <= i; ii++)       
            {
                System.out.print(result + " ");
                result += 1;
            }
            System.out.println();
            
            sc.close();
        }
    }
}