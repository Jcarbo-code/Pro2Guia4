package contingente;

public class Entrenador extends Contingente {

    private int id;

    public Entrenador(String nombre, String apellido, int id) {
        super(nombre, apellido);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
