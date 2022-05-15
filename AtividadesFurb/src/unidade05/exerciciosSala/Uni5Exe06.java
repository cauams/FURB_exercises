package unidade05.exerciciosSala;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double soma = 0;
		double resultado = 0;
		
		for(int i = 0; i < 20; i++) {
			System.out.println("Digite 20 alturas! Altura atual: " + i);
			double altura = scanner.nextDouble();
			soma += altura;
		}
		
		resultado = soma / 20;
		
		System.out.println("A média das alturas é de: " + df.format(resultado));
		
		scanner.close();

	}

}
