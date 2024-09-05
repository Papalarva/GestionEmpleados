
import java.util.Scanner;

public class TrabajadorXPieza extends Empleado {

    Scanner sc = new Scanner(System.in);
    private double pagoXPieza;
    private int cantidad;

    // CONTRUCTORES
    public TrabajadorXPieza() {
        super();
    }

    public TrabajadorXPieza(String nombres, String apellidoPaterno, String apellidoMaterno, Fecha fechaNacimiento, Direccion domicilio, String rfc, String departamento) {
        super(nombres, apellidoPaterno, apellidoMaterno, fechaNacimiento, domicilio, rfc, departamento);
        TrabajadorXPieza();
    }

    public TrabajadorXPieza(String nombres, String apellidoPaterno, String apellidoMaterno, int anio, int mes, int dia, String calle, int numeroExterior, int numeroInterior, String colonia, int codigoPostal, String ciudad, String estado, String rfc, String departamento) {
        super(nombres, apellidoPaterno, apellidoMaterno, anio, mes, dia, calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado, rfc, departamento);
        TrabajadorXPieza();
    }

    // METODOS GETS Y SETS
    public double getPagoXPieza() {
        return pagoXPieza;
    }

    public void setPagoXPieza(double pagoXPieza) {
        this.pagoXPieza = pagoXPieza > 0 ? pagoXPieza : 100;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad > 0 ? cantidad : 1;
    }

    // METODOS PROPIOS
    public void TrabajadorXPieza() {
        System.out.println("Ingrese el pago por pieza: $");
        this.pagoXPieza = sc.nextDouble();
        System.out.println("Ingrese la cantidad de piezas producidas: ");
        this.pagoXPieza = sc.nextInt();
    }

    @Override
    public double sueldo() {
        return this.pagoXPieza * this.cantidad;
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        return super.toString() + "\nPAGO POR PIEZA: $" + this.pagoXPieza + "\nCANTIDAD PRODUCIDA: " + this.cantidad;
    }

}
