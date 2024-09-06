
import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleados {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Empleado> empleados;

    public GestionEmpleados() {
        empleados = new ArrayList<>();
    }

    public void cargaDatosDomina() {
        for (Empleado empleado : empleados) {
            if (empleado instanceof TrabajadorXComision) {
                ((TrabajadorXComision) empleado).TrabajadorXComision();
            } else if (empleado instanceof TrabajadorXHora) {
                ((TrabajadorXHora) empleado).TrabajadorXHora();
            } else if (empleado instanceof TrabajadorXPieza) {
                ((TrabajadorXPieza) empleado).TrabajadorXPieza();
            }
        }
    }

    public void consultarDatos() {
        System.out.print("Ingrese el RFC del empleado: ");
        String rfc = sc.nextLine();
        System.out.println("");
        boolean encontrado = false;
        for (Empleado empleado : empleados) {
            if (empleado.getRfc().equals(rfc.toUpperCase())) {
                encontrado = true;
                System.out.println(empleado);
            }
        }
        if (!encontrado) {
            System.out.println("EMPLEADO NO ENCONTRADO");
        }
    }

    public void contratarEmpleado() {

        System.out.println("-----D A T O S   D E L   E M P L E A D O-----");
        System.out.print("Ingrese el o los nombres: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el apellido Paterno: ");
        String apellidoPaterno = sc.nextLine();
        System.out.print("Ingrese el apellido Materno: ");
        String apellidoMaterno = sc.nextLine();
        System.out.println("\n-----FECHA DE NACIMIENTO-----");
        System.out.print("Ingrese el dia: ");
        int dia = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el mes: ");
        int mes = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el anio: ");
        int anio = Integer.parseInt(sc.nextLine());
        System.out.println("\n-----DOMICILIO-----");
        System.out.print("Ingrese la calle: ");
        String calle = sc.nextLine();
        System.out.print("Ingrese el numero exterior: ");
        int numeroExterior = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el numero interior: ");
        int numeroInterior = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese la colonia: ");
        String colonia = sc.nextLine();
        System.out.print("Ingrese el codigo postal: ");
        int codigoPostal = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese la ciudad: ");
        String ciudad = sc.nextLine();
        System.out.print("Ingrese el estado: ");
        String estado = sc.nextLine();
        System.out.println("\n----- DATOS DE LA EMPRESA -----");
        System.out.print("Ingrese el RFC del empleado: ");
        String rfc = sc.nextLine();
        System.out.print("Ingrese el departamento asignado: ");
        String departamento = sc.nextLine();
        boolean encontrado = false;
        for (Empleado empleado : empleados) {
            if (empleado.getRfc().equals(rfc)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Empleado ya registrado");
        } else {
            System.out.print("\n----- TIPO DE EMPLEADO ----- "
                    + "\n1) Jefe"
                    + "\n2) Trabajador por comision"
                    + "\n3) Trabajador por pieza"
                    + "\n4) Trabajador por hora"
                    + "\nOPCION: ");
            int opcion = Integer.parseInt(sc.nextLine());
            System.out.println("");
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el sueldo semanal: $");
                    double sueldo = Double.parseDouble(sc.nextLine());
                    empleados.add(new Jefe(nombre, apellidoPaterno, apellidoMaterno, dia, mes, anio, calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado, rfc, departamento, sueldo));
                    break;
                case 2:
                    System.out.print("Introduzca el salario base del empleado: $");
                    double salarioBase = Double.parseDouble(sc.nextLine());
                    System.out.print("Ingrese la comision del empleado (Entre 0 a 1): ");
                    double comision = Double.parseDouble(sc.nextLine());
                    empleados.add(new TrabajadorXComision(nombre, apellidoPaterno, apellidoMaterno, dia, mes, anio, calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado, rfc, departamento));
                    break;
                case 3:
                    System.out.print("Ingrese el pago por pieza: $");
                    double pagoXPieza = Double.parseDouble(sc.nextLine());
                    empleados.add(new TrabajadorXPieza(nombre, apellidoPaterno, apellidoMaterno, dia, mes, anio, calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado, rfc, departamento, pagoXPieza));
                    break;
                case 4:
                    System.out.print("Ingrese el pago por hora: $");
                    double pagoXHora = Double.parseDouble(sc.nextLine());
                    empleados.add(new TrabajadorXHora(nombre, apellidoPaterno, apellidoMaterno, dia, mes, anio, calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado, rfc, departamento, pagoXHora));
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("\nEMPLEADO AGREGADO EXITOSAMENTE\n");
        }

    }

    public void despedirEmpleado() {
        System.out.print("Ingrese el RFC del empleado: ");
        String rfc = sc.nextLine();
        boolean encontrado = false;
        for (Empleado empleado : empleados) {
            if (empleado.getRfc().equals(rfc)) {
                encontrado = true;
                System.out.println("\n" + empleado.getNombres() + " " + empleado.getApellidoPaterno() + " " + empleado.getApellidoMaterno() 
                        + "\nDEPARTAMENTO: " + empleado.departamento);
                
                System.out.print("\nDeseas eliminar al empleado? 1)Si 2)No:  ");
                int opcion = Integer.parseInt(sc.nextLine());
                if (opcion == 1) {
                    empleados.remove(empleado);
                    break;
                } else {
                    System.out.println("Se cancelo la operacion");
                }
            }
        }
        if (!encontrado) {
            System.out.println("EMPLEADO NO ENCONTRADO");
        }
    }

//    public abstract void generarNomina(String periodo);
    public void modificarDatos(String rfc) {

    }
}
