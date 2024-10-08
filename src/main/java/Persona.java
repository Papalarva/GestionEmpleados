import java.time.LocalDate;

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

    public Persona(String nombres, String apellidoPaterno, String apellidoMaterno, int dia, int mes, int anio, String calle,
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
        this.nombres = nombres.toUpperCase();
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno.toUpperCase();
    }

    public String getApellidoMaterno() {
        return apellidoMaterno.toUpperCase();
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno.toUpperCase();
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }
    
    

    public Direccion getDomicilio() {
        return domicilio;
    }

    // METODO EDAD
    public int edad() {
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.getYear() - this.fechaNacimiento.getAnio();
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        return this.nombres + " " + this.apellidoPaterno + " "+ this.apellidoMaterno
                + "\nEDAD: " + edad() + " \nDOMICILIO: " + domicilio;
    }

}
