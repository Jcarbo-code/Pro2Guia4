package paquete2;

import java.util.ArrayList;

public class Alarma {

    private ArrayList<Sensor> sensores;

    public Alarma() {
        this.sensores = new ArrayList<>();
    }

    public static void main(String[] args) {
        Alarma alarm = new Alarma();
        Sensor c1 = new Sensor("cuarto");
        Sensor b1 = new Sensor("banio");
        Sensor l1 = new Sensor("linivg");
        alarm.agregarSensor(c1);
        alarm.agregarSensor(b1);
        alarm.agregarSensor(l1);
        alarm.comprobarCasa();
    }

    public void agregarSensor(Sensor s1) {
        sensores.add(s1);
    }

    public void comprobarCasa() {
        for (int i = 0; i < sensores.size(); i++) {
            sensores.get(i).comprobar();
        }
    }
}
