package unidade05.exerciciosSala;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberlist = new ArrayList<Integer>();

        System.out.println("Insira a quantidade de números");
        


        scanner.close();
    }

    	public static Integer getMin(List<Integer> list) {
		Integer min = Integer.MAX_VALUE;
		for (Integer i : list) {
			if (min > i) {
				min = i;
			}
		}
		return min;
	}
}
