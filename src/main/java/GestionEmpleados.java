
import java.util.ArrayList;

public abstract class GestionEmpleados {
    private static ArrayList<Empleado> empleados;
    
    public abstract int GestionEmpleados(int numeroEmpleados);
    public abstract void cargaDatosDomina();
    public abstract void consultarDatos(String rfc);
    public abstract void contratarEmpleado(Empleado e);
    public abstract void despedirEmpleado(String rfc);
    public abstract void generarNomina(String periodo);
    public abstract void modificarDatos(String rfc);
    
    
}
