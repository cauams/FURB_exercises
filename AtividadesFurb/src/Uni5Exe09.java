import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uni5Exe09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos da turma!");
		int qntAlunos = scanner.nextInt();
		int qntAlunosMaiores = 0;
		List<String> listaNomes = new ArrayList<String>();
		
		for(int i = 1; i <= qntAlunos; i++) {
			System.out.println("Digite a idade do aluno: " + i);
			int idade = scanner.nextInt();
			System.out.println("Digite o nome do aluno: " + i);
			String nome = scanner.next();
			
			if(idade >= 20) {
				qntAlunosMaiores ++;
			} else if (idade >= 18) {
				listaNomes.add(nome);
			} else {
				System.out.println("Idade inválida");
			}
		}
		System.out.println("Nome dos alunos que possuem 18 ou 19 anos: " + listaNomes);
		System.out.println("Quantidade de alunos com mais de 20 anos: " + qntAlunosMaiores);
		scanner.close();
		
	}

}
