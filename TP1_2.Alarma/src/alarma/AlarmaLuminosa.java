package alarma;

public class AlarmaLuminosa extends Alarma {

    protected Luz light;

    public AlarmaLuminosa() {
        super();
    }

    @Override
    public boolean comprobar() {
        if (super.comprobar()) {
            light.encender();
            return true;
        }
        return false;
    }
}
