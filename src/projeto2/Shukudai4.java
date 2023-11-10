package projeto2;

import java.util.Scanner;

public class Shukudai4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		System.out.println("Digite o valor de A");
		A = sc.nextDouble();
		System.out.println("Digite o valor de B");
		B = sc.nextDouble();
		System.out.println("Digite o valor de C");
		C = sc.nextDouble();
		double pi = 3.14159;
				
		sc.close();
		
		double AreaTrianguloReto = (A * C)/2;
		double AreaCirculo = pi*Math.pow(C, 2);
		double AreaTrapezio = ((A + B) * C)/2;
		double AreaQuadrado = B * B;
		double AreaRetangulo = A * B;
		
		System.out.printf("Área do Triângulo Retângulo = %.3f", + AreaTrianguloReto);
		System.out.printf("\nÁrea do Círculo = %.3f", AreaCirculo);
		System.out.printf("\nÁrea do Trapézio = %.3f", AreaTrapezio);
		System.out.printf("\nÁrea do Quadrado = %.3f", AreaQuadrado);
		System.out.printf("\nÁrea do Retângulo = %.3f", AreaRetangulo);	
				
	}

}
