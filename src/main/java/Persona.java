
public class Persona {

    protected String nombres;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected Fecha fechaNacimiento;
    protected Direccion domicilio;

    // CONSTRUCTORES 
    public Persona() {
        setNombres("No disponible");
        setApellidoPaterno("No disponible");
        setApellidoMaterno("No disponible");
        this.fechaNacimiento = new Fecha();
        this.domicilio = new Direccion();
    }

    public Persona(String nombres, String apellidoPaterno, String apellidoMaterno, Fecha fechaNacimiento, Direccion domicilio) {
        setNombres(nombres);
        setApellidoPaterno(apellidoPaterno);
        setApellidoMaterno(apellidoMaterno);
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
    }

    public Persona(String nombres, String apellidoPaterno, String apellidoMaterno, int anio, int mes, int dia, String calle,
            int numeroExterior, int numeroInterior, String colonia, int codigoPostal, String ciudad, String estado) {
        setNombres(nombres);
        setApellidoPaterno(apellidoPaterno);
        setApellidoMaterno(apellidoMaterno);
        this.fechaNacimiento = new Fecha(dia, mes, anio);
        this.domicilio = new Direccion(calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado);
    }

    // Metodos GETS y SETS
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Direccion getDomicilio() {
        return domicilio;
    }

}
