/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona. */
import entidad.Persona;
import entidad.Dni;

public class App {

    public static void main(String[] args) {
    
        Dni juanDni = new Dni('A', 12242412);
        Persona juan = new Persona("Juan", "Lopez", juanDni);

        System.out.println(juan.getDNI());
        System.out.println(juan.getDNI().getSerie());
        System.out.println(juan.getDNI().getNumero());
    }
}
