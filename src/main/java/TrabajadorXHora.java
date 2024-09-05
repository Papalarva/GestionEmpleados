
import java.util.Scanner;

public class TrabajadorXHora extends Empleado {

    Scanner sc = new Scanner(System.in);
    private double pagoXHora;
    private int horasTrabajadas;

    // CONSTRUCTORES
    public TrabajadorXHora() {
        super();
    }

    public TrabajadorXHora(String nombres, String apellidoPaterno, String apellidoMaterno, Fecha fechaNacimiento, Direccion domicilio, String rfc, String departamento, double pagoXHora) {
        super(nombres, apellidoPaterno, apellidoMaterno, fechaNacimiento, domicilio, rfc, departamento);
        setPagoXHora(pagoXHora);
    }

    public TrabajadorXHora(String nombres, String apellidoPaterno, String apellidoMaterno, int anio, int mes, int dia, String calle, int numeroExterior, int numeroInterior, String colonia, int codigoPostal, String ciudad, String estado, String rfc, String departamento, double pagoXHora) {
        super(nombres, apellidoPaterno, apellidoMaterno, anio, mes, dia, calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado, rfc, departamento);
        setPagoXHora(pagoXHora);
    }

    // METODOS GETS Y SETS
    public double getPagoXHora() {
        return pagoXHora;
    }

    public void setPagoXHora(double pagoXHora) {
        this.pagoXHora = pagoXHora > 0 ? pagoXHora : 50;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas > 0 ? horasTrabajadas : 40;
    }

    // METODOS PROPIOS
    public void TrabajadorXHora() {
        System.out.print("Ingrese las horas trabajadas: ");
        this.horasTrabajadas = sc.nextInt();
    }

    @Override
    public double sueldo() {
        double sueldo = 0;
        if (this.horasTrabajadas <= 40) {
            sueldo = this.horasTrabajadas * this.pagoXHora;
        } else {
            sueldo = (40 * this.pagoXHora) + ((this.horasTrabajadas - 40) * 2 * this.pagoXHora);
        }
        return sueldo;
    }

}
