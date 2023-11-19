package projeto4;

import java.util.Scanner;

public class Shukudai10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um número de 0 a 100");
		numero = sc.nextDouble();
		
		sc.close();
		
		if (numero >= 0 && numero <= 25) {
			System.out.println("Intervalo (0 a 25)");
		}
		else if (numero > 25 && numero <= 50) {
			System.out.println("Intervalo (25 a 50)");
		}
		else if (numero > 50 && numero <= 75) {
			System.out.println("Intervalo (50 a 75)");
		}
		else if (numero > 75 && numero <= 100) {
			System.out.println("Intervalo (75 a 100)");
		}
		else {
			System.out.println("Fora do Intervalo");
		}
	} 
}
	
