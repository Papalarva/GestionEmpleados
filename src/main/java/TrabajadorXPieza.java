

public class TrabajadorXPieza extends Empleado {

    private static final double PAGO_PIEZA_DEFAULT = 20;
    
    private double pagoXPieza;
    private int cantidad = 1;

    // CONTRUCTORES
    public TrabajadorXPieza() {
        super();
        setPagoXPieza(PAGO_PIEZA_DEFAULT);
    }

    public TrabajadorXPieza(String nombres, String apellidoPaterno, String apellidoMaterno, Fecha fechaNacimiento, Direccion domicilio, String rfc, String departamento, double pagoXPieza) {
        super(nombres, apellidoPaterno, apellidoMaterno, fechaNacimiento, domicilio, rfc, departamento);
        setPagoXPieza(pagoXPieza);
    }

    public TrabajadorXPieza(String nombres, String apellidoPaterno, String apellidoMaterno, int anio, int mes, int dia, String calle, int numeroExterior, int numeroInterior, String colonia, int codigoPostal, String ciudad, String estado, String rfc, String departamento, double pagoXPieza) {
        super(nombres, apellidoPaterno, apellidoMaterno, anio, mes, dia, calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado, rfc, departamento);
        setPagoXPieza(pagoXPieza);
    }

    // METODOS GETS Y SETS
    public double getPagoXPieza() {
        return pagoXPieza;
    }

    public void setPagoXPieza(double pagoXPieza) {
        this.pagoXPieza = pagoXPieza > 0 ? pagoXPieza : PAGO_PIEZA_DEFAULT;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad > 0 ? cantidad : 1;
    }

    @Override
    public double sueldo() {
        return this.pagoXPieza * this.cantidad;
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        return super.toString() + "\nTIPO DE EMPLEADO: TRABAJADOR POR PIEZA \nPAGO POR PIEZA: $" + this.pagoXPieza;
    }

}
