/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Controlador {
     private Modelo modelo;
    private Vista vista;
    private Random random;

    public Controlador() {
        modelo = new Modelo();
        vista = new Vista();
        random = new Random();
    }

    public void controlarTemperatura() {
        while (true) {
            double temperatura = 5 + (35 - 5) * random.nextDouble();
            modelo.registrarTemperatura(temperatura);
            vista.mostrarTemperatura(temperatura);

            if (temperatura < 10) {
                vista.mostrarEstado("Calefactor encendido");
            } else if (temperatura > 25) {
                vista.mostrarEstado("Ventilador encendido");
            } else {
                vista.mostrarEstado("Inactivo");
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Error en la espera: " + e.getMessage());
            }
        }
    }

}
