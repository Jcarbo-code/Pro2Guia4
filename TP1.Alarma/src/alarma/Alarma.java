package alarma;
        
public class Alarma {

    protected Timbre ring;
    protected boolean vidrio;
    protected boolean avertura;
    protected boolean movimiento;

    public Alarma() {
        this.vidrio = false;
        this.avertura = false;
        this.movimiento = false;
        
    }

    public static void main(String[] args) {
        Alarma alarm = new Alarma();
        alarm.comprobar();
    }

    public boolean comprobar() {
        if (vidrio || avertura || movimiento){  
            ring.hacerSonar();
        }
        return(vidrio || avertura || movimiento);
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
