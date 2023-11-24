package projeto5;

import java.util.Scanner;

public class Transformar_Codigo_em_Funcao {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite três números:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    resultado(maior(a, b, c));
    /*if (a > b && a > c) {
      System.out.println("Maior = " + a);
    } else if (b > c) {
      System.out.println("Maior = " + b);
    } else {
      System.out.println("Maior = " + c);
    }*/
    sc.close();
  }

  //public, protected, private são tipos de visibilidade de função
  //public pode ser acessada em qualquer pasta ou classe
  //protected pode ser acessada apenas dentro da mesma pasta
  //private pode ser acessada apenas dentro da mesma classe
  //exitem 2 tipos de funções static e dinamica

  private static int maior(int x, int y, int z) {
    if (x > y && x > z) {
      return x;
    } else if (y > z) {
      return y;
    } else {
      return z;
    }
  }

  private static void resultado(int maior) {
    System.out.println("Maior = " + maior);
  }
}
