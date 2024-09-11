
import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleados {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Empleado> empleados;

    public void setEmpleados(Empleado empleado) {
        empleados.add(empleado);
    }

    public GestionEmpleados() {
        empleados = new ArrayList<>();
    }

    public void cargaDatosDomina() {
        for (Empleado empleado : empleados) {
            switch (empleado) {
                case TrabajadorXComision trabajadorXComision -> {
                    System.out.println(empleado.getNombres() + " " + empleado.getApellidoPaterno() + " " + empleado.getApellidoPaterno() + "\tTRABAJADOR POR COMISION");
                    do {
                        try {
                            System.out.print("Introduzca la cantidad vendida: $");
                            trabajadorXComision.setCantidad(Integer.parseInt(sc.nextLine()));
                            break;
                        } catch (NumberFormatException e) {
                            System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                        }
                    } while (true);
                }
                case TrabajadorXHora trabajadorXHora -> {
                    System.out.println(empleado.getNombres() + " " + empleado.getApellidoPaterno() + " " + empleado.getApellidoPaterno() + "\tTRABAJADOR POR HORA");
                    do {
                        try {
                            System.out.print("Introduzca el numero de horas trabajadas: ");
                            trabajadorXHora.setHorasTrabajadas(Integer.parseInt(sc.nextLine()));
                            break;
                        } catch (NumberFormatException e) {
                            System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                        }
                    } while (true);
                }
                case TrabajadorXPieza trabajadorXPieza -> {
                    System.out.println(empleado.getNombres() + " " + empleado.getApellidoPaterno() + " " + empleado.getApellidoPaterno() + "\tTRABAJADOR POR PIEZA");
                    do {
                        try {
                            System.out.print("Introduzca la de piezas producidas: ");
                            trabajadorXPieza.setCantidad(Integer.parseInt(sc.nextLine()));
                            break;
                        } catch (NumberFormatException e) {
                            System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                        }
                    } while (true);
                }
                default -> {
                }
            }
            System.out.println("");
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
        int dia = 1, mes = 1, anio = 2000, numeroExterior = 1, numeroInterior = 1, codigoPostal = 1, opcion = 1;
        double sueldo = 1, salarioBase = 1, comision = 1, pagoXPieza = 1, pagoXHora = 1;

        // LECTURA DE LOS DATOS DE LOS EMPLEADOS
        System.out.println("-----D A T O S   D E L   E M P L E A D O-----");
        System.out.print("Ingrese el o los nombres: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el apellido Paterno: ");
        String apellidoPaterno = sc.nextLine();
        System.out.print("Ingrese el apellido Materno: ");
        String apellidoMaterno = sc.nextLine();
        System.out.println("\n-----FECHA DE NACIMIENTO-----");
        do {
            try {
                System.out.print("Ingrese el dia: ");
                dia = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
            }
        } while (true);
        do {
            try {
                System.out.print("Ingrese el mes: ");
                mes = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
            }
        } while (true);
        do {
            try {
                System.out.print("Ingrese el anio: ");
                anio = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
            }
        } while (true);
        System.out.println("\n-----DOMICILIO-----");
        System.out.print("Ingrese la calle: ");
        String calle = sc.nextLine();
        do {
            try {
                System.out.print("Ingrese el numero exterior: ");
                numeroExterior = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
            }
        } while (true);
        do {
            try {
                System.out.print("Ingrese el numero interior: ");
                numeroInterior = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
            }
        } while (true);
        System.out.print("Ingrese la colonia: ");
        String colonia = sc.nextLine();
        do {
            try {
                System.out.print("Ingrese el codigo postal: ");
                codigoPostal = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
            }
        } while (true);
        System.out.print("Ingrese la ciudad: ");
        String ciudad = sc.nextLine();
        System.out.print("Ingrese el estado: ");
        String estado = sc.nextLine();
        System.out.println("\n----- DATOS DE LA EMPRESA -----");
        System.out.print("Ingrese el RFC del empleado: ");
        String rfc = sc.nextLine();
        System.out.print("Ingrese el departamento asignado: ");
        String departamento = sc.nextLine();

        // VALIDACION DE NO QUE NO EXISTA UN EMPLEADO CON EL MISMO RFC
        boolean encontrado = false;
        for (Empleado empleado : empleados) {
            if (empleado.getRfc().equals(rfc.toUpperCase())) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Empleado ya registrado");
        } else {
            System.out.print("""
                             
                             ----- TIPO DE EMPLEADO ----- 
                             1) Jefe
                             2) Trabajador por comision
                             3) Trabajador por pieza
                             4) Trabajador por hora
                             OPCION: """);
            do {
                try {
                    opcion = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                }
            } while (true);
            System.out.println("");
            switch (opcion) {
                case 1 -> {
                    do {
                        try {
                            System.out.print("Ingrese el sueldo semanal: $");
                            sueldo = Double.parseDouble(sc.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                        }
                    } while (true);
                    empleados.add(new Jefe(nombre, apellidoPaterno, apellidoMaterno, dia, mes, anio, calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado, rfc, departamento, sueldo));
                }
                case 2 -> {
                    do {
                        try {
                            System.out.print("Introduzca el salario base del empleado: $");
                            salarioBase = Double.parseDouble(sc.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                        }
                    } while (true);
                    do {
                        try {
                            System.out.print("Ingrese la comision del empleado (Entre 0 a 1): ");
                            comision = Double.parseDouble(sc.nextLine());
                            if (comision > 1 || comision < 0) {
                                System.out.println("\nCantidad invalida. Introduzca un valor entre (0, 1)");
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                        }
                    } while (true);
                    empleados.add(new TrabajadorXComision(nombre, apellidoPaterno, apellidoMaterno, dia, mes, anio, calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado, rfc, departamento, salarioBase, comision));
                }
                case 3 -> {
                    do {
                        try {
                            System.out.print("Ingrese el pago por pieza: $");
                            pagoXPieza = Double.parseDouble(sc.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                        }
                    } while (true);
                    empleados.add(new TrabajadorXPieza(nombre, apellidoPaterno, apellidoMaterno, dia, mes, anio, calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado, rfc, departamento, pagoXPieza));
                }
                case 4 -> {
                    do {
                        try {
                            System.out.print("Ingrese el pago por hora: $");
                            pagoXHora = Double.parseDouble(sc.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                        }
                    } while (true);
                    empleados.add(new TrabajadorXHora(nombre, apellidoPaterno, apellidoMaterno, dia, mes, anio, calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado, rfc, departamento, pagoXHora));
                }
                default ->
                    System.out.println("OPCION NO VALIDA");
            }
            System.out.println("\nEMPLEADO AGREGADO EXITOSAMENTE\n");
        }

    }

    public void despedirEmpleado() {
        System.out.print("Ingrese el RFC del empleado: ");
        String rfc = sc.nextLine();
        boolean encontrado = false;
        for (Empleado empleado : empleados) {
            if (empleado.getRfc().equals(rfc.toUpperCase())) {
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

    public void generarNomina() {
        int dia = 1, mes = 1, anio = 1, contador = 1;
        System.out.println("Introduzca el periodo de pago");
        System.out.println("\n-----D E S D E-----");
        do {
            try {
                System.out.print("Ingrese el dia: ");
                dia = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
            }
        } while (true);
        do {
            try {
                System.out.print("Ingrese el mes: ");
                mes = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
            }
        } while (true);
        do {
            try {
                System.out.print("Ingrese el anio: ");
                anio = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
            }
        } while (true);
        Fecha inicio = new Fecha(dia, mes, anio);
        System.out.println("\n-----H A S T A-----");
        do {
            try {
                System.out.print("Ingrese el dia: ");
                dia = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
            }
        } while (true);
        do {
            try {
                System.out.print("Ingrese el mes: ");
                mes = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
            }
        } while (true);
        do {
            try {
                System.out.print("Ingrese el anio: ");
                anio = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
            }
        } while (true);
        Fecha fin = new Fecha(dia, mes, anio);
        System.out.println("\n\n--------------------P E R I O D O   D E   P A G O----------" 
                           + "\n                  ("+ inicio + "    al    " + fin+")");
       
        System.out.printf("\n%-5s%-20s%-30s%-10s", "NO.", "RFC", "NOMBRE", "TIPO DE EMPLEADO");
        System.out.printf("\n%-5s%-20s%-15s%-15s%-10s", " ", "SUELDO BASE", "COMISION/", "CANTIDAD/" , "SUELDO");
        System.out.printf("\n%-5s%-20s%-15s%-15s%-10s\n", " ", " ", "SUELDOXHORA", "HRS" , " ");
        for (Empleado empleado : empleados) {
            switch (empleado) {
                case Jefe jefe -> {
                    System.out.printf("\n%-5s%-20s%-30s%-10s", contador, empleado.getRfc(), empleado.getNombres() + " " + empleado.getApellidoPaterno() + " " + empleado.getApellidoPaterno(), "Jefe");
                    System.out.printf("\n%-5s%-20s%-30s%-10s\n\n", " ", jefe.getSueldoSemanal(), " ", empleado.sueldo());
                }
                case TrabajadorXComision trabajadorXComision -> {
                    System.out.printf("\n%-5s%-20s%-30s%-10s", contador, empleado.getRfc(), empleado.getNombres() + " " + empleado.getApellidoPaterno() + " " + empleado.getApellidoPaterno(), "Empleado por comision");
                    System.out.printf("\n%-5s%-20s%-15s%-15s%-10s\n\n", " ", trabajadorXComision.getSalarioBase(), trabajadorXComision.getComision(),trabajadorXComision.getCantidad(), empleado.sueldo());
                }
                case TrabajadorXHora trabajadorXHora -> {
                    System.out.printf("\n%-5s%-20s%-30s%-10s", contador, empleado.getRfc(), empleado.getNombres() + " " + empleado.getApellidoPaterno() + " " + empleado.getApellidoPaterno(), "Empleado por hora");
                    System.out.printf("\n%-5s%-20s%-15s%-15s%-10s\n\n", " ", "", trabajadorXHora.getPagoXHora(),trabajadorXHora.getHorasTrabajadas(), empleado.sueldo());
                }
                case TrabajadorXPieza trabajadorXPieza -> {
                    System.out.printf("\n%-5s%-20s%-30s%-10s", contador, empleado.getRfc(), empleado.getNombres() + " " + empleado.getApellidoPaterno() + " " + empleado.getApellidoPaterno(), "Empleado por pieza");
                    System.out.printf("\n%-5s%-20s%-15s%-15s%-10s\n\n", " ", " ", trabajadorXPieza.getPagoXPieza(),trabajadorXPieza.getCantidad(), empleado.sueldo());
                }
                default -> {
                }
            }
            contador++;
        }
    }

    public void modificarDatos() {
        int dia = 1, mes = 1, anio = 2000, numeroExterior = 1, numeroInterior = 1, codigoPostal = 1, opcion = 1;
        boolean encontrado = false;

        System.out.print("Ingrese el RFC del empleado: ");
        String rfc = sc.nextLine();

        for (Empleado empleado : empleados) {
            if (empleado.getRfc().equals(rfc.toUpperCase())) {
                encontrado = true;

                System.out.println("\nNOMBRE: " + empleado.getNombres() + " " + empleado.getApellidoPaterno() + " " + empleado.getApellidoMaterno()
                        + "\nDEPARTAMENTO: " + empleado.getDepartamento());
                System.out.print("""
                                 
                                 Seleccione la opcion que desea realizar: 
                                 1) Modificar datos generales
                                 2) Modificar datos de salario
                                 OPCION: """);
                do {
                    try {
                        opcion = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                    }
                } while (true);
                switch (opcion) {
                    case 1 -> {
                        System.out.println("\nNOMBRE: " + empleado.getNombres()
                                + "\nAPELLIDO PATERNO: " + empleado.getApellidoPaterno()
                                + "\nAPELLIDO MATERNO: " + empleado.getApellidoMaterno()
                                + "\nFECHA DE NACIMIENTO: " + empleado.getFechaNacimiento()
                                + "\nDOMICILIO: " + empleado.getDomicilio()
                                + "\nRFC: " + empleado.getRfc()
                                + "\nDEPARTAMENTO: " + empleado.getDepartamento());

                        System.out.print("""
                                         
                                         Que dato desear cambiar? 
                                         1) NOMBRE
                                         2) APELLIDO PATERNO
                                         3) APELLIDO MATERNO
                                         4) FECHA DE NACIMIENTO
                                         5) DOMICILIO
                                         6) RFC
                                         7) DEPARTAMENTO
                                         OPCION: """);
                        do {
                            try {
                                opcion = Integer.parseInt(sc.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                            }
                        } while (true);
                        System.out.println("");
                        switch (opcion) {
                            case 1 -> {
                                System.out.print("Ingrese el o los nombres: ");
                                empleado.setNombres(sc.nextLine());
                            }
                            case 2 -> {
                                System.out.print("Ingrese el apellido Paterno: ");
                                empleado.setApellidoPaterno(sc.nextLine());
                            }
                            case 3 -> {
                                System.out.print("Ingrese el apellido Materno: ");
                                empleado.setApellidoMaterno(sc.nextLine());
                            }
                            case 4 -> {
                                do {
                                    try {
                                        System.out.print("Ingrese el dia: ");
                                        dia = Integer.parseInt(sc.nextLine());
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                                    }
                                } while (true);
                                do {
                                    try {
                                        System.out.print("Ingrese el mes: ");
                                        mes = Integer.parseInt(sc.nextLine());
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                                    }
                                } while (true);
                                do {
                                    try {
                                        System.out.print("Ingrese el anio: ");
                                        anio = Integer.parseInt(sc.nextLine());
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                                    }
                                } while (true);
                                empleado.setFechaNacimiento(new Fecha(dia, mes, anio));
                            }
                            case 5 -> {
                                System.out.print("Ingrese la calle: ");
                                String calle = sc.nextLine();
                                do {
                                    try {
                                        System.out.print("Ingrese el numero exterior: ");
                                        numeroExterior = Integer.parseInt(sc.nextLine());
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                                    }
                                } while (true);
                                do {
                                    try {
                                        System.out.print("Ingrese el numero interior: ");
                                        numeroInterior = Integer.parseInt(sc.nextLine());
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                                    }
                                } while (true);
                                System.out.print("Ingrese la colonia: ");
                                String colonia = sc.nextLine();
                                do {
                                    try {
                                        System.out.print("Ingrese el codigo postal: ");
                                        codigoPostal = Integer.parseInt(sc.nextLine());
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                                    }
                                } while (true);
                                System.out.print("Ingrese la ciudad: ");
                                String ciudad = sc.nextLine();
                                System.out.print("Ingrese el estado: ");
                                String estado = sc.nextLine();
                                empleado.setDomicilio(new Direccion(calle, numeroExterior, numeroInterior, colonia, codigoPostal, ciudad, estado));
                            }
                            case 6 -> {
                                System.out.print("Ingrese el RFC del empleado: ");
                                empleado.setRfc(sc.nextLine());
                            }
                            case 7 -> {
                                System.out.print("Ingrese el departamento asignado: ");
                                empleado.setDepartamento(sc.nextLine());
                            }
                            default ->
                                System.err.println("OPCION NO VALIDA");
                        }
                    }
                    case 2 -> {
                        switch (empleado) {
                            case Jefe jefe -> {
                                System.out.println("SUELDO SEMANAL: $" + jefe.getSueldoSemanal() + "\n");
                                do {
                                    try {
                                        System.out.print("Ingrese el sueldo semanal: $");
                                        jefe.setSueldoSemanal(Double.parseDouble(sc.nextLine()));
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                                    }
                                } while (true);
                            }
                            case TrabajadorXComision trabajadorXComision -> {
                                System.out.println("SALARIO BASE: $" + trabajadorXComision.getSalarioBase()
                                        + "\nCOMISION: " + trabajadorXComision.getComision() + "\n");
                                do {
                                    try {
                                        System.out.print("Introduzca el salario base del empleado: $");
                                        trabajadorXComision.setSalarioBase(Double.parseDouble(sc.nextLine()));
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                                    }
                                } while (true);
                                double comision;
                                do {
                                    try {
                                        System.out.print("Ingrese la comision del empleado (Entre 0 a 1): ");
                                        comision = Double.parseDouble(sc.nextLine());
                                        if (comision > 1 || comision < 0) {
                                            System.out.println("\nCantidad invalida. Introduzca un valor entre (0, 1)");
                                        } else {
                                            trabajadorXComision.setComision(comision);
                                            break;
                                        }
                                    } catch (NumberFormatException e) {
                                        System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                                    }
                                } while (true);
                            }
                            case TrabajadorXHora trabajadorXHora -> {
                                System.out.println("PAGO POR Hora: $" + trabajadorXHora.getPagoXHora() + "\n");
                                do {
                                    try {
                                        System.out.print("Ingrese el pago por hora: $");
                                        trabajadorXHora.setPagoXHora(Double.parseDouble(sc.nextLine()));
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                                    }
                                } while (true);
                            }
                            case TrabajadorXPieza trabajadorXPieza -> {
                                System.out.println("PAGO POR PIEZA: $" + trabajadorXPieza.getPagoXPieza() + "\n");
                                do {
                                    try {
                                        System.out.print("Ingrese el pago por pieza: $");
                                        trabajadorXPieza.setPagoXPieza(Double.parseDouble(sc.nextLine()));
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.err.println("\nEntrada invalida. Vuelva a intentar...\n");
                                    }
                                } while (true);
                            }
                            default -> {
                            }
                        }
                    }
                    default ->
                        System.err.println("OPCION NO VALIDA");
                }
            }
        }
        if (!encontrado) {
            System.out.println("Empleado no encontrado");
        }

    }
}
