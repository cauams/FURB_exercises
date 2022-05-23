package unidade06.exerciciosSala.vetoresDefinidosNoCodigo;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Uni6Exe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vetor[] = new double[12];
        double todosValoresSomados = 0;
        for(int i = 0; i<12; i++)
        {
            
            System.out.println("Escreva numero: ");
            vetor[i] = sc.nextDouble();
            todosValoresSomados += vetor[i];
        }
        double media  = todosValoresSomados / vetor.length;
        
        for(int i = 0; i<12; i++)
        {
            if(vetor[i] > media)
            {
                System.out.println(vetor[i]);
            }
           
        }
    }
}
