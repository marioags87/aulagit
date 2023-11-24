package projeto5;

import java.util.Scanner;

public class Funcao_com_Strings {

  public static void main(String[] args) {
    //Operação Bitwise
    Scanner sc = new Scanner(System.in);
    int n1, n2;
    System.out.println("Digite o primeiro número");
    n1 = sc.nextInt();
    System.out.println("Digite o segundo número");
    n2 = sc.nextInt();
    sc.close();
    System.out.println("operação bitwise E: " + (n1 & n2));
    System.out.println("operação bitwise OU: " + (n1 | n2));
    System.out.println("operação bitwise XOR: " + (n1 ^ n2));
  }
}
