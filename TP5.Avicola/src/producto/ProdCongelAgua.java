package producto;

public class ProdCongelAgua extends ProductoCongelado {

    private int salinidad;

    public ProdCongelAgua() {
        this.salinidad = 20;
    }

    public ProdCongelAgua(int salinidad) {
        this.salinidad = salinidad;
    }
    
    public int getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(int salinidad) {
        this.salinidad = salinidad;
    }

    @Override
    public String getAllData() {
        return ("Vencimiento: " + vencimiento + ". Numero de lote: " + nLote + ". Fecha de envasado: " + envasado
                + ". Granja: " + granja + ". Codigo de supervicion: " + codSupervicion
                + ". Temperatura de refrigeracion: " + temperatura + ". Salinidad en agua: " + salinidad);
    }
}
