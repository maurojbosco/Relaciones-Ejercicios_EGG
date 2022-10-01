package entidad;

import java.util.List;

public class Baraja {
    // Atributo
    private List<Carta> cartas;

    // Constructores
    public Baraja(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public Baraja() {
    }

    // Getters y Setters
    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    // To String
    @Override
    public String toString() {
        return "Baraja [cartas=" + cartas + "]";
    }
}
