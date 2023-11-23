package projeto4;

import java.util.Random;
import java.util.Scanner;

public class Shukudai16 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    int jogadorPontos = 0;
    int computadorPontos = 0;

    while (jogadorPontos < 5 && computadorPontos < 5) {
      System.out.println(
        "Escolha uma jogada: 1 - Pedra, 2 - Tesoura, 3 - Papel"
      );
      int escolhaJogador = sc.nextInt();

      if (escolhaJogador < 1 || escolhaJogador > 3) {
        System.out.println("Escolha inválida. Tente novamente.");
      }

      int escolhaComputador = random.nextInt(3) + 1;

      System.out.println("Jogador: " + converterJogada(escolhaJogador));
      System.out.println("Computador: " + converterJogada(escolhaComputador));

      String resultado = calcularResultado(escolhaJogador, escolhaComputador);

      System.out.println(resultado);

      if (resultado.equals("Jogador venceu.")) {
        jogadorPontos++;
      } else if (resultado.equals("Computador venceu.")) {
        computadorPontos++;
      }

      System.out.println("Jogador: " + jogadorPontos);
      System.out.println("Computador: " + computadorPontos);
    }

    if (jogadorPontos == 5) {
      System.out.println("Jogador venceu o jogo!");
    } else {
      System.out.println("Computador venceu o jogo!");
    }

    sc.close();
  }

  private static String converterJogada(int escolha) {
    switch (escolha) {
      case 1:
        return "Pedra";
      case 2:
        return "Tesoura";
      case 3:
        return "Papel";
      default:
        return "Desconhecido";
    }
  }

  private static String calcularResultado(
    int escolhaJogador,
    int escolhaComputador
  ) {
    if (escolhaJogador == escolhaComputador) {
      return "Empate.";
    } else if (
      (escolhaJogador == 1 && escolhaComputador == 2) ||
      (escolhaJogador == 2 && escolhaComputador == 3) ||
      (escolhaJogador == 3 && escolhaComputador == 1)
    ) {
      return "Jogador venceu.";
    } else {
      return "Computador venceu.";
    }
  }
}
