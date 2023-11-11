package projeto3;

import java.util.Scanner;

public class Shukudai5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int resto;
		
		System.out.println("Digite um número");
		numero = sc.nextInt();
		
		sc.close();
		
		// A % entrega o resto da divisão
		
		resto = numero % 2;
		
		//string Condicional
		
		if (resto > 0)
			System.out.println("IMPAR");
		else 
			System.out.println("PAR");
		
	}

}
