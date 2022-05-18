package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Qual valor você se recusa a pagar: ");
		double valorNegado = scanner.nextDouble();
		
		int precoPedacoUltrapassado = 0, trechosInformados = 0, trechosAcimaDe150kmAceitos = 0;
		
		while(true) {
			System.out.println("Pedágio: ");
			
			Double precoPedagio = scanner.nextDouble();
			
			if(precoPedagio < 0) {
				break;
			}
			
			System.out.println("Distância: ");
			double distancia = scanner.nextDouble();
			
			trechosInformados++;
			
			if(precoPedagio > valorNegado) {
				precoPedacoUltrapassado++;
			}
			
			if(distancia >= 150 && precoPedagio < valorNegado) {
				trechosAcimaDe150kmAceitos++;
			}
		}
		
		System.out.println(precoPedacoUltrapassado + "( trechos com valor acima do qual ele nega-se a pagar)");
		System.out.println(trechosInformados + " (quantidade de trechos informados)");
		System.out.println( trechosAcimaDe150kmAceitos + " (trechos acima de 150km com valor aceito por ele)");
		
		scanner.close();
	}

}
