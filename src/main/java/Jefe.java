
public class Jefe extends Empleado {

    private double sueldoSemanal;

    // CONTRUCTORES
    public Jefe() {
        super();
        this.sueldoSemanal = 1800;
    }

    public Jefe(String nombres, String apellidoPaterno, String apellidoMaterno, Fecha fechaNacimiento, Direccion domicilio, String rfc, String departamento, double sueldoSemanal) {
        super(nombres, apellidoPaterno, apellidoMaterno, fechaNacimiento, domicilio, rfc, departamento);
        this.sueldoSemanal = sueldoSemanal;
    }

    public Jefe(String nombres, String apellidoPaterno, String apellidoMaterno, int anio, int mes, int dia, String calle, int numeroExterior, int numeroInterior, String colonia, int codigoPostal, String ciudad, String estado, String rfc, String departamento, double sueldoSemanal) {
        super(nombres, apellidoPaterno, apellidoMaterno, anio, mes, dia, calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado, rfc, departamento);
        this.sueldoSemanal = sueldoSemanal;
    }

    // METODOS GETS Y SETS 
    public double getSueldoSemanal() {
        return sueldoSemanal;
    }

    public void setSueldoSemanal(double sueldoSemanal) {
        this.sueldoSemanal = sueldoSemanal > 0 ? sueldoSemanal : 2000;
    }

    @Override
    public double sueldo() {
        return this.sueldoSemanal;
    }
}
