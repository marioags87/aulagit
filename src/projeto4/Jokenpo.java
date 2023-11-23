package projeto4;

import java.util.Scanner;

public class Jokenpo {

  public static void main(String[] args) {
    int jogador, computador;

    Scanner sc = new Scanner(System.in);

    //Layout inicial do jogo

    System.out.println("     Jo Ken Pô     ");
    System.out.println("Digite 1 para PEDRA");
    System.out.println("Digite 2 para TESOURA");
    System.out.println("Digite 3 para PAPEL");
    System.out.println("Escolha a sua opção:");

    //Lógica do jogador
    jogador = sc.nextInt();
    switch (jogador) {
      case 1:
        System.out.println("Jogador escolheu PEDRA");
        break;
      case 2:
        System.out.println("Jogador escolheu TESOURA");
        break;
      case 3:
        System.out.println("Jogador escolheu PAPEL");
        break;
      default:
        System.out.println("Opção inválida, digite novamente.");
        break;
    }
    //lógica do computador
    computador = (int) (Math.random() * 3) + 1;
    sc.close();
    switch (computador) {
      case 1:
        System.out.println("Computador escolheu PEDRA");
        break;
      case 2:
        System.out.println("Computador escolheu TESOURA");
        break;
      case 3:
        System.out.println("Computador escolheu PAPEL");
        break;
    }
    //Lógica para determinar o vencedor
    if (jogador == computador) {
      System.out.println("EMPATE");
    } else if (
      (jogador == 1 && computador == 2) ||
      (jogador == 2 && computador == 3) ||
      (jogador == 3 && computador == 1)
    ) {
      System.out.println("JOGADOR VENCEU.");
    } else {
      System.out.println("COMPUTADOR VENCEU.");
    }
  }
}
