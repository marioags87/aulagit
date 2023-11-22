package projeto4;

import java.util.Scanner;

public class SenhaLimitada {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int senha;
    String numero;
    String[] parse;
    do {
      System.out.println("Digite a senha com 4 digitos:");
      senha = sc.nextInt();
      numero = String.valueOf(senha);
      parse = numero.split("(?<=\\G.{1})");

      //para limitar a quantidade de digitos:

      if (parse.length > 4) {
        System.out.println("Você digitou mais que 4 digitos, tente novamente.");
      }

      //para ler apenas os 4 primeiros digitos:
      //numero = parse[0] + parse[1] + parse[2] + parse[3];
      //senha = Integer.parseInt(numero);

      //para ler a senha independente da posição:
      if (numero.contains("2002")) {
        senha = 2002;
      }

      if (senha == 2002) {
        System.out.println("Acesso Permitido");
      } else {
        System.out.println("Acesso Negado");
      }
    } while (!(senha == 2002));
    sc.close();
  }
}
