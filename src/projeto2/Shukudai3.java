package projeto2;

import java.util.Scanner;

public class Shukudai3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int CodP1, QtP1; 
		double ValorUniP1;
		int CodP2, QtP2;
		double ValorUniP2;
		
		System.out.println("Digite o código da primeira peça");
		CodP1 = sc.nextInt();
		System.out.println("Digite a quantidade de unidades");
		QtP1 = sc.nextInt();
		System.out.println("Digite o valor unitário por peça");
		ValorUniP1 = sc.nextDouble();
		System.out.println("Digite o código da segunda peça");
		CodP2 = sc.nextInt();
		System.out.println("Digite a quantidade de unidades");
		QtP2 = sc.nextInt();
		System.out.println("Digite o valor unitário por peça");
		ValorUniP2 = sc.nextDouble();
				
		sc.close();
		
		double Total = (QtP1 * ValorUniP1 + QtP2 * ValorUniP2);
		
		System.out.printf("Valor Total a Pagar = R$ %.2f", + Total);
		
	}

}
