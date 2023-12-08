package projeto6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

  // Variável Global
  public static boolean pregnant = false;

  public static void main(String[] args) {
    String name;
    String specie;
    boolean gender;
    boolean stop = false;
    int choice;
    Scanner scan = new Scanner(System.in);
    //Lista Vazia
    List<Animal> animals = new ArrayList<>();
    List<Planta> plantas = new ArrayList<>();

    while (!stop) {
      System.out.println(
        "Digite 1 - Criar Planta, 2 - Criar Animal, " + "3 - Parar de criar"
      );
      choice = scan.nextInt();
      switch (choice) {
        case 1:
          System.out.println(
            "Digite 1 - Criar Vitória-Régia, 2 - Criar Mangueira"
          );
          choice = scan.nextInt();
          switch (choice) {
            case 1:
              VitoriaRegia vr = new VitoriaRegia();
              plantas.add(vr);
              break;
            default:
              Mangueira m = new Mangueira();
              plantas.add(m);
          }
          break;
        case 2:
          System.out.println("Digite 1 - Criar Cachorro, 2 - Criar Gato");
          choice = scan.nextInt();
          if (choice > 1) {
            System.out.println("Digite o nome do gato");
          } else {
            System.out.println("Digite o nome do cachorro");
          }
          name = scan.next();
          if (choice > 1) {
            System.out.println("Digite a espécie do gato");
          } else {
            System.out.println("Digite a espécie do cachorro");
          }
          specie = scan.next();
          System.out.println("Digite 1 - Fêmea, 2 - Macho");
          int g = scan.nextInt();
          if (g > 1) {
            gender = true;
          } else {
            gender = false;
          }
          switch (choice) {
            case 1:
              Cachorro cachorro = new Cachorro();
              cachorro.setAnimal("Cachorro");
              cachorro.setGender(gender);
              cachorro.setSpecie(specie);
              cachorro.setName(name);
              animals.add(cachorro);
              break;
            default:
              Gato gato = new Gato();
              gato.setAnimal("Gato");
              gato.setGender(gender);
              gato.setSpecie(specie);
              gato.setName(name);
              animals.add(gato);
          }
          break;
        default:
          stop = true;
      }
    }

    stop = false;
    while (!stop) {
      System.out.println("Digite 1 - Planta, 2 - Animal, 3 - Parar");
      choice = scan.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Digite o número da planta da lista abaixo.");
          if (!plantas.isEmpty()) {
            for (int i = 0; i < plantas.size(); i++) {
              System.out.println(i + " - " + plantas.get(i).getPlant());
            }
            choice = scan.nextInt();
            System.out.println(
              "Digite 1 - Locomover, 2 - Alimentar, 3 - Reproduzir, 4 - Fazer barulho, 5 - Dormir"
            );
            int c = scan.nextInt();
            switch (c) {
              case 1:
                System.out.println("Digite como a planta vai se locomover");
                name = scan.next();
                if (name.equals("")) {
                  plantas.get(choice).locomover();
                } else {
                  plantas.get(choice).locomover(name);
                }
                break;
              case 2:
                System.out.println(
                  "A planta vai 1 - Se alimentar de um animal ou 2 - Fazer Fotossíntese"
                );
                c = scan.nextInt();
                if (c > 1) {
                  plantas.get(choice).alimentar(null);
                } else {
                  System.out.println(
                    "Escolha da lista abaixo o animal que a planta vai devorar."
                  );
                  if (!animals.isEmpty()) {
                    for (int i = 0; i < animals.size(); i++) {
                      System.out.println(
                        i +
                        " " +
                        animals.get(i).getName() +
                        " - " +
                        animals.get(i).getAnimal()
                      );
                    }
                    c = scan.nextInt();
                    plantas.get(choice).alimentar(animals.remove(c));
                  }
                }
                break;
              case 3:
                plantas.get(choice).reproduzir();
                plantas.add(birth(plantas.get(choice)));
                break;
              case 4:
                plantas.get(choice).nakigoe();
                break;
              default:
                plantas.get(choice).dormir();
            }
          }
          break;
        case 2:
          System.out.println("Digite o número do animal da lista abaixo.");
          if (!animals.isEmpty()) {
            for (int i = 0; i < animals.size(); i++) {
              System.out.println(
                i +
                " - " +
                animals.get(i).getName() +
                " - " +
                animals.get(i).getAnimal()
              );
            }
            choice = scan.nextInt();
            System.out.println(
              "Digite 1 - Locomover, 2 - Alimentar, 3 - Reproduzir, 4 - Fazer barulho, 5 - Dormir, 6 - Ver Espécie"
            );
            int c = scan.nextInt();
            switch (c) {
              case 1:
                System.out.println("Digite como o animal vai se locomover");
                name = scan.next();
                animals.get(choice).locomover(name);
                break;
              case 2:
                System.out.println(
                  "O animal vai 1 - Se alimentar de um animal ou 2 - se alimentar de uma planta"
                );
                c = scan.nextInt();
                if (c > 1) {
                  System.out.println(
                    "Escolha da lista abaixo a planta que o animal vai devorar."
                  );
                  System.out.println(
                    "Essa planta será removida da lista de plantas"
                  );
                  if (!plantas.isEmpty()) {
                    for (int i = 0; i < plantas.size(); i++) {
                      System.out.println(i + " " + plantas.get(i).getPlant());
                    }
                    c = scan.nextInt();
                    animals.get(choice).alimentar(plantas.remove(c));
                  }
                } else {
                  System.out.println(
                    "Escolha da lista abaixo o animal que será devorado."
                  );
                  System.out.println(
                    "Esse animal será removido da lista de animais"
                  );
                  if (!animals.isEmpty()) {
                    for (int i = 0; i < animals.size(); i++) {
                      System.out.println(
                        i +
                        " " +
                        animals.get(i).getName() +
                        " - " +
                        animals.get(i).getAnimal()
                      );
                    }
                    c = scan.nextInt();
                    animals.get(choice).alimentar(animals.remove(c));
                  }
                }
                break;
              case 3:
                System.out.println(
                  "Escolha da lista abaixo o animal para fins reprodutivos."
                );
                if (!animals.isEmpty()) {
                  for (int i = 0; i < animals.size(); i++) {
                    System.out.println(
                      i +
                      " " +
                      animals.get(i).getName() +
                      " - " +
                      animals.get(i).getAnimal()
                    );
                  }
                  c = scan.nextInt();
                  if (choice != c) {
                    animals.get(choice).reproduzir(animals.get(c));
                    if (pregnant) {
                      Animal animal = birth(animals.get(choice));
                      if (animal.isGender()) {
                        System.out.println("Digite o nome do filhote macho");
                      } else {
                        System.out.println("Digite o nome do filhote fêmea");
                      }
                      name = scan.next();
                      animal.setName(name);
                      animals.add(animal);
                      pregnant = false;
                    }
                  } else {
                    animals.get(choice).reproduzir(null);
                  }
                }
                break;
              case 4:
                animals.get(choice).nakigoe();
                break;
              case 5:
                animals.get(choice).dormir();
                break;
              default:
                String genero;
                if (animals.get(choice).isGender()) {
                  genero = " macho ";
                } else {
                  genero = " fêmea ";
                }
                System.out.println(
                  animals.get(choice).getName() +
                  " é um " +
                  animals.get(choice).getAnimal() +
                  genero +
                  " da espécie " +
                  animals.get(choice).getSpecie()
                );
            }
          }
          break;
        default:
          stop = true;
      }
    }
    scan.close();
  }

  private static Animal birth(Animal animal) {
    Random random = new Random();
    boolean gender = random.nextBoolean();
    if (animal.getAnimal().equals("Gato")) {
      Gato gato = new Gato();
      gato.setAnimal(animal.getAnimal());
      gato.setGender(gender);
      gato.setSpecie(animal.getSpecie());
      return gato;
    } else {
      Cachorro cachorro = new Cachorro();
      cachorro.setAnimal(animal.getAnimal());
      cachorro.setGender(gender);
      cachorro.setSpecie(animal.getSpecie());
      return cachorro;
    }
  }

  private static Planta birth(Planta planta) {
    if (planta.getPlant().equals("Mangueira")) {
      return new Mangueira();
    } else {
      return new VitoriaRegia();
    }
  }
}
