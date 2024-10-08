
public abstract class Empleado extends Persona {

    protected String rfc;
    protected String departamento;

    // CONSTRUCTORES
    public Empleado() {
        super();
        setRfc("Sin datos");
        setDepartamento("Sin datos");
    }

    public Empleado(String nombres, String apellidoPaterno, String apellidoMaterno, Fecha fechaNacimiento, Direccion domicilio, String rfc, String departamento) {
        super(nombres, apellidoPaterno, apellidoMaterno, fechaNacimiento, domicilio);
        setRfc(rfc);
        setDepartamento(departamento);
    }

    public Empleado(String nombres, String apellidoPaterno, String apellidoMaterno, int anio, int mes, int dia, String calle, int numeroExterior, int numeroInterior, String colonia, int codigoPostal, String ciudad, String estado, String rfc, String departamento) {
        super(nombres, apellidoPaterno, apellidoMaterno, anio, mes, dia, calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado);
        this.rfc = rfc;
        this.departamento = departamento;
    }

    // METODOS GETS Y SETS
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc.toUpperCase();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento.toUpperCase();
    }

    // METODO TO STRING
    @Override
    public String toString() {
        return super.toString() + "\nRFC: " + this.rfc + "\nDEPARTAMENTO: " + this.departamento;
    }

    // METODOS PROPIOS
    public abstract double sueldo();

}
