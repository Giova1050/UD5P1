package net.ripAdbisor.hostelerias.gestor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

import net.ripAdbisor.hostelerias.Restaurante;

public class herramientas {

    static ArrayList<Restaurante> listaRestaurante = new ArrayList<>();
    final static Scanner scanner = new Scanner(System.in);

    public static void añadirRestaurante() {

        Restaurante nuevoRestaurante = new Restaurante(null, null, 0, 0);

        for (Restaurante nuevRestaurante : listaRestaurante) {
            if (nuevRestaurante == null) {
                listaRestaurante.add(nuevoRestaurante);
            }
        }

    }

    public void mostrarRestaurante() {
        for (int i = 0; i < listaRestaurante.size(); i++) {
            System.out.println(listaRestaurante.get(i));
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
                if (restaurante.getNombre().equalsIgnoreCase(opcionEliminar) ) {
                    restaurante = null;
                    borrar = true;
                    String mensajeborrar = borrar ? "Se ha borrado el restaurante" : "No se ha borrado el restaurante";
                    System.out.println(mensajeborrar);
                }
            }
        }
    }

    public void editarRestaurante() {

    }

}
