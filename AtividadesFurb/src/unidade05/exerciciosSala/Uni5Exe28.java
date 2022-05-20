package unidade05.exerciciosSala;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe28 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, voto = 0, total = 0;
        double percentual1 = 0.0, percentual2 = 0.0, percentual3 = 0.0, percentual4 = 0.0;

        do {

            System.out.println("Opção 1 =  CPM22.");
            System.out.println("Opção 2 =  Skank.");
            System.out.println("Opção 3 =  Jota Quest.");
            System.out.println("Opção 4 =  Nenhum dos anteriores.");

            voto = scanner.nextInt();

            switch(voto) {
                case 1 : voto1++;
                break;
                case 2 : voto2++;
                break;
                case 3 : voto3++;
                break;
                case 4 : voto4 ++;
                break;
                default : System.out.println("Voto inválido.");
            }

            System.out.println("Você deseja votar novamente? S/N");
            String opt = scanner.next();

            if(opt.toLowerCase().equals("s")) {
                System.out.println("///////////////////////////");
                System.out.println("Novo voto: ");
                System.out.println("");
            }
            if(opt.toLowerCase().equals("n")) {
                break;
            }
          
        } while(voto != 0);

        total = voto1 + voto2 + voto3 + voto4;

        percentual1 = (voto1 * 100) / (double)total;
        percentual2 = (voto2 * 100) / (double)total; 
        percentual3 = (voto3 * 100) / (double)total; 
        percentual4 = (voto4 * 100) / (double)total; 

        System.out.println("Votos do  CPM22 = " + voto1 + " com: " + df.format(percentual1) + "% de votos.");
        System.out.println("Votos do  Skank = " + voto2 + " com: " + df.format(percentual2) + "% de votos.");
        System.out.println("Votos do  Jota Quest = " + voto3 + " com: " + df.format(percentual3) + "% de votos.");
        System.out.println("Nenhuma das anteriores = " + voto4 + " com: " + df.format(percentual4) + "% de votos.");

        if(voto1 > voto2 && voto1 > voto3 && voto1 > voto4) {
            System.out.println("CPM22 ganhou a votação!");
        }
        if(voto2 > voto1 && voto1 > voto3 && voto1 > voto4) {
            System.out.println("Skank ganhou a votação!");
        }
        if(voto3 > voto2 && voto1 > voto1 && voto1 > voto4) {
            System.out.println("Jota Quest ganhou a votação!");
        }
        if(voto4 > voto1 && voto4 > voto2 && voto4 > voto3) {
            System.out.println("O público se recusou a votar em alguma das bandas.");
        }
        
        scanner.close();
    }
    
}
