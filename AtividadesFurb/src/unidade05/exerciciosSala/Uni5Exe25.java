package unidade05.exerciciosSala;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva os pontos");
        int maiorPontuador;
        int pontosD = 0;
        int pontosE = 0;
        boolean continuar = true;
        boolean vaiADois = false;
        while(continuar)
        {
            System.out.println("Quem marcou:");
            int i = sc.nextInt();
            if(i == 1)
            {
                pontosD++;
            }
            else if(i == 2)
            {
                pontosE++;
            }
            if(pontosD >= 20 && pontosE >= 20 && pontosD == pontosE)
            {
                vaiADois = true;
            }
            if(vaiADois)
            {
                if(pontosD >= pontosE + 2)
                {
                    continuar = false;
                }
                else if(pontosE >= pontosD + 2)
                {
                    continuar =false;
                }
            }
            else{
                if(pontosD > 21)
                {
                    continuar = false;
                }
                else if(pontosE > 21)
                {
                    continuar = false;
                }
            }
        }
        System.out.println("ganhou");
    }
}