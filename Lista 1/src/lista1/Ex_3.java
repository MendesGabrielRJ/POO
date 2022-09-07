package lista1;

/*
Crie o programa “mini calculadora”, que após ler dois números inteiros
apresenta as operações de soma, subtração, multiplicação e divisão com
eles.
Obs.: Trate o maior número possível de erros (ex: operações com números
negativos, divisão por zero, uso de letras, etc).
Exemplo:
Número 1: 5
Número 2: -2
Soma: 3
Subtração: 7
Multiplicação: -10
Divisão: -2.5
*/
import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double n1 = 0, n2, soma, sub, mult, div;
		int oper;
		
		System.out.println ("Digite o 1º valor: ");
			n1 = ler.nextDouble();
			
		System.out.println ("Digite o 2º valor: ");
			n2 = ler.nextDouble();
			
		System.out.println("Escolha uma operação: " + "\n" + "1 para SOMAR" +
		"\n" + "2 para SUBTRAIR" + "\n" + "3 para MULTIPLICAR" + "\n" + "4 para DIVIDIR" + "\n");
		System.out.println ("_____ ");
			oper = ler.nextInt();
		
		if(oper == 1){
			soma=(n1+n2);
				System.out.println ("O resultado é: " + soma);
				
		}else if(oper > 4){
			System.out.println ("\n" + "Opção inválida, volte e escolha umas das opções sugeridas: 1,2,3 ou 4!");
		
		}else if(oper == 2){
			sub=(n1-n2);
				System.out.println ("O resultado é: " + sub);
		
		}else if(oper == 3){
			mult=(n1*n2);
		System.out.println ("O resultado é: " + mult);
		
		}else if(oper == 4)
		
		{if(n2 != 0){
			div=(n1/n2);
		System.out.println ("O resultado é: " + div);
		
		}else {
		
			System.out.println ("Não se pode dividir um número por zero!");
		}
			ler.close();

		}
	}
}