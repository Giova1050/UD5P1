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

    }

    public void editarRestaurante() {

    }

}
