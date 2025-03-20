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
    private Modelo tienda;
    private Vista vista;
    private Scanner scanner;

    public Controlador() {
        tienda = new Modelo();
        vista = new Vista();
        scanner= new Scanner(System.in);
    }

    public void verificarAcceso(String nombre, boolean horarioAtencion) {
        if ((tienda.esMiembro(nombre) && horarioAtencion) || tienda.esEmpleado(nombre)) {
            vista.mostrarMensaje("Acceso permitido para " + nombre);
        } else {
            vista.mostrarMensaje("Acceso denegado para " + nombre);
        }
    }
    
    
    public void ejecucion(){
        int opcion;
        do{
          vista.mostrarmenu();
          opcion= vista.tomarOpcion();
           scanner.nextLine();
          switch(opcion){
              case 1:
                   System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    
                    System.out.print("¿Es horario de atención? (true/false): ");
                    boolean horarioAtencion = scanner.nextBoolean();
                    verificarAcceso(nombre, horarioAtencion);
                  break;
          }
            
            
        }while(opcion !=2);
    }
    
    
    
}
