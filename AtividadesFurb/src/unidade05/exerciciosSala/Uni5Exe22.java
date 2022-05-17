package unidade05.exerciciosSala;

import java.util.Scanner;

public class Uni5Exe22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int ano = 1995;
		double salario = 2000.00, aumentoSalario = 0.0, aumentoSalarioSequencial = 0.0;
		System.out.println("Digite o ano atual");
		int anoAtual = scanner.nextInt();
		if(ano < 1995) {
			ano = 0;
		}
		
		while(true) {
			ano++;
			
			if(ano == 1996) {
				aumentoSalario = salario * 0.15;
				salario += aumentoSalario;
			} else if (ano <= ano) {
				aumentoSalarioSequencial = aumentoSalario * 2;
				salario += aumentoSalarioSequencial;
			} if(ano > anoAtual) {
				break;
			}
		}
		
		System.out.println("Salario atual: " + salario);
		
		scanner.close();
	}

}
