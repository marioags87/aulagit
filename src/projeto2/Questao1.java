package projeto2;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double raio, pi, area;
		
		System.out.println("Digite o valor do raio do circulo");
		raio = sc.nextDouble();
		pi = 3.14159;
		
		sc.close();
		
		area = pi*Math.pow(raio, 2);
		
		System.out.printf("AREA = %.4f", area);
	}

}
