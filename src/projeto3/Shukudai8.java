package projeto3;

import java.util.Scanner;

public class Shukudai8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double p1 = 4.0, p2 = 4.5, p3 = 5.0, p4 = 2.0, p5 = 1.5;
		int item, quantidade;
		double conta = 0;
		
		//estrutura de repetição limitada
		
		for (int i = 0; i < 3; i++) {
		System.out.println("Digite o código do item");
		item = sc.nextInt();
		System.out.println("Digite a quantidade do item");
		quantidade = sc.nextInt();
				
				
		switch (item) {
		case 1:
			conta += quantidade * p1;
			break;
		case 2: conta += quantidade * p2;
			break;
		case 3: conta += quantidade * p3;
			break;
		case 4: conta += quantidade * p4;
			break;
		default: conta += quantidade * p5; }}

		System.out.printf("Total: R$ %.2f", conta);
		
		sc.close();
	}

}
