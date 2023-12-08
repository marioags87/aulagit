package projeto6;

//extends = Herança de Classe
public class VitoriaRegia extends Planta {

  @Override
  public void alimentar(Animal animal) {
    if (animal == null) {
      System.out.println(this.getPlant() + "faz fotossíntese");
    } else {
      System.out.println(this.getPlant() + "é uma planta carnívora");
    }
  }

  @Override
  public void reproduzir() {
    System.out.println(this.getPlant() + "produz flores");
  }

  public VitoriaRegia() {
    //super() = Utiliza o construtor da classe Planta
    super("Vitória-Régia");
  }
}
