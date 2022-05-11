package sueldo;

public class EmpleadoComision extends Empleado {

    private double porcentajeVentas;

    public EmpleadoComision() {
        super();
        this.porcentajeVentas = 20;
    }

    public EmpleadoComision(String nombre, int horasTrabajadas, int cantVentajas, double salarioFijo, double porcentajeVentas) {
        super(nombre, horasTrabajadas, cantVentajas, salarioFijo);
        this.porcentajeVentas = porcentajeVentas;
    }

    @Override
    public double calcularSueldoSemanal() {
        return (salarioFijo + (getPorcentajeVentas() * cantVentas));
    }

    public double getPorcentajeVentas() {
        return porcentajeVentas;
    }

    public void setPorcentajeVentas(double porcertajeVentas) {
        this.porcentajeVentas = porcertajeVentas;
    }
}
