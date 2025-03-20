/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vista {
     public void mostrarEstado(boolean encendida) {
        if (encendida) {
            System.out.println("Luces encendidas.");
        } else {
            System.out.println("Luces apagadas.");
        }
    }

    public void mostrarMenu() {
        System.out.println("1. Simular estado de luces");
        System.out.println("2. Ver registros");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public boolean pedirBooleano(String mensaje, Scanner scanner) {
        System.out.print(mensaje);
        return scanner.nextBoolean();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
