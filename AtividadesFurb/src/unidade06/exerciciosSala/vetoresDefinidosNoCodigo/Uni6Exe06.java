package unidade06.exerciciosSala.vetoresDefinidosNoCodigo;

import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);

        System.out.print("escreva o tamnaho do array:");
        int valor = sc.nextInt();

        double vetor[] = new double[valor];

        for(int i = 0; i < vetor.length; i++)
        {
            System.out.print("escreva o input:");
            double input = sc.nextDouble();
            vetor[i] = input;
        }

        double vetor2[] = new double[valor];
        System.out.println("escreva nova lista");
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.print("escreva o input:");
            double input = sc.nextDouble();
            vetor2[i] = input;
        }
        for (double d : vetor) {
            for (double e : vetor2) {
                MesmoValor(d,e);
            }
        }

    }
    public static void MesmoValor(double valor1, double valor2)
    {
        
            if(valor1 == valor2)
            {
                System.out.println("valor é existe em ambas as listas: " + valor1);
            }
        
    }
}