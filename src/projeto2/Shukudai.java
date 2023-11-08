package projeto2;

import java.util.Scanner;

public class Shukudai {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		
		System.out.println("Digite o valor de A");
		A = sc.nextInt();
		System.out.println("Digite o valor de B");
		B = sc.nextInt();
		System.out.println("Digite o valor de C");
		C = sc.nextInt();
		System.out.println("Digite o valor de D");
		D = sc.nextInt();
		
		sc.close();
		
		int diferenca = (A * B - C * D);
		
		System.out.println("DIFERENÇA = " + diferenca);
	
	}

}
