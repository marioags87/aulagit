package projeto6.entity;

public class Triangle {

  //atributos
  private Double a;
  private Double b;
  private Double c;

  //construtor vazio
  public Triangle() {}

  //construtor completo
  public Triangle(Double a, Double b, Double c) {
    //usamos quando os nomes dos atributos e construtores são os mesmos
    this.a = a;
    this.b = b;
    this.c = c;
  }

  //Getters and Setters
  public Double getA() {
    return a;
  }

  public void setA(Double a) {
    this.a = a;
  }

  public Double getB() {
    return b;
  }

  public void setB(Double b) {
    this.b = b;
  }

  public Double getC() {
    return c;
  }

  public void setC(Double c) {
    this.c = c;
  }
}
