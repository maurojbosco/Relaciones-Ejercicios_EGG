/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona. */

import entidad.Perro;
import entidad.Persona;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        Persona rita = new Persona("rita", "lopez", 42, 2522096, null);
        Persona nahuel = new Persona("nahuel", "escarate", 32, 35696857, null);
        Perro nina = new Perro("nina", "caniche", 5, "chico");
        Perro indra = new Perro("indra", "border_collie", 6, "grande");

        do {
            System.out.println("elija a la persona que va a adoptar un perro. rita o nahuel");
            String seleccion = sn.next();
            if (seleccion.equals("rita")) {
                System.out.println("Elija el perro a adoptar. nina o indra");
                String seleccion2 = sn.next();
                if (seleccion2.equals("nina")) {
                    if (nahuel.getPerro() == null || !nahuel.getPerro().getNombre().equals("nina")) {
                        rita.setPerro(nina);
                    } else {
                        System.out.println("el perro ya fue adoptado");
                    }
                }
                if (seleccion2.equals("indra")) {
                    if (nahuel.getPerro() == null || !nahuel.getPerro().getNombre().equals("indra")) {
                        rita.setPerro(indra);
                    } else {
                        System.out.println("el perro ya fue adoptado");
                    }
                }

            } else if (seleccion.equals("nahuel")) {
                System.out.println("Elija el perro a adoptar. nina o indra");
                String seleccion2 = sn.next();
                if (seleccion2.equals("nina")) {
                    if (rita.getPerro() == null || !rita.getPerro().getNombre().equals("nina")) {
                        nahuel.setPerro(nina);
                    } else {
                        System.out.println("el perro ya fue adoptado");
                    }
                }
                if (seleccion2.equals("indra")) {
                    if (rita.getPerro() == null || !rita.getPerro().getNombre().equals("indra")) {
                        nahuel.setPerro(indra);
                    } else {
                        System.out.println("el perro ya fue adoptado");
                    }
                }

            }

        } while (rita.getPerro() == null || nahuel.getPerro() == null);

        System.out.println("adoptante: " + rita.toString());
        System.out.println("perro adoptado: " + rita.getPerro());
        System.out.println("adoptante: " + nahuel.toString());
        System.out.println("perro adoptado: " + nahuel.getPerro());

    }
}
