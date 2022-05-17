package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nomeAluno = "";
		double nota1, nota2, media;
		
		while(! nomeAluno.toLowerCase().equals("fim")) {
			System.out.println("Qual o nome do aluno?");
			nomeAluno = scanner.next();

			System.out.println("Informe a primeira nota: ");
			nota1 = scanner.nextDouble();
			
			System.out.println("Informe a segunda nota: ");
			nota2 = scanner.nextDouble();
			
			media = (nota1 + nota2) / 2;
			
			System.out.println("///////////");
			System.out.println("A média do aluno é de: " + media);
			System.out.println("///////////");
		}
		
		scanner.close();
	}

}
