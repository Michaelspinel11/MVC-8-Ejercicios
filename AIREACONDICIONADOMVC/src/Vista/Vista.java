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
    private Scanner scanner;
    public Vista(){
        scanner= new Scanner(System.in);
    }
     public void mostrarEstado(boolean encendido) {
        if (encendido) {
            System.out.println("Aire acondicionado encendido.");
        } else {
            System.out.println("Aire acondicionado apagado.");
        }
    }
     
     public void menu(){
          System.out.println("1. Registrar temperatura y humedad");
            System.out.println("2. Ver registros");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
     }
     
     public int tomaropcion(){
 int opcion = scanner.nextInt();
      
        return opcion;
     }
     
     
}
