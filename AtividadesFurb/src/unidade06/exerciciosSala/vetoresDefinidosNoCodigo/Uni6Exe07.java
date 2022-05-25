package unidade06.exerciciosSala.vetoresDefinidosNoCodigo;

import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("escreva o tamnaho do array:");
        int valor = sc.nextInt();

        int vetor[] = new int[valor];

        for(int i = 0; i < vetor.length; i++)
        {
            System.out.print("escreva o input:");
            int input = sc.nextInt();
            vetor[i] = input;
        }
        System.out.println("novo array com mesmo tamnho");
        int vetor2[] = new int[valor];

        boolean continuar = true;
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.print("escreva o input:");
            int input;
            do
            {
                input = sc.nextInt();

                continuar = false;

                for (int ii = 0; ii < vetor.length; ii++) 
                {
                    continuar = MesmoValor(input, vetor[ii],continuar);
                }
            }
            while(continuar);
            vetor2[i] = input;
        }
    }
    public static boolean MesmoValor(double valor1, double valor2,boolean c)
    {
             if(c == true)
             {
                 return true;
             }
        
            if(valor1 == valor2)
            {
                System.out.println("mesmo valor localizado");
                return true;
            }
            return false;
        
    }
    
}
