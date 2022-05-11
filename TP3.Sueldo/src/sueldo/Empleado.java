package sueldo;

public class Empleado {

    protected String nombre;
    protected int horasTrabajadas, cantVentas;
    protected double salarioFijo;

    public Empleado() {
        this.nombre = "pepe";
        this.horasTrabajadas = 40;
        this.cantVentas = 20;
        this.salarioFijo = 1000;
    }

    public Empleado(String nombre, int horasTrabajadas, int cantVentajas, double salarioFijo) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.cantVentas = cantVentajas;
        this.salarioFijo = salarioFijo;
    }

    public double calcularSueldoSemanal() {
        return getSalarioFijo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

}
