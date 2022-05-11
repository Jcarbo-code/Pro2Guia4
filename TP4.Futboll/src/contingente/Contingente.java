package contingente;

import java.time.LocalDate;

public class Contingente {

    protected String nombre, apellido, ubicacion;
    protected boolean concentrado;
    protected int pasaporte;
    protected LocalDate nacimiento;

    public Contingente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ubicacion = "En pais de origen";
        this.concentrado = false;
        this.pasaporte = 999999;
        this.nacimiento = LocalDate.of(1990, 1, 1);;
    }

    public Contingente(String nombre, String apellido, String ubicacion, boolean concentrado, int pasaporte, LocalDate nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ubicacion = ubicacion;
        this.concentrado = concentrado;
        this.pasaporte = pasaporte;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isConcentrado() {
        return concentrado;
    }

    public void setConcentrado(boolean concentrado) {
        this.concentrado = concentrado;
    }

    public boolean disponible() {
        return (!concentrado && ubicacion == "En pais de origen");
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
}
