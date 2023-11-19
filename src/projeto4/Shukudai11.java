package projeto4;

import java.util.Scanner;

public class Shukudai11 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número de 1 a 100");
		numero = sc.nextInt();
		
		sc.close();
        if (numero % 2 > 0) {
            System.out.println("Estranho");
        }
        else if (numero == 2 || numero == 4) {
            System.out.println("Normal");
        }
        else if (numero >= 6 && numero <= 20) {
            System.out.println("Estranho");
        }
        else {
            System.out.println("Normal");
        }
        
    }
}
