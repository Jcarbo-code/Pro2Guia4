package producto;

import java.time.LocalDate;

public class Producto {

    protected LocalDate vencimiento;
    protected int nLote;
    private LocalDate envasado;
    private String granja;

    public Producto() {
        this.vencimiento = LocalDate.of(2030, 1, 1);
        this.nLote = 5555;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public int getnLote() {
        return nLote;
    }

    public void setnLote(int nLote) {
        this.nLote = nLote;
    }

    public String getAllData() {
        return ("Vencimiento: " + vencimiento + ". Numero de lote: " + nLote);
    }
}
