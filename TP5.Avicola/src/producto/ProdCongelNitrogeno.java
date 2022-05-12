package producto;

public class ProdCongelNitrogeno extends ProductoCongelado {

    private float expoNitrogeno;
    private String metodoCongelacion;

    public ProdCongelNitrogeno() {
        this.expoNitrogeno = 5000;
        this.metodoCongelacion = "exposicion por gas";
    }

    public ProdCongelNitrogeno(float expoNitrogeno, String metodoCongelacion) {
        this.expoNitrogeno = expoNitrogeno;
        this.metodoCongelacion = metodoCongelacion;
    }

    public float getExpoNitrogeno() {
        return expoNitrogeno;
    }

    public void setExpoNitrogeno(float expoNitrogeno) {
        this.expoNitrogeno = expoNitrogeno;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    @Override
    public String getAllData() {
        return ("Vencimiento: " + vencimiento + ". Numero de lote: " + nLote + ". Fecha de envasado: " + envasado + ". Granja: "
                + granja + ". Codigo de supervicion: " + codSupervicion + ". Temperatura de refrigeracion: " + temperatura
                + ". Tiempo de exposicion al nitrogeno: " + expoNitrogeno + ". Metodo de congelacion empleado: " + metodoCongelacion);
    }
}
