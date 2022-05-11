package sueldo;

public class EmpleadoHorasExtras extends Empleado {

    private double porcentajeHoras;

    public EmpleadoHorasExtras() {
        super();
        this.porcentajeHoras = 20;
    }

    public EmpleadoHorasExtras(String nombre, int horasTrabajadas, int cantVentajas, double salarioFijo, double porcentajeVentas) {
        super(nombre, horasTrabajadas, cantVentajas, salarioFijo);
        this.porcentajeHoras = porcentajeVentas;
    }

    @Override
    public double calcularSueldoSemanal() {
        return (salarioFijo + (getPorcentajeHoras() * horasTrabajadas));
    }

    public double getPorcentajeHoras() {
        return porcentajeHoras;
    }

    public void setPorcentajeHoras(double porcentajeHoras) {
        this.porcentajeHoras = porcentajeHoras;
    }
}
