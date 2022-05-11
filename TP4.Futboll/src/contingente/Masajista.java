package contingente;

public class Masajista extends Contingente {

    private String titulo;
    private int aniosExp;

    public Masajista(String nombre, String apellido, String titulo, int aniosExp) {
        super(nombre, apellido);
        this.titulo = titulo;
        this.aniosExp = aniosExp;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

}
