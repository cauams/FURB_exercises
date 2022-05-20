package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        int cedula20 = 20;
        int cedula10 = 10;
        int cedula5 = 5;
        int cedula2 = 2;
        int cedula1 = 1;
        String totalNotas = "Total notas:";
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();
        int qtdNotas20 = 0;
        int qtdNotas10 = 0;
        int qtdNotas5 = 0;
        int qtdNotas2 = 0;
        int qtdNotas1 = 0;
        while(valor > 0)
        {
            if(valor >= 20)
            {
                valor = valor - cedula20;
                qtdNotas20++;
            }
            else if (valor >= 10)
            {
                valor = valor - cedula10;
                qtdNotas10++;
            }
            else if (valor >= 5)
            {
                valor = valor - cedula5;
                qtdNotas5++;
            }
            else if (valor >=2)
            {
                valor = valor - cedula2;
                qtdNotas2++;
            }
            else if (valor>= 1)
            {
                valor = valor - cedula1;
                qtdNotas1++;
            }
        }
        
        if(qtdNotas20 > 0)
        totalNotas += "\n 20 - " + qtdNotas20; 
        if(qtdNotas10 > 0)
        totalNotas += "\n 10 - " + qtdNotas10; 
        if(qtdNotas5 > 0)
        totalNotas += "\n 5 - " + qtdNotas5; 
        if(qtdNotas2 > 0)
        totalNotas += "\n 2 - " + qtdNotas2; 
        if(qtdNotas1 > 0)
        totalNotas += "\n 1 - " + qtdNotas1; 

        System.out.println(totalNotas);

        sc.close();
    }
}
