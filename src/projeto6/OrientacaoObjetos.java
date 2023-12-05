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

    double p = (x.getA() + x.getB() + x.getC()) / 2.0;
    double areaX = Math.sqrt(
      p * (p - x.getA()) * (p - x.getB()) * (p - x.getC())
    );
    p = (y.getA() + y.getB() + y.getC()) / 2.0;
    double areaY = Math.sqrt(
      p * (p - y.getA()) * (p - y.getB()) * (p - y.getC())
    );
    System.out.printf("Triangle X area: %.4f%n", areaX);
    System.out.printf("Triangle Y area: %.4f%n", areaY);
    if (areaX > areaY) {
      System.out.println("Larger area: X");
    } else {
      System.out.println("Larger area: Y");
    }
    sc.close();
  }
}
