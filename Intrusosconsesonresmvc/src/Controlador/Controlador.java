/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.util.Random;
import java.util.Scanner;


public class Controlador {
     private Modelo sistema;
    private Vista vista;
    private Random random;
    private Scanner scanner;

    public Controlador() {
        sistema = new Modelo();
        vista = new Vista();
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public void monitorear(boolean esNoche) {
        for (int i = 0; i < 3; i++) {
            sistema.activarSensor(i, random.nextBoolean());
        }
        sistema.verificarAlarma(esNoche);
        vista.mostrarEstadoAlarma(sistema.isAlarmaActivada());
    }
 public void ejecutar() {
        int opcion;
        do {
            System.out.println("1. Activar monitoreo nocturno");
            System.out.println("2. Desactivar monitoreo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                monitorear(true);
            } else if (opcion == 2) {
                monitorear(false);
            } else if (opcion == 0) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

      
    }
}
