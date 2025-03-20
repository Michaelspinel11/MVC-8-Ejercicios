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
        private Modelo modelo;
    private Vista vista;
     private Scanner scanner;

    public Controlador() {
        modelo = new Modelo();
        vista = new Vista();
        scanner= new Scanner(System.in);
    }

    public void controlarAire(int temperatura, int humedad) {
        String registro = "Temperatura: " + temperatura + "°C, Humedad: " + humedad + "%";
        modelo.agregarRegistro(registro);

        if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
            modelo.encender();
        } else {
            modelo.apagar();
        }

        vista.mostrarEstado(modelo.isEncendido());
    }

    public void mostrarRegistros() {
        modelo.mostrarRegistros();
    }
    
    


    public void ejecutarRegistro() {
        int opcion;
        do {
           
           vista.menu();
            opcion = vista.tomaropcion();
          

           
            switch (opcion) {
                case 1 : 
                    System.out.print("Ingrese la temperatura (°C): ");
                    int temperatura = scanner.nextInt();
                    
                    System.out.print("Ingrese la humedad (%): ");
                    int humedad = scanner.nextInt();
                    
                    controlarAire(temperatura, humedad);
                break;
                case 2: 
                    mostrarRegistros();
                    break;
                case 0 :
                    System.out.println("Saliendo...");
                    break;
                default :
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0); 

        scanner.close(); 
    }
    
    
}
