package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalCasas = 0;
        
        double[] totalCasasCanal = new double[4];
        int[] totalCanals = new int[4];
        totalCanals[0] = 4;
        totalCanals[1] = 5;
        totalCanals[2] = 7;
        totalCanals[3] = 12;
        
        double porcetagem;

        int i = 0;
        while(i <= 3)
        {
            totalCasasCanal[i] = sc.nextInt();
            i++;
        }
        totalCasas = totalCasasCanal[0] +  totalCasasCanal[1] +  totalCasasCanal[2] +  totalCasasCanal[3];
        i = 0;
        System.out.println("total casas =" + totalCasas);
        while(i <= 3)
        {
            porcetagem = (100 / totalCasas);
           
           
            double valor  = porcetagem *  totalCasasCanal[i];
            System.out.println("porcentagem casas canal "+totalCanals[i]+" = " + valor);  
            i++;           
        }

        sc.close();
    }
}
