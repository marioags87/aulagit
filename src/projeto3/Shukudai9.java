package projeto3;

import java.util.Scanner;

public class Shukudai9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double p1 = 4.0, p2 = 4.5, p3 = 5.0, p4 = 2.0, p5 = 1.5;
		int item, quantidade;
		double conta = 0;
		boolean stop = false;
		
		//estrutura de repetição sem limitações de vezes/quantidade
		
		while (!stop) {
			System.out.println("Digite o código do item. Digite 0 para fechar a conta");
			item = sc.nextInt();
			if (item == 0)
				stop = true;
			else {
				System.out.println("Digite a quantidade do item");
				quantidade = sc.nextInt();

				switch (item) {
				case 1:
					conta += quantidade * p1;
					break;
				case 2:
					conta += quantidade * p2;
					break;
				case 3:
					conta += quantidade * p3;
					break;
				case 4:
					conta += quantidade * p4;
					break;
				default:
					conta += quantidade * p5;
				}

			}
		
		}

		System.out.printf("Total: R$ %.2f", conta);
		
		sc.close();
	}

}
