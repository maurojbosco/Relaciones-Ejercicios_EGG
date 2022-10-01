package entidad;

import java.util.HashSet;
import java.util.List;
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

    // Método que recibe los jugadores y el revolver para guardarlos en los
    // atributos del juego.
    public void llenarJuego(List<Jugador> jugadores, Revolver r) {
        this.jugadores = new HashSet<Jugador>(jugadores);
        this.revolver = r;
    }

    /*
     * ronda(): cada ronda consiste en un jugador que se apunta con el revolver de
     * agua y
     * aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se
     * termina el juego, sino se
     * moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
     * tiene que
     * mojar. Al final del juego, se debe mostrar que jugador se mojó.
     * Pensar la lógica necesaria para realizar esto, usando los atributos de la
     * clase Juego.
     */
    public void ronda() {
        boolean flag = false;
        do {
            for (Jugador jug : this.jugadores) {
                jug.disparo(this.revolver);
                if (jug.isMojado()) {
                    System.out.println("El " + jug.getNombre() + " se mojó y perdió el juego");
                    flag = true;
                    break;
                } else {
                    System.out.println("El " + jug.getNombre() + " se gatilló y no se mojó");
                }
            }
        } while (!flag);
    }
}
