package net.ripAdbisor.hostelerias.gestor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

import net.ripAdbisor.hostelerias.Restaurante;
import net.ripAdbisor.hostelerias.menu.Menu;

public class Herramientas {

    private static ArrayList<Restaurante> listaRestaurante = new ArrayList<>();
    final static Scanner scanner = new Scanner(System.in);

    public static void añadirRestaurante() {

        String nombre = JOptionPane.showInputDialog("Introduce el nombre del restaurante:");
        String direccion = JOptionPane.showInputDialog("Introduce la direccion: ");
        int horario = Integer.parseInt(JOptionPane.showInputDialog("Introduce el horario"));
        float puntuacion = Float.parseFloat(JOptionPane.showInputDialog("Introduce su puntuacion"));
        Restaurante nuevoRestaurante = new Restaurante(nombre, direccion, horario, puntuacion);
        listaRestaurante.add(nuevoRestaurante);
    }

    public static void mostrarRestaurante() {
        for (int i = 0; i < listaRestaurante.size(); i++) {
            JOptionPane.showMessageDialog(null, listaRestaurante.get(i), "Restaurante " + (i + 1),
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void eliminarRestaurante() {
        String opcionEliminar;
        boolean borrar = false;
        for (int i = 0; i < listaRestaurante.size(); i++) {
            System.out.println("Estos son los restaurantes creados, cual deseas eleminiar?");
            System.out.println(listaRestaurante.get(i));
            opcionEliminar = scanner.nextLine();
            for (Restaurante restaurante : listaRestaurante) {
                if (restaurante.getNombre().equalsIgnoreCase(opcionEliminar)) {
                    listaRestaurante.remove(restaurante);
                    borrar = true;
                }
            }
            String mensajeborrar = borrar ? "Se ha borrado el restaurante" : "No se ha borrado el restaurante";
            System.out.println(mensajeborrar);
        }
    }

    public static void editarRestaurante() {
        String nombreRestauranteEditar = JOptionPane.showInputDialog("Introduce el nombre del restaurante que quieres editar:");;
        for (Restaurante restaurante : listaRestaurante) {
            if (restaurante.getNombre().equals(nombreRestauranteEditar)) {
                opcionEdicionRestaurante(restaurante);
            }
        }
    }

    public static void opcionEdicionRestaurante(Restaurante restaurante) {
        String opcionEdicion = Menu.menuEdicion();
        switch (opcionEdicion) {
            case "1":
                String nuevoNombre = JOptionPane.showInputDialog("Dime el nuevo nombre");
                restaurante.setNombre(nuevoNombre);               
                break;
            case "2":
                String nuevaDireccion = JOptionPane.showInputDialog("Dime la nueva direccion");
                restaurante.setDireccion(nuevaDireccion);
                break;
            case "3":
                int nuevoHorario = Integer.parseInt(JOptionPane.showInputDialog("Dime el nuevo horario"));
                restaurante.setHorario(nuevoHorario);
                break;
            case "4": 
                float nuevaPuntuacion = Float.parseFloat(JOptionPane.showInputDialog("Dime la nueva puntiacion"));
                restaurante.setPuntuacion(nuevaPuntuacion);
            default:
                break;
        }
    }
}
