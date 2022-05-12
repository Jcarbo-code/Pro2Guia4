package producto;

import java.time.LocalDate;

public class ProductoCongelado extends Producto {

    protected int codSupervicion;
    protected LocalDate envasado;     //sacar
    protected float temperatura;
    protected String granja;          //sacar

    public ProductoCongelado() {
        this.envasado = LocalDate.of(2030, 1, 1);
        this.granja = "granja suprema";
        this.codSupervicion = 148856;
        this.temperatura = -36;
    }

    public ProductoCongelado(String granja, LocalDate envasado, int codSupervicion, float temperatura) {
        this.envasado = envasado;
        this.granja = granja;
        this.codSupervicion = codSupervicion;
        this.temperatura = temperatura;
    }

    public int getCodSupervicion() {
        return codSupervicion;
    }

    public void setCodSupervicion(int codSupervicion) {
        this.codSupervicion = codSupervicion;
    }

    public LocalDate getEnvasado() {
        return envasado;
    }

    public void setEnvasado(LocalDate envasado) {
        this.envasado = envasado;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public String getGranja() {
        return granja;
    }

    public void setGranja(String granja) {
        this.granja = granja;
    }

    @Override
    public String getAllData() {
        return ("Vencimiento: " + vencimiento + ". Numero de lote: " + nLote + ". Fecha de envasado: " + envasado + ". Granja: "
                + granja + ". Codigo de supervicion: " + codSupervicion + ". Temperatura de refrigeracion: " + temperatura);
    }
}
