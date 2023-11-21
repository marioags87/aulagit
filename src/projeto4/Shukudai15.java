package projeto4;

import java.util.Random;
import java.util.Scanner;

public class Shukudai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gerar um número aleatório entre 1 e 100
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int palpite;

        // Loop até o usuário acertar o número
        do {
            // Solicitar ao usuário que faça um palpite
            System.out.println("Adivinhe o número (entre 1 e 100):");
            palpite = scanner.nextInt();

            // Verificar se o palpite é maior, menor ou igual ao número aleatório
            if (palpite > numeroAleatorio) {
                System.out.println("MUITO ALTO. TENTE NOVAMENTE.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("MUITO BAIXO. TENTE NOVAMENTE.");
            } else {
                System.out.println("ACERTOU MIZERÁVI!");
            }

        } while (palpite != numeroAleatorio);

        scanner.close();
    }
}
