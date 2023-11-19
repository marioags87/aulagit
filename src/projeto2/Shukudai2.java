package projeto2;

import java.util.Scanner;

public class Shukudai2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Funcionario, Horas; 
		double Valor;
		
		System.out.println("Digite o número do funcionário");
		Funcionario = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas");
		Horas = sc.nextInt();
		System.out.println("Digite o valor da hora trabalhada");
		Valor = sc.nextDouble();
				
		sc.close();
		
		double salario = (Horas * Valor);
				
		System.out.println("Número do Funcionário = " + Funcionario);
		System.out.printf("Salário = R$ %.2f", salario);
	}

}
