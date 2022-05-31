package unidade06.exerciciosSala.vetoresDefinidosNoCodigo;

import java.util.Locale;
import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {

        String[] menino = new String[5];
        String[] menina = new String[5];
        String[] respostasMenino = new String[5];
        String[] respostasMenina = new String[5];

        String[] perguntas = new String[5];

        perguntas[0] = "Gosta de música sertaneja?";
        perguntas[1] = "Gosta de futebol?";
        perguntas[2] = "Gosta de seriados?";
        perguntas[3] = "Gosta de redes sociais?";
        perguntas[4] = "Gosta da Oktoberfest?";

        ler(respostasMenino, respostasMenina, perguntas);
        calc(respostasMenino, respostasMenina);
    }

    static void ler(String respostasMenino[], String respostasMenina[],String perguntas[]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println(perguntas[i]);
            System.out.println("Digite a resposta do menino = ");
            respostasMenino[i] = scanner.next();

            System.out.println("Digite a resposta da menina = ");
            respostasMenina[i] = scanner.next();

        }
    }

    static void calc(String respostasMenino[], String respostasMenina[]) {

        int afinidade = 0;

        for (int i = 0; i < 5; i++) {

            if (respostasMenino[i].equals("sim") && respostasMenina[i].equals("sim")) {
                afinidade += 3;
            }
            if (respostasMenino[i].equals("sim") && respostasMenina[i].equals("ind")) {
                afinidade += 1;
            }
            if (respostasMenino[i].equals("ind") && respostasMenina[i].equals("sim")) {
                afinidade += 1;
            }
            if (respostasMenino[i].equals("sim") && respostasMenina[i].equals("nao")) {
                afinidade -= 2;
            }
            if (respostasMenino[i].equals("nao") && respostasMenina[i].equals("sim")) {
                afinidade -= 2;
            }
            if (respostasMenino[i].equals("nao") && respostasMenina[i].equals("ind")) {
                afinidade -= 2;
            }
            if (respostasMenino[i].equals("ind") && respostasMenina[i].equals("nao")) {
                afinidade -= 2;
            }
        }

        System.out.println("A afinidade foi de: " + afinidade);

        if (afinidade >= 15) {
            System.out.println("Casem");
        }
        if (afinidade >= 10 && afinidade < 15) {
            System.out.println("Vocês tem muita coisa em comum");
        }
        if (afinidade >= 5 && afinidade < 10) {
            System.out.println("Talvez não de certo :/");
        }
        if (afinidade >= 0  && afinidade < 5) {
            System.out.println("Vale um encontro");
        }
        if (afinidade  >= -9 && afinidade < 0) {
            System.out.println("Melhor não perder tempo");
        }
        if (afinidade < -9) {
            System.out.println("Vocês se odeiam");
        }
    }
}
