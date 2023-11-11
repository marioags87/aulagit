package projeto3;

import java.util.Scanner;

public class Aula3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String resultado;
		
		System.out.println("Digite um número");
		numero = sc.nextInt();
		
		sc.close();
		
		//string Condicional
		if (numero < 0)
			System.out.println("NEGATIVO");
		else 
			System.out.println("NÃO NEGATIVO");
		//string Operador Ternário
		resultado = numero < 0 ? "NEGATIVO" : "NÃO NEGATIVO";
		System.out.println(resultado);
		
	}

}
