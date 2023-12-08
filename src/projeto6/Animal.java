package projeto6;

//implements = Herança de Interface
public abstract class Animal implements SerVivo {

  private String name;
  private String specie;
  private boolean gender;
  private String animal;

  public abstract void alimentar(Animal animal);

  public abstract void alimentar(Planta planta);

  public abstract void reproduzir(Animal animal);

  @Override
  public void locomover(String locomover) {
    System.out.println("Anda " + locomover);
  }

  //Override = Sobrescrever o metodo
  @Override
  public void dormir() {
    System.out.println("ZzZzZzZzZz");
  }

  public Animal() {}

  public Animal(String name, String specie, boolean gender, String animal) {
    this.name = name;
    this.specie = specie;
    this.gender = gender;
    this.animal = animal;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSpecie() {
    return specie;
  }

  public void setSpecie(String specie) {
    this.specie = specie;
  }

  public boolean isGender() {
    return gender;
  }

  public void setGender(boolean gender) {
    this.gender = gender;
  }

  public String getAnimal() {
    return animal;
  }

  public void setAnimal(String animal) {
    this.animal = animal;
  }
}
