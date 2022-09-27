package entidad;

public class Dni {
    //Atributos
    private char serie;
    private long numero;

    //Contructores
    public Dni(char serie, long numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public Dni() {
    }
    
    //Getters Y Setters
    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
   
    //To String
    @Override
    public String toString() {
        return "Dni [numero=" + numero + ", serie=" + serie + "]";
    }
    
    
}
