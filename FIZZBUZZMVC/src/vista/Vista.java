/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vista {
      private Scanner scanner;

    public Vista() {
        this.scanner = new Scanner(System.in);
    }
    public int pedirOpcion() {
        System.out.print("Ingrese la opcion: ");
        int opcion= scanner.nextInt();
        return opcion;
    }

    public int pedirRango() {
        System.out.print("Ingrese el rango máximo para FizzBuzz: ");
        int rango = scanner.nextInt();
        return rango;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarOpcionInvalida() {
        System.out.println("Opción inválida, intente de nuevo.");
    }

    public void mostrarMenu() {
        System.out.println("\n--- Menú FizzBuzz ---");
        System.out.println("1. Ejecutar FizzBuzz");
        System.out.println("0. Salir");
       
    }

}
