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

    // Metodo que pone los valores iniciales a los atributos de la clase
    public void llenarRevolver() {
        this.posicionActual = (int) Math.random() * 7 + 1;
        this.posicionAgua = (int) Math.random() * 7 + 1;
    }

    // Método que compara si los atributos de la clase tiene el mismo valor
    public boolean mojar() {
        if (this.posicionActual == this.posicionAgua) {
            return true;
        } else {
            return false;
        }
    }

    public void siguienteChorro() {
        if (this.posicionActual == 6) {
            this.posicionActual = 1;
        } else {
            this.posicionActual++;
        }
    }
}
