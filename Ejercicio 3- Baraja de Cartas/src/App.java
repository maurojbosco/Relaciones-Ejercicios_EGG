/*Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o 
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de 
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero 
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna 
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y 
luego se llama al método, este no mostrara esa primera carta.
 */

import servicio.BarajaService;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        //Se instancia una baraja mediante el servicio llamando al método que crea una baraja
        BarajaService baraja = new BarajaService();
        System.out.println("Se va a crear una baraja");
        baraja.crearBaraja();

        //Menú que llama a todos los métodos del servicio
        do {
            System.out.println("Elija una opción");
            System.out.println("1 para barajar mazo de cartas");
            System.out.println("2 para mostrar la siguiente carta de la baraja");
            System.out.println("3 para mostrar las cartas disponibles en el mazo");
            System.out.println("4 para dar un número solicitado de cartas");
            System.out.println("5 para mostrar las cartas que ya salieron");
            System.out.println("6 para mostras las cartas que quedan en el mazo");
            switch (sn.nextInt()) {
                case 1:
                    baraja.barajar();
                    break;
                case 2:
                    baraja.siguienteCarta();
                    break;
                case 3:
                    baraja.cartasDisponibles();
                    break;
                case 4:
                    baraja.darCartas();
                    break;
                case 5:
                    baraja.cartasMonton();
                    break;
                case 6:
                    baraja.mostrarBaraja();
                    break;
                default:
                    System.out.println("Ingrese un opción válida");
                    break;
            }
            System.out.println("Ingrese cualquier tecla para realizar otra operacion o 's' para salir");

        } while (sn.next().charAt(0) != 's');
        sn.close();
    }
}
