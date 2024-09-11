
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        GestionEmpleados gerente = new GestionEmpleados();
        int opcion = 1;
        Scanner sc = new Scanner(System.in);

        Fecha fechaNacimiento = new Fecha(15, 3, 1985);
        Direccion direccion = new Direccion("Av. Principal", 123, 456, "Centro", 12345, "Ciudad", "Estado");
        Jefe jefe = new Jefe("Carlos", "Pérez", "Gómez", fechaNacimiento, direccion, "CAR123456", "Dirección General", 5000);
        TrabajadorXComision trabajadorXComision = new TrabajadorXComision("Ana", "Martínez", "López", fechaNacimiento, direccion, "ANA654321", "Ventas", 2000, 0.05);
        TrabajadorXPieza trabajadorXPieza = new TrabajadorXPieza("Luis", "Ramírez", "García", fechaNacimiento, direccion, "LUI987654", "Producción", 50);
        TrabajadorXHora trabajadorXHora = new TrabajadorXHora("Marta", "Sánchez", "Vega", fechaNacimiento, direccion, "MAR456789", "Mantenimiento", 60);

        gerente.setEmpleados(jefe);
        gerente.setEmpleados(trabajadorXComision);
        gerente.setEmpleados(trabajadorXPieza);
        gerente.setEmpleados(trabajadorXHora);
        
        do {
            System.out.print("""
                           SELECCIONE ALGUNA OPCION 
                           0) Salir
                           1) Contratar empleado
                           2) Despedir empleado
                           3) Cargar datos de nomina
                           4) Generar nomina
                           5) Consultar datos de empleado
                           6) Modificar datos
                           OPCION:""");
            do {
                try {
                    opcion = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                }
            } while (true);
            System.out.println(" ");
            switch (opcion) {
                case 0 -> System.out.println("FIN DEL PROGRAMA");
                case 1 -> gerente.contratarEmpleado();
                case 2 -> gerente.despedirEmpleado();
                case 3 -> gerente.cargaDatosDomina();
                case 4 -> gerente.generarNomina();
                case 5 -> gerente.consultarDatos();
                case 6 -> gerente.modificarDatos();
                default -> System.out.println("Opcion no disponible");
            }
            System.out.println(" ");
        } while (opcion != 0);
    }
}
