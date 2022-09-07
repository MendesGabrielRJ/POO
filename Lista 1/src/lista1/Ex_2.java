package lista1;

//O programa “Tempo de vida” irá imprimir a soma das idades de todos os
//colegas da sua equipe (6 pessoas). Pergunte a cada um a idade e não
//esqueça a sua! Depois faça a atribuição direta da expressão em uma
//variável inteira.
//Exemplo:
//Qual é a idade do colega 1? 20
//Qual é a idade do colega 2? 24
//Qual é a idade do colega 3? 27
//Qual é a idade do colega 4? 30
//Qual é a idade do colega 5? 18
//Qual é a minha idade? 44
//O tempo de vida meu e dos meus colegas é 163.

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int cont = 1, idade, minhaIdade, totalDeles = 0, totalGeral = 0;
		
		System.out.println("Qual é a sua idade: ");
		minhaIdade = ler.nextInt();
		
		do {
			System.out.println ("\nQual é a idade do colega " + cont + "? ");
			idade = ler.nextInt();
			totalDeles += idade;
			cont++;
			
		}while (cont <= 5);{
			totalGeral += totalDeles + minhaIdade;
			
					System.out.println ("\nO tempo de vida meu e dos meus colegas é de: " + totalGeral + " anos.");
		
				ler.close();	
		}
	}

}
