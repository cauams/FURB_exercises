package unidade05.exerciciosSala;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Uni5Exe17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Double> alturaAtletas = new ArrayList<Double>();
		List<Integer> numeroInscricaoAtletas = new ArrayList<Integer>();
		
		int numeroDeInscricao = 0, numeroAtletas = 0;
		double alturaAtleta = 0.0, somaAltura = 0.0;
		
		while(true) {
			
			System.out.println("Digite o número de inscrição do atleta");
			numeroDeInscricao = scanner.nextInt();
			
			if(numeroDeInscricao == 0) {
				break;
			}
			
			System.out.println("Digite a altura do atleta: ");
			alturaAtleta = scanner.nextDouble();
			
			numeroAtletas++;
			somaAltura += alturaAtleta;
			
			alturaAtletas.add(alturaAtleta);
			numeroInscricaoAtletas.add(numeroDeInscricao);	
		}
		
		int maxIndex = alturaAtletas.indexOf(alturaAtletas.stream().max(Comparator.naturalOrder()).get());
		int minIndex = alturaAtletas.indexOf(alturaAtletas.stream().min(Comparator.naturalOrder()).get());
	
		double max = alturaAtletas.stream().max(Comparator.naturalOrder()).get();
		double min = alturaAtletas.stream().min(Comparator.naturalOrder()).get();
		
		System.out.println("O número de inscrição do maior atleta é: " + alturaAtletas.get(maxIndex) + " e a sua altura é de: " + max + "m");
		System.out.println("O número de inscrição do menor atleta é: " + alturaAtletas.get(minIndex) + " e a sua altura é de: " + min + "m");
		
		System.out.println("Média geral das alturas dos competidores: " + somaAltura / numeroAtletas);
		
		
		scanner.close();

	}

}
