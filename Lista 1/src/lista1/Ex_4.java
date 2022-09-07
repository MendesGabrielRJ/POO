package lista1;

//4. O programa “termômetro” lê uma temperatura em graus celsius, e devolve
//sua equivalência na escala fahrenheit. (Use: F = C * 1, 8 + 32)
//Exemplo:
//Temperatura em °C: 30°
//Temperatura em °F: 86°

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		
		double tempC, tempF;
		Scanner ler = new Scanner(System.in);
		
		System.out.println ("Digite a temperatura em Celcius a ser convertida: ");
		tempC = ler.nextDouble();
		
		tempF = (tempC*1.8+32);
		System.out.println(tempC + "° é equivalente a: " + tempF + "°F");
			
		ler.close();
		}

	}
