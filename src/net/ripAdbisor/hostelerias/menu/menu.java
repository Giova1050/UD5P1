package net.ripAdbisor.hostelerias.menu;

public class menu {

    public void mostrarMenu() {
        System.out.println("""
                *****************************
                    SELECCIONA UNA OPCION
                    1. Añadir restaurante
                    2. Editar restaurante
                    3. Mostrar restaurante
                    4. Eliminar empleado
                    Q. Salir del programa
                *****************************
                """);
    }

    public static void menuEdicion() {
        System.out.println("""
             ================================================
             Dime el dato que quieres sustituir:
             1.Nombre
             2.Direccion
             3.Horario
             4.Puntuacion
             ================================================
             """);
    }
}

/**
 * System.out.println("-----------------Añade un
 * restaurante---------------------");
 * System.out.println("Dime el nombre, su dirreccion, horarios y puntiacion");
 * System.out.println("Nombre: ");
 * 
 * System.out.println("Direccion");
 * nuevoRestaurante.setDireccion(null);
 * System.out.println("Su horario");
 * nuevoRestaurante.setHorario(0);
 * System.out.println("Puntuacion");
 * nuevoRestaurante.setPuntuacion(0);
 */