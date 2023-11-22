package projeto4;

import java.util.Scanner;

public class Shukudai14 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int alcool, gasolina, diesel, numero;

    numero = 0;
    alcool = 0;
    gasolina = 0;
    diesel = 0;

    while (numero != 4) {
      System.out.println(
        "Digite 1 para Álcool, 2 para Gasolina, 3 para Diesel e 4 para encerrar"
      );
      numero = sc.nextInt();

      if (numero == 4) {
        System.out.println("Muito obrigado!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        //o ++ acumula o valor a cada vez que digitar a variavel

      } else if (numero == 3) {
        diesel++;
      } else if (numero == 2) {
        gasolina++;
      } else if (numero == 1) {
        alcool++;
      } else {
        System.out.println("Número inválido, digite novamente.");
      }
    }
    sc.close();
  }
}
