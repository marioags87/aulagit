package projeto4;

import java.util.Scanner;

public class Aula5 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senha = 0;
		
        //Estrutura de repetição OBS: Se a variavel while estiver no começo do codigo precisa atribuir valor para a senha

        while (!(senha == 2002)) {
        
        System.out.println("Digite a senha:");
		senha = sc.nextInt();
        
        if (senha == 2002) {
            System.out.println("Acesso Permitido");
        }
        else {
            System.out.println("Acesso Negado");
        }
                          
        }
		
        sc.close();
    }
    
}
