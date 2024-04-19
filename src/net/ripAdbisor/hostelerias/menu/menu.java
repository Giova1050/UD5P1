package net.ripAdbisor.hostelerias.menu;

import javax.swing.JOptionPane;

import net.ripAdbisor.hostelerias.gestor.Herramientas;

public class Menu {

    public static void mostrarMenu() {
        String menu;
        Boolean bucle = true;
        while (bucle) {
            menu = JOptionPane.showInputDialog(null, """
                    SELECCIONA UNA OPCION
                    1. Añadir restaurante
                    2. Editar restaurante
                    3. Mostrar restaurante
                    4. Eliminar restaurante
                    Q. Salir del programa
                """, "RipAdbisor", JOptionPane.INFORMATION_MESSAGE);
            switch (menu) {
                case "1":
                    Herramientas.añadirRestaurante();
                    break;
                case "2":
                    Herramientas.editarRestaurante();
                    break;
                case "3":
                    Herramientas.mostrarRestaurante();
                    break;
                case "4":
                    Herramientas.eliminarRestaurante();
                    break;
                case "5":
                    bucle = false;
                default:
                    break;
            }
        }
    }

    public static String menuEdicion() {
        return JOptionPane.showInputDialog(null, """
                Dime el dato que quieres sustituir:
                1.Nombre
                2.Direccion
                3.Horario
                4.Puntuacion
                """, "Editar", JOptionPane.INFORMATION_MESSAGE);

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