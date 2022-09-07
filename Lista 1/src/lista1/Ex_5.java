package lista1;

//O programa “Riuju” escreve na tela o resultado das expressões abaixo:
//a. 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66
//Exemplo:
//O resultado da expressão é 256.
//b. 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9
//Exemplo:
//O resultado da expressão é 2421.

public class Ex_5 {

	public static void main(String[] args) {

		double a , b;
		
		a = 2 + 3 - (5 * 8) - 4 + 354 - 521 + (7 * 66);
		b = 2 + (7* (14 - 21)) + (28 * 3 * 42) + 740 - 156 + 4 + (40 * 9);  

		System.out.println ("O resultado de 2 + 3 - (5 * 8) - 4 + 354 - 521 + (7 * 66) é: " + a);
		System.out.println ("\nO resultado de 2 + (7* (14 - 21)) + (28 * 3 * 42) + 740 - 156 + 4 + (40 * 9) é: " + b);
	}
}
