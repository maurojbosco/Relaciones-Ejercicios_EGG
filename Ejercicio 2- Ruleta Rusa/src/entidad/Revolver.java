package entidad;

public class Revolver {
    private Integer posicionActual;
    private Integer posicionAgua;

    // Constructores
    public Revolver(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Revolver() {
    }

    // Getters y Setters
    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    // To String
    @Override
    public String toString() {
        return "Revolver [posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + "]";
    }
}
