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

        //Se Instancian dos personas y dos perros
        Scanner sn = new Scanner(System.in);
        Persona rita = new Persona("rita", "lopez", 42, 2522096, null);
        Persona nahuel = new Persona("nahuel", "escarate", 32, 35696857, null);
        Perro nina = new Perro("nina", "caniche", 5, "chico");
        Perro indra = new Perro("indra", "border_collie", 6, "grande");

        //Ciclo que se ejecuta mientras algún objeto persona todavía no tenga asignado un objeto perro.
        //Le permite por pantalla al usuario elegir al adoptante y al perro que quiere adoptar respectivamente,
        //si el perro ya fue adoptado previamente, también lo informa por pantalla
        do {
            System.out.println("elija a la persona que va a adoptar un perro, Rita o Nahuel");
            String seleccion = sn.next();
            if (seleccion.equalsIgnoreCase("rita")) {
                System.out.println("Elija el perro a adoptar, Nina o Indra");
                String seleccion2 = sn.next();
                if (seleccion2.equalsIgnoreCase("nina")) {
                    if (nahuel.getPerro() == null || !nahuel.getPerro().getNombre().equalsIgnoreCase("nina")) {
                        rita.setPerro(nina);
                    } else {
                        System.out.println("el perro ya fue adoptado");
                    }
                }
                if (seleccion2.equalsIgnoreCase("indra")) {
                    if (nahuel.getPerro() == null || !nahuel.getPerro().getNombre().equalsIgnoreCase("indra")) {
                        rita.setPerro(indra);
                    } else {
                        System.out.println("el perro ya fue adoptado");
                    }
                }

            } else if (seleccion.equalsIgnoreCase("nahuel")) {
                System.out.println("Elija el perro a adoptar, Nina o Indra");
                String seleccion2 = sn.next();
                if (seleccion2.equalsIgnoreCase("nina")) {
                    if (rita.getPerro() == null || !rita.getPerro().getNombre().equalsIgnoreCase("nina")) {
                        nahuel.setPerro(nina);
                    } else {
                        System.out.println("el perro ya fue adoptado");
                    }
                }
                if (seleccion2.equalsIgnoreCase("indra")) {
                    if (rita.getPerro() == null || !rita.getPerro().getNombre().equalsIgnoreCase("indra")) {
                        nahuel.setPerro(indra);
                    } else {
                        System.out.println("el perro ya fue adoptado");
                    }
                }

            }

        } while (rita.getPerro() == null || nahuel.getPerro() == null);
        sn.close();

        System.out.println("adoptante: " + rita.toString());
        System.out.println("perro adoptado por Rita: " + rita.getPerro());
        System.out.println("adoptante: " + nahuel.toString());
        System.out.println("perro adoptado por Nahuel: " + nahuel.getPerro());

    }
}
