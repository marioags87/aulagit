package projeto6;

//implements = Herança de Interface
public abstract class Planta implements SerVivo {

  private String plant;

  public abstract void alimentar(Animal animal);

  public abstract void reproduzir();

  //Dois ou mais métodos com o mesmo nome e parâmetros diferentes
  //Sobrecarga de Metodos
  @Override
  public void locomover(String locomover) {
    System.out.println("Anda " + locomover);
  }

  public void locomover() {
    System.out.println("Não anda");
  }

  //@Override  = Sobrescrever o metodo
  @Override
  public void dormir() {
    System.out.println("........");
  }

  @Override
  public void nakigoe() {
    System.out.println("Planta não faz barulho");
  }

  public Planta() {}

  public Planta(String plant) {
    this.plant = plant;
  }

  public String getPlant() {
    return plant;
  }

  public void setPlant(String plant) {
    this.plant = plant;
  }
}
