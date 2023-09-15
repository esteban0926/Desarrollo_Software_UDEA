import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear Instancia de la clase empresa
        Empresa empresa = new Empresa("Sprint 2", "Calle 10 # 40-50", 4512017, "90100887-2");

        Scanner scanner = new Scanner(System.in);

        // Leer informacion de la empresa
        System.out.println("INFORMACION DE LA EMPRESA:");
        System.out.println("Nombre de la empresa: " + empresa.getNombre_empresa());
        System.out.println("Direccion: " + empresa.getDireccion());
        System.out.println("Telefono: " + empresa.getTelefono());
        System.out.println("NIT: " + empresa.getNit());
        System.out.println("--------------------------------------");

        // MODIFICAR INFORMACION de la empresa
        empresa.setNombre_empresa("Nueva Empresa");
        empresa.setDireccion("Cra 50 # 80 90");
        empresa.setTelefono(3104583);
        empresa.setNit("8009001-1");

        // Verificar los cambios de empresa
        System.out.println("DATOS MODIFICADOS DE LA EMPRESA");
        System.out.println("Nombre: " + empresa.getNombre_empresa());
        System.out.println("Direccion: " + empresa.getDireccion());
        System.out.println("Telefono: " + empresa.getTelefono());
        System.out.println("NIT: " + empresa.getNit());
        System.out.println("----------------------------");


    // Crear instancia de la clase empleado
        Empleado empleado = new Empleado("Juan Lopes","juan.lopez@hotmail.com","Empresa desarrollo","Operativo");

    //Leer Informacion del empleado
        System.out.println("INFORMACION DEL EMPLEADO");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Correo: " + empleado.getCorreo());
        System.out.println("Empresa: " + empleado.getEmpresa());
        System.out.println("Rol: " + empleado.getRol());
        System.out.println("-----------------------------");

    // Modificar informacion del empleado
        empleado.setNombre("Andres Garcia");
        empleado.setCorreo("andres.garcia@gmail.com");
        empleado.setEmpresa("Nuevo proyecto");
        empleado.setRol("Administrador");

    //Mostrar la informacion modificada del empleado
        System.out.println("DATOS ACTUALIZADOS DEL EMPLEADO:");
        System.out.println("Nombre: " +empleado.getNombre());
        System.out.println("Correo: " +empleado.getCorreo());
        System.out.println("Empresa: " +empleado.getEmpresa());
        System.out.println("Rol: " +empleado.getRol());
        System.out.println("-------------------------");

        // Crear Instancia de la clase "MovimientoDinero"

        MovimientoDinero movimiento = new MovimientoDinero(550000,"Ventas","Usuario1");

        //Leer la informacion del MovimientoDinero
        System.out.println("INFORMACION DEL MONTO_DINERO: ");
        System.out.println("Monto: $" +movimiento.getMonto());
        System.out.println("Concepto: " +movimiento.getConcepto());
        System.out.println("Usuario: " + movimiento.getUsuario());
        System.out.println("-------------------------------");

        // Modificar informacion monto-dinero
        movimiento.setMonto(-600000);
        movimiento.setConcepto("Pago de renta");
        movimiento.setUsuario("Usuario3");

        // Mostrar informacion actualizada
        System.out.println("INFORMACION MONTODINERO ATUALIZADO:");
        System.out.println("Monto: $" +movimiento.getMonto());
        System.out.println("Concepto: " + movimiento.getConcepto());
        System.out.println("Usuario: " +movimiento.getUsuario());



    }


    }

