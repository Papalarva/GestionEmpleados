
public class Empleado extends Persona {

    protected String rfc;
    protected String departamento;

    // CONSTRUCTORES
    public Empleado(String nombres, String apellidoPaterno, String apellidoMaterno, Fecha fechaNacimiento, Direccion domicilio, String rfc, String departamento) {
        super(nombres, apellidoPaterno, apellidoMaterno, fechaNacimiento, domicilio);
        setRfc(rfc);
        setDepartamento(departamento);
    }

    public Empleado(String rfc, String departamento, String nombres, String apellidoPaterno, String apellidoMaterno, int anio, int mes, int dia, String calle, int numeroExterior, int numeroInterior, String colonia, int codigoPostal, String ciudad, String estado) {
        super(nombres, apellidoPaterno, apellidoMaterno, anio, mes, dia, calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado);
        this.rfc = rfc;
        this.departamento = departamento;
    }
    
    
    
    // METODOS GETS Y SETS
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
