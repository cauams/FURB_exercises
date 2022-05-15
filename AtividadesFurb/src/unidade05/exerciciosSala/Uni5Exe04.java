package unidade05.exerciciosSala;

public class Uni5Exe04 {
    public static void main(String[] args) {
        double soma = 0.0;
        double dividendo = 0.0;
        for (double i = 1.0; i <= 20; i += 2) {
            dividendo += 2;
            soma += i / dividendo;
        }
        System.out.println(soma);
    }
}
