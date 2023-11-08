package projeto2;

import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, soma;
		
		System.out.println("Digite o primeiro número para a soma");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número para a soma");
		n2 = sc.nextInt();
		
		sc.close();
		
		soma = n1 + n2;
		System.out.println("SOMA = " + soma);
		
	}

}
