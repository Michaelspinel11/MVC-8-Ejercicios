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
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    
    public void mostrarmenu(){
         System.out.println("1. Verificar acceso");
         System.out.println("0. Salir");
         System.out.print("Seleccione una opción: ");
    }
    
    
    
    public int tomarOpcion(){
        int opcion = scanner.nextInt();
      
        return opcion;
         
        
        
        
    }
}
