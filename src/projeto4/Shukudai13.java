package projeto4;

import java.util.Scanner;

public class Shukudai13 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int senha;

    //Estrutura de repetição OBS: Se a variavel while estiver no fim do código não precisa atribuir valor para senha

    do {
      System.out.println("Digite uma senha de 4 digitos:");
      senha = sc.nextInt();

      if (senha == 2002) {
        System.out.println("Acesso Permitido");
      } else {
        System.out.println("Acesso Negado");
      }
    } while (!(senha == 2002));

    sc.close();
  }
}
