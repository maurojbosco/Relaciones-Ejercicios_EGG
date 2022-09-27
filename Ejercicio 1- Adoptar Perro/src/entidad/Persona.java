package entidad;

public class Persona {
    private String nombre;
    private String apellido;
    private Dni DNI;

    //Constructores
    public Persona (String nombre, String apellido, Dni DNI){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public Persona(){

    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Dni getDNI() {
        return DNI;
    }

    public void setDNI(Dni dNI) {
        DNI = dNI;
    }

    //To String
    @Override
    public String toString() {
        return "Persona [DNI=" + DNI + ", apellido=" + apellido + ", nombre=" + nombre + "]";
    }

}
