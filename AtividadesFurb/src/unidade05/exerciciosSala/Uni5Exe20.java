package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double massa = 0.0, massaInicial = 0.0, segundos = 0.0;
		
		System.out.println("Digite a massa do personagem: ");
		massa = scanner.nextDouble();
		massaInicial = massa;
		while(true) {
			
			massa -= massa / 2;
			segundos += 50;
			
			if(massa < 0.5) {
				break;
			} 
		}
		
		System.out.println("A massa inicial foi de: " + massaInicial);
		System.out.println("A massa final é de: " + massa);
		System.out.println("Tempo estimado em segundos: " + segundos);
		
		scanner.close();

	}

}
