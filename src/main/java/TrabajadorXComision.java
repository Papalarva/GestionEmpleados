
public class TrabajadorXComision extends Empleado {
    private static final double SALARIO_BASE_DEFAULT = 2500;
    
    private double salarioBase;
    private double comision;
    private int cantidad = 1;

    // CONSTRUCTORES
    public TrabajadorXComision() {
        super();
        setSalarioBase(SALARIO_BASE_DEFAULT);
        setComision(0.1);
    }

    public TrabajadorXComision(String nombres, String apellidoPaterno, String apellidoMaterno, Fecha fechaNacimiento, Direccion domicilio, String rfc, String departamento, double salarioBase, double comision) {
        super(nombres, apellidoPaterno, apellidoMaterno, fechaNacimiento, domicilio, rfc, departamento);
        setSalarioBase(salarioBase);
        setComision(comision);
    }

    public TrabajadorXComision(String nombres, String apellidoPaterno, String apellidoMaterno, int anio, int mes, int dia, String calle, int numeroExterior, int numeroInterior, String colonia, int codigoPostal, String ciudad, String estado, String rfc, String departamento, double salarioBase, double comision) {
        super(nombres, apellidoPaterno, apellidoMaterno, anio, mes, dia, calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado, rfc, departamento);
        setSalarioBase(salarioBase);
        setComision(comision);
    }

    // METODOS SETS Y GETS
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase > 0 ? salarioBase : SALARIO_BASE_DEFAULT;
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
        return super.toString() + "\nTIPO DE EMPLEADO: TRABAJADOR POR COMISION \nSALARIO BASE: " + this.salarioBase + "\nCOMISION: " + this.comision;
    }

    @Override
    public double sueldo() {
        return this.salarioBase + (this.comision * this.cantidad);
    }

}
