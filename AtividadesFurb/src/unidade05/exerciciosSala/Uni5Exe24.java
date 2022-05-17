package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        boolean continuar = true;
        while(continuar)
        {
            double limiteDePesoDiario  = sc.nextDouble();
            double pesoDoPeixe = sc.nextDouble();
            pesoDoPeixe = pesoDoPeixe / 100;

            if(pesoDoPeixe > limiteDePesoDiario)
            {
                System.out.println("Peso Excedido");
            }
            System.out.println("Deseja continuar");
            String result = sc.next();
            if(result.equals("N")) 
            {
                continuar = false;
            }
        }
    }
}
