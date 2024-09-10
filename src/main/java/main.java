
public class main {

    public static void main(String[] args) {
        GestionEmpleados gerente = new GestionEmpleados();
        
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
        
        gerente.modificarDatos();
        gerente.consultarDatos();
        
    }
}
