
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.util.Scanner;


public class Controlador {
      private Modelo sala;
    private Vista vista;

    public Controlador(int capacidad) {
        sala = new Modelo(capacidad);
        vista = new Vista();
    }

    public void iniciarReserva() {
        Scanner scanner = new Scanner(System.in);
        while (!sala.estaLleno()) {
            sala.mostrarAsientos();
            vista.mostrarMensaje("Ingrese el número de asiento a reservar (0 a " + (sala.capacidad - 1) + "): ");
            vista.mostrarMensaje("Ingrese 10 para salir.");
           
            int numero = scanner.nextInt();
            if(numero == 10){
                vista.mostrarMensaje("saliendo del sistema de reservas");
                break;
            }
            if (sala.reservarAsiento(numero)) {
                vista.mostrarMensaje("Reserva exitosa!");
            } else {
                vista.mostrarMensaje("Asiento ocupado o número inválido.");
            }
        }
     
        scanner.close();
    }
}
