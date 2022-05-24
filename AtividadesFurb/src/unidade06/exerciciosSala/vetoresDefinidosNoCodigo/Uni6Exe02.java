package unidade06.exerciciosSala.vetoresDefinidosNoCodigo;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.RunElement;

public class Uni6Exe02 {
    public static void main(String[] args) 
    {
        double lista[] = new double[12];
        AdicioanarNaLista(lista);
        Double result = SomarTudo(lista);
        for(int i = 0; i < lista.length; i++)
        {
            if(lista[i] > result)
            {
                System.out.println("p--------p");
                System.out.println(lista[i]);
            }
          
        }
    }

    private static void AdicioanarNaLista(double lista[])
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < lista.length; i++)
        {
            lista[i] = sc.nextDouble();

        }
    }
    private static Double SomarTudo(double lista[])
    {
        double SomaTudo = 0;
        for(int i = 0; i < lista.length; i++)
        {
            SomaTudo += lista[i]; 
        }
        return SomaTudo / 12;
    }
}
