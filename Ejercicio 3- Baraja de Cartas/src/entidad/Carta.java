package entidad;

import enumeraciones.Palo;

public class Carta {
    // Atributos
    private int numero;
    private Palo palo;

    // Constructores
    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Carta() {
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    // To String
    @Override
    public String toString() {
        return "Carta [numero=" + numero + ", palo=" + palo + "]";
    }

}
