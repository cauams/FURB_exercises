package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe19 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double precoSoma = 0.0, preco = 0.0;
		
		
		while(true) {
			System.out.println("Digite o valor da compra: ");
			preco = scanner.nextDouble();
			
			if(preco == 0) {
				break;
			} else if(preco > 500) {
				preco = preco - (preco * 0.2);
				precoSoma += preco;
			} else if (preco <= 500) {
				preco = preco - (preco * 0.15);
				precoSoma += preco;
			}
			
			System.out.println("O valor final desta compra foi de: " + preco + " reais!");
		}
		
		System.out.println("O valor total recebido pela loja é de: " + precoSoma);
		
		
		scanner.close();

	}

}
