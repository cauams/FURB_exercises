package unidade05.exerciciosSala;

public class Uni5Exe11 {
    public static void main(String[] args) {
        
        double biscoitosQuebradosTOTAL = 0;
        double biscoitosQuebrados = 1.0;
        for(int hrs = 1; hrs <= 15; hrs++ )
        {
                System.out.println("BISCOITOS QUEBRADOS :C = "+ biscoitosQuebrados);
                biscoitosQuebrados = Math.pow(3, hrs);
                biscoitosQuebradosTOTAL += biscoitosQuebrados;
        }
        System.out.println("TOTAL QUEBRADOS :P = "+ biscoitosQuebradosTOTAL + 1);
    }
}
