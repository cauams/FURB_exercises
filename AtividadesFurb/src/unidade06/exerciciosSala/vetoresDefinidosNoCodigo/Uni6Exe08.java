package     unidade06.exerciciosSala.vetoresDefinidosNoCodigo;

import java.util.*;

public class Uni6Exe08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Double> arraylist = new ArrayList<Double>();

        int index = scanner.nextInt();

        if (index > 20) {
            System.out.println("Número inválido.");
            System.exit(0);
        }

        ler(index, arraylist);
        freq(arraylist);
    }

    static void ler(int index, List<Double> list) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < index; i++) {
            System.out.println("Digite números! | número atual: " + (i + 1));
            Double num = scanner.nextDouble();
            list.add(num);
        }
    }

    static void freq(List<Double> list) {

        Set<Double> set = new HashSet(list);
        Collections.sort(list);
        for (Double s : set) {
            System.out.println(s + " : " + Collections.frequency(list, s));

        }
    }
}
