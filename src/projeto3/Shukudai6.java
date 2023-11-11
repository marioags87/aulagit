package projeto3;

import java.util.Scanner;

public class Shukudai6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		int resto1;
		int resto2;
		
		System.out.println("Digite um número");
		A = sc.nextInt();
		System.out.println("Digite um número");
		B = sc.nextInt();
		
		sc.close();
		
		resto1 = A % B;
		resto2 = B % A;
		
		if (resto1 == 0 || resto2 == 0)
			System.out.println("MULTIPLOS");
		else 
			System.out.println("NÃO MULTIPLOS");

	}

}
