package projeto6;

public class Gato extends Animal {

  @Override
  public void alimentar(Animal animal) {
    System.out.println(this.getName() + " come " + animal.getName());
    System.out.println(this.getAnimal() + " come " + animal.getAnimal());
  }

  @Override
  public void alimentar(Planta planta) {
    System.out.println(this.getName() + " come " + planta.getPlant());
    System.out.println(this.getAnimal() + " come " + planta.getPlant());
  }

  @Override
  public void reproduzir(Animal animal) {
    if (animal == null) {
      System.out.println(this.getAnimal() + " não nasce filhotinhos");
    } else {
      if (animal.getAnimal().equals("Gato")) {
        if (
          (this.isGender() && animal.isGender()) ||
          (!this.isGender() && !animal.isGender())
        ) {
          System.out.println(this.getAnimal() + " não nasce filhotinhos");
        } else {
          Main.pregnant = true;
          if (this.isGender()) {
            System.out.println(
              this.getName() + " engravidou a " + animal.getName()
            );
          } else {
            System.out.println(
              this.getName() + " engravidou do " + animal.getName()
            );
          }
        }
      } else {
        System.out.println(this.getAnimal() + " não nasce filhotinhos");
      }
    }
  }

  @Override
  public void nakigoe() {
    System.out.println("Miau");
  }
}
