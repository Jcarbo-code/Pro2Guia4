package paquete2;

import alarma.Timbre;

public class Sensor {
    
    private Timbre ring;
    protected String nombre;
    protected boolean vidrio;
    protected boolean avertura;
    protected boolean movimiento;

    public Sensor(String nombre) {
        this.nombre = nombre;
        this.vidrio = false;
        this.avertura = false;
        this.movimiento = false;
    }

    public String disparar() {
        ring.hacerSonar();
        return nombre;
    }

    public void comprobar() {
        if (vidrio || avertura || movimiento) {
            disparar();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVidrio() {
        return vidrio;
    }

    public void setVidrio(boolean vidrio) {
        this.vidrio = vidrio;
    }

    public boolean isAvertura() {
        return avertura;
    }

    public void setAvertura(boolean avertura) {
        this.avertura = avertura;
    }

    public boolean isMovimiento() {
        return movimiento;
    }

    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }
}
