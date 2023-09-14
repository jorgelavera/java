package entrega_2;

import java.util.ArrayList;

public class ListarPersonasLavera {

  public static void main(String[] args) {
    Persona persona1 = new Persona("Jorge", "Perez");
    Persona persona2 = new Persona("Vicky", "Lopez");
    Persona persona3 = new Persona("Julián", "Inda");
    Persona persona4 = new Persona("Rosa", "Buric");
    Persona persona5 = new Persona("Diego", "Milli");

    //ArrayList
    ArrayList<Persona> PersonasArrays = new ArrayList<>();
    PersonasArrays.add(persona1);
    PersonasArrays.add(persona2);
    PersonasArrays.add(persona3);
    PersonasArrays.add(persona4);
    PersonasArrays.add(persona5);

    System.out.println("== Orden como fue cargado ==");
    for (Persona PersonasArray : PersonasArrays) {
      System.out.println(PersonasArray);
    }

    System.out.println("--------------------------------------");
    System.out.println("== Ordenado por Nombre ==");

    PersonasArrays.sort((p1, p2) -> p1.getApellido().compareTo(p2.getApellido())
    );
    PersonasArrays.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
    for (Persona PersonasArray : PersonasArrays) {
      System.out.println(PersonasArray);
    }

    System.out.println("--------------------------------------");
    System.out.println("== Ordenado descendente por nombre ==");

    PersonasArrays.sort((p1, p2) -> p2.getApellido().compareTo(p1.getApellido())
    );
    PersonasArrays.sort((p1, p2) -> p2.getNombre().compareTo(p1.getNombre()));
    for (Persona PersonasArray : PersonasArrays) {
      System.out.println(PersonasArray);
    }

    System.out.println("--------------------------------------");
    System.out.println("== Ordenado por Apellido ==");

    PersonasArrays.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
    PersonasArrays.sort((p1, p2) -> p1.getApellido().compareTo(p2.getApellido())
    );
    for (Persona PersonasArray : PersonasArrays) {
      System.out.println(PersonasArray);
    }

    System.out.println("--------------------------------------");
    System.out.println("== Ordenado descendente por Apellido ==");

    PersonasArrays.sort((p1, p2) -> p2.getNombre().compareTo(p1.getNombre()));
    PersonasArrays.sort((p1, p2) -> p2.getApellido().compareTo(p1.getApellido())
    );
    for (Persona PersonasArray : PersonasArrays) {
      System.out.println(PersonasArray);
    }
  }
}
