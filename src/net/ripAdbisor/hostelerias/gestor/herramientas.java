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

        try {
            String nombre = JOptionPane.showInputDialog("Introduce el nombre del restaurante:");
            String direccion = JOptionPane.showInputDialog("Introduce la direccion: ");
            int horario = Integer.parseInt(JOptionPane.showInputDialog("Introduce el horario"));
            float puntuacion = Float.parseFloat(JOptionPane.showInputDialog("Introduce su puntuacion"));
            Restaurante nuevoRestaurante = new Restaurante(nombre, direccion, horario, puntuacion);
            listaRestaurante.add(nuevoRestaurante);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Se ha introducido una cadena en vez de numeros", "Error", 0);
        }
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
            opcionEliminar = JOptionPane.showInputDialog(
                    "Estos son los restaurantes creados, cual deseas eleminiar? " + listaRestaurante.get(i));
            for (Restaurante restaurante : listaRestaurante) {
                if (restaurante.getNombre().equalsIgnoreCase(opcionEliminar)) {
                    listaRestaurante.remove(restaurante);
                    borrar = true;
                } else {
                    JOptionPane.showMessageDialog(null, "No existe ese restaurante!!", "Error", i);
                }
            }
            String mensajeborrar = borrar ? "Se ha borrado el restaurante" : "No se ha borrado el restaurante";
            JOptionPane.showMessageDialog(null, mensajeborrar, "Borrado", i);
        }
    }

    public static void editarRestaurante() {
        String nombreRestauranteEditar = JOptionPane
                .showInputDialog("Introduce el nombre del restaurante que quieres editar:");
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
                try {
                    int nuevoHorario = Integer.parseInt(JOptionPane.showInputDialog("Dime el nuevo horario"));
                    restaurante.setHorario(nuevoHorario);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Se ha introducido una cadena en vez de numeros", "Error", 0);
                }
                break;
            case "4":
                try {
                    float nuevaPuntuacion = Float.parseFloat(JOptionPane.showInputDialog("Dime la nueva puntiacion"));
                    restaurante.setPuntuacion(nuevaPuntuacion);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Se ha introducido una cadena en vez de numeros", "Error", 0);
                }
            default:
                break;
        }
    }
}
