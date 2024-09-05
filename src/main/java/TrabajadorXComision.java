
import java.util.Scanner;

public class TrabajadorXComision extends Empleado {

    Scanner sc = new Scanner(System.in);
    private double salarioBase;
    private double comision;
    private int cantidad = 0;

    // CONSTRUCTORES
    public TrabajadorXComision() {
    }

    public TrabajadorXComision(String nombres, String apellidoPaterno, String apellidoMaterno, Fecha fechaNacimiento, Direccion domicilio, String rfc, String departamento, double salarioBase, double comsion) {
        super(nombres, apellidoPaterno, apellidoMaterno, fechaNacimiento, domicilio, rfc, departamento);
        setSalarioBase(salarioBase);
        setComision(comision);
    }

    public TrabajadorXComision(String nombres, String apellidoPaterno, String apellidoMaterno, int anio, int mes, int dia, String calle, int numeroExterior, int numeroInterior, String colonia, int codigoPostal, String ciudad, String estado, String rfc, String departamento) {
        super(nombres, apellidoPaterno, apellidoMaterno, anio, mes, dia, calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado, rfc, departamento);
        setSalarioBase(salarioBase);
        setComision(comision);
    }

    // METODOS SETS Y GETS
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase > 0 ? salarioBase : 1800;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision > 0 ? comision : 0.1;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad > 0 ? cantidad : 1;
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        return super.toString() + "\nSALARIO BASE: " + this.salarioBase + "\nCOMISION: " + "VENTAS: $" + this.cantidad;
    }

    // METODOS PROPIOS
    public void TrabajadorXComision() {
        System.out.print("Ingrese la cantidad vendida: $");
        this.cantidad = sc.nextInt();

    }

    @Override
    public double sueldo() {
        return this.salarioBase + (this.comision * this.cantidad);
    }

}
