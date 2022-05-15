package unidade05.exerciciosSala;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uni5Exe07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 20; i++) {
			System.out.println("Digite 20 números! Número atual: " + i);
			Integer numero = scanner.nextInt();

			list.add(numero);
		}

		System.out.println("O menor número selecionado é: " + getMin(list));
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
