
public class Direccion {

    private String calle;
    private int numeroExterior;
    private int numeroInterior;
    private String colonia;
    private int codigoPostal;
    private String ciudad;
    private String estado;

    // CONSTRUCTORES
    public Direccion() {
        setCalle("No disponible");
        setNumeroExterior(0);
        setNumeroInterior(0);
        setColonia("No disponible");
        setCodigoPostal(0);
        setCiudad("No disponible");
        setEstado("No disponible");
    }

    public Direccion(String calle, int numeroExterior, int numeroInterior, String colonia, int codigoPostal, String ciudad, String estado) {
        setCalle(calle);
        setNumeroExterior(numeroExterior);
        setNumeroInterior(numeroInterior);
        setColonia(colonia);
        setCodigoPostal(codigoPostal);
        setCiudad(ciudad);
        setEstado(estado);
    }

    // METODOS SETS Y GETS
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroExterior() {
        return numeroExterior;
    }

    public void setNumeroExterior(int numeroExterior) {
        this.numeroExterior = numeroExterior > 0 ? numeroExterior : 0;
    }

    public int getNumeroInterior() {
        return numeroInterior;
    }

    public void setNumeroInterior(int numeroInterior) {
        this.numeroInterior = numeroInterior > 0 ? numeroInterior : 0;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal > 0 ? codigoPostal : 0;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // SALIDA: Calle Falsa 1234-5, Avenida Siempre Viva, 34556, Ciudad Real, Coahuila
    @Override
    public String toString() {
        return this.calle + " " + this.numeroExterior + " - " + this.numeroInterior + ", " + this.colonia + ", " + this.codigoPostal + ", " + this.ciudad + ", " + this.estado;
    }

}
