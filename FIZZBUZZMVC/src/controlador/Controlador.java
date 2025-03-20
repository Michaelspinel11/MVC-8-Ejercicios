/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador {
     
     private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void empezar() {
        int opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.pedirOpcion();
            switch (opcion) {
                case 1:
                   
                    ejecutarFizzBuzz();
                    break;
                case 0:
                    vista.mostrarMensaje("Saliendo del programa...");
                    break;
                default:
                    vista.mostrarOpcionInvalida();
                    break;
            }
        } while (opcion != 0);
    }

    public void ejecutarFizzBuzz() {
        int rango = vista.pedirRango();
        for (int i = 1; i <= rango; i++) {
            String mensaje = modelo.generarMensaje(i);
            vista.mostrarMensaje("Número " + i + ": " + mensaje);
        }
    }
}


