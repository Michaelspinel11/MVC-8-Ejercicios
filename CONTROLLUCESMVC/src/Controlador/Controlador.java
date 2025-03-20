/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Controlador {
      private Modelo Modelo;
    private Vista vista;

    public Controlador() {
        Modelo = new Modelo();
        vista = new Vista();
    }

    public void controlarLuces(boolean esNoche, boolean hayMovimiento) {
        String registro = "Noche: " + esNoche + ", Movimiento: " + hayMovimiento;
        Modelo.agregarRegistro(registro);

        if (esNoche && hayMovimiento) {
            Modelo.encender();
        } else {
            Modelo.apagar();
        }

        vista.mostrarEstado(Modelo.isEncendida());
    }

    public void mostrarRegistros() {
        Modelo.mostrarRegistros();
    }

    public void iniciarSimulacion() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            vista.mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 :
                    boolean esNoche = vista.pedirBooleano("¿Es de noche? (true/false): ", scanner);
                    boolean hayMovimiento = vista.pedirBooleano("¿Hay movimiento en la habitación? (true/false): ", scanner);
                    controlarLuces(esNoche, hayMovimiento);
                    try {
                        Thread.sleep(10000); 
                    } catch (InterruptedException e) {
                        vista.mostrarMensaje("Error en la simulación: " + e.getMessage());
                    }
                break;
                case 2 : 
                    mostrarRegistros();
                    break;
                case 0 :
                    vista.mostrarMensaje("Saliendo...");
                    break;
                default : 
                    vista.mostrarMensaje("Opción no válida.");
                break;
            }
        } while (opcion != 0);

        scanner.close();
    }
    }
    
    

