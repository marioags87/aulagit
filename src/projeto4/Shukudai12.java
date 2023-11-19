package projeto4;

import java.util.Scanner;

public class Shukudai12 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double dinheiro, aposta;
		
		System.out.println("Digite o valor que você tem na conta:");
		dinheiro = sc.nextDouble();
		
        if (dinheiro <= 0){
            System.out.println("Você não pode apostar");
            System.exit (0);
        }
            System.out.printf("Você tem, R$ %.2f na conta.%n", dinheiro);		
        
        if (dinheiro < 500) {
			System.out.print("Cuidado! Aposte com cautela. \n");
						
		} else if (dinheiro < 1000) {
			System.out.print("Considere apostar com moderação. \n");
			
		} else {
			System.out.print("Você pode apostar à vontade. \n");
			
		}
            System.out.print("Quanto você quer apostar? ");
            aposta = sc.nextDouble();
            if (aposta <= 0) {aposta = 0;}
			System.out.printf("Você apostou R$%.2f%n", aposta);
			System.out.printf("Agora você tem R$%.2f na conta", dinheiro-aposta);
	    
            sc.close();
    }
}
