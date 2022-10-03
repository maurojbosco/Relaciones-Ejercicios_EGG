package servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entidad.Baraja;
import entidad.Carta;
import enumeraciones.Palo;

public class BarajaService {
    private Scanner sn = new Scanner(System.in);
    private Baraja mazo = new Baraja();
    private Baraja cartasDadas = new Baraja();

    public Baraja crearBaraja() {
        List<Carta> dadas = new ArrayList<>();
        this.cartasDadas.setCartas(dadas);
        List<Carta> todas = new ArrayList<>();
        for (Palo palo : Palo.values()) {
            for (int i = 1; i <= 12; i++) {
                if (i == 8 || i == 9) {

                } else {
                    Carta carta = new Carta(i, palo);
                    todas.add(carta);
                }

            }
        }
        this.mazo.setCartas(todas);
        return mazo;

    }

    // Método que cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        Collections.shuffle(mazo.getCartas());
    }

    // Método que indica cual es la siguiente carta de la baraja
    public void siguienteCarta() {
        if (mazo.getCartas().size() > 0) {
            System.out.println("Siguiente carta: " + mazo.getCartas().get(0).toString());
        } else {
            System.out.println("no hay mas cartas");
        }
    }

    // Método que indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles() {
        System.out.println(mazo.getCartas().size() + " cartas disponibles para repartir");
    }

    // Método que da la cantidad de cartas solicitadas por el usuario
    public void darCartas() {
        System.out.println("Ingrese el numero de cartas a repartir");
        int num = sn.nextInt();
        if (mazo.getCartas().size() > num) {

            for (int i = 0; i < num; i++) {
                Carta aux = new Carta();
                aux = mazo.getCartas().get(i);
                mazo.getCartas().remove(i);
                cartasDadas.getCartas().add(aux);
            }

        } else {
            System.out.println("La cantidad de cartas restantes en menor a las solicitadas");
        }
    }

    // Método que muestra las cartas que han salido del mazo
    public void cartasMonton() {
        if (cartasDadas.getCartas().size() > 0) {
            System.out.println("Han salido las siguientes cartas: ");
            for (Carta card : cartasDadas.getCartas()) {
                System.out.println(card.toString());
            }
        } else {
            System.out.println("No ha salido ninguna carta del mazo");
        }
    }

    // Método que muestra todas las cartas disponibles en el mazo
    public void mostrarBaraja() {
        if (mazo.getCartas().size() > 0) {
            System.out.println("Cartas en el mazo: ");
            for (Carta card : mazo.getCartas()) {
                System.out.println(card.toString());
            }
        } else {
            System.out.println("No queda ninguna carta en el mazo");
        }
    }
}
