package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de paradas: ");
		int qntParadas = scanner.nextInt();
		System.out.println("Digite o limite do tanque de gasolina");
		double limiteTanque = scanner.nextDouble();
		
		double kmPercorrido = 0.0;
		double litrosUltilizados = 0.0;
		
		for(int i = 1; i <= qntParadas; i++) {
			System.out.println("Qual número estava no odometro em km na parada: " + i);
			double odometroParada = scanner.nextDouble();
			System.out.println("Quantos litros de gasolina foram gastos até a parada: " + i);
			double litrosGastos = scanner.nextDouble();
			double kmPorLitro = odometroParada / (limiteTanque - litrosGastos);
			
			System.out.println("A quilometragem por litro da parada " + i + " é de: " + kmPorLitro);
			
			kmPercorrido += odometroParada;
			litrosUltilizados += litrosGastos;
		}

		double kmMedio = kmPercorrido / litrosUltilizados;
		
		System.out.println("A quilometragem média da viagem foi de: " + kmMedio);
		
		scanner.close();
	}

}
