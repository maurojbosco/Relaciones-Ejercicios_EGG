package entidad;

import java.util.Set;

public class Juego {
    private Set<Jugador> jugadores;
    private Revolver revolver;

    // Constructores
    public Juego(Set<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public Juego() {
    }

    // Getters y Setters
    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    // To String
    @Override
    public String toString() {
        return "Juego [jugadores=" + jugadores + ", revolver=" + revolver + "]";
    }

}
