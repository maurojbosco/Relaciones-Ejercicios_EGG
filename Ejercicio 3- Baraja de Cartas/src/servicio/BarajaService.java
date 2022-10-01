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
            String nombre = palo.getNombre();
            for (int i = 1; i <= 12; i++) {
                if (i == 8 || i == 9) {
                    
                } else {
                    Carta carta = new Carta(i,palo);
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
}
