package projeto6;

import java.util.Locale;
import java.util.Scanner;
import projeto6.entity.Triangle;

public class OrientacaoObjetos {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Triangle x, y;

    //Instaciou o triangulo X usando construtor Vazio

    x = new Triangle();

    double a, b, c;

    System.out.println("Enter the measures of triangle X: ");
    x.setA(sc.nextDouble());
    x.setB(sc.nextDouble());
    x.setC(sc.nextDouble());
    System.out.println("Enter the measures of triangle Y: ");
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();

    //Instaciar o triangulo Y usando o construtor completo
    y = new Triangle(a, b, c);

    System.out.printf("Triangle X area: %.4f%n", x.area());
    System.out.printf("Triangle Y area: %.4f%n", y.area());
    if (x.area() > y.area()) {
      System.out.println("Larger area: X");
    } else {
      System.out.println("Larger area: Y");
    }
    sc.close();
  }
}
