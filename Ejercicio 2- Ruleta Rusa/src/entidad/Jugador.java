package entidad;

public class Jugador {
    private Integer id;
    private String nombre;
    private boolean mojado;

    // Constructores
    public Jugador(Integer id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public Jugador() {
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    // To String
    @Override
    public String toString() {
        return "Jugador [id=" + id + ", mojado=" + mojado + ", nombre=" + nombre + "]";
    }
    /*
     * Método que recibe el revolver de agua y llama a los métodos de mojar() y
     * siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y
     * si el revolver tira el agua, el jugador se moja. El atributo mojado pasa a
     *  false y el método devuelve true, sino false.
     */
    public boolean disparo(Revolver r){
        if(r.mojar()){
            this.mojado = true;
            r.siguienteChorro();
            return true;
        } else{
            r.siguienteChorro();
            return false;
        }
    }
}
