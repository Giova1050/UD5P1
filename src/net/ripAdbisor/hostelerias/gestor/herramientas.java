package net.ripAdbisor.hostelerias.gestor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

import net.ripAdbisor.hostelerias.Restaurante;

public class Herramientas {

    private static ArrayList<Restaurante> listaRestaurante = new ArrayList<>();
    final static Scanner scanner = new Scanner(System.in);

    public static void añadirRestaurante() {

        String nombre = JOptionPane.showInputDialog("Introduce el nombre del restaurante:");
        Restaurante nuevoRestaurante = new Restaurante(nombre, null, 0, 0);
        listaRestaurante.add(nuevoRestaurante);

    }

    public static void mostrarRestaurante() {
        for (int i = 0; i < listaRestaurante.size(); i++) {
            JOptionPane.showMessageDialog(null, listaRestaurante.get(i), "Restaurante " + (i+1), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void eliminarRestaurante() {
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

    public void editarRestaurante(String nombre) {
        String opcionRestaurante;
        String opcionEditar;
        for (int i = 0; i < listaRestaurante.size(); i++) {
            System.out.println("Estos son todos los restaurantes para modificar, cual quieres modificar "
                    + listaRestaurante.get(i));
            opcionRestaurante = scanner.nextLine();
            
        }
    }
}


