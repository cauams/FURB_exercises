package unidade05.exerciciosSala;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberlist = new ArrayList<Integer>();

        System.out.println("Insira a quantidade de números");
        int num = scanner.nextInt();
        double numerosPositivos = 0;
        int qntNumerosPositivos = 0;
        
        for (int i = 1; i <= num; i++) {
        	System.out.println("Digite números! " + i + " de " + num);
        	int numero = scanner.nextInt();
        	
        	if(numero < 0) {
        		numberlist.add(numero);
        	} else {
        		qntNumerosPositivos++;
        		numerosPositivos += numero;      		
        	}
        }
        
        System.out.println("O menor número negativo é: " + getMin(numberlist));
        System.out.println("A média dos números positivos é de: " +  numerosPositivos / qntNumerosPositivos);
        
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
