package contingente;

public class Futbolista extends Contingente {

    private String posicion;
    private int goles;

    public Futbolista(String nombre, String apellido, String posicion, int goles) {
        super(nombre, apellido);
        this.posicion = posicion;
        this.goles = goles;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

}
