package projeto5;

import java.util.Scanner;

public class Aula6 {

  public static void main(String[] args) {
    //pedir para o computador listar os números impares de um intervalo
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número entre 1 e 1000");
    int numero;

    numero = sc.nextInt();
    sc.close();
    for (int i = 1; i <= numero; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
    //como pedir para o computador dizer quantos números impares tem num intervalo:
    //System.out.println("Digite um número entre 1 e 1000");
    //int numero;
    //int contador;
    //contador = 0;
    //numero = sc.nextInt();
    //sc.close();
    //for (int i = 1; i <= numero; i++) {
    //if (i % 2 != 0) {
    //contador++;
    //contador++ é a mesma coisa de: "contador = contador + 1"}}

    //System.out.println(contador);
  }
}
