package net.ripAdbisor.hostelerias.gestor;

import java.util.Scanner;

import net.ripAdbisor.hostelerias.Restaurante;
import net.ripAdbisor.hostelerias.menu.menu;

public class edicion {

    Scanner scanner = new Scanner(System.in);

    public void opcionEdicionRestaurante() {
        menu.menuEdicion();
        boolean bucle = true;
        while (bucle); {
        String opcionEdicion = scanner.nextLine();
        switch (opcionEdicion) {
            case "1":
                System.out.println("Dime el nuevo nombre para sustituir");
                String nombreSustituto = scanner.nextLine();
                
                break;
        
            default:
                break;
        }
    }
    }

    
}
