/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Scanner;
import modelo.modelo;
import vista.vista;

/**
 *
 * @author Usuario
 */
public class controlador {
     private modelo calculadora;
    private vista vista;

    public controlador() {
        calculadora = new modelo();
        vista = new vista();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            vista.mostrarMensaje("\nCalculadora");
            vista.mostrarMensaje("1. Sumar");
            vista.mostrarMensaje("2. Restar");
            vista.mostrarMensaje("3. Multiplicar");
            vista.mostrarMensaje("4. Dividir");
            vista.mostrarMensaje("5. Ver resultados anteriores");
            vista.mostrarMensaje("0. Salir");
            vista.mostrarMensaje("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                vista.mostrarMensaje("Ingrese el primer número: ");
                double a = scanner.nextDouble();
                vista.mostrarMensaje("Ingrese el segundo número: ");
                double b = scanner.nextDouble();
                double resultado = 0;
                switch (opcion) {
                    case 1 : 
                        resultado = calculadora.sumar(a, b);
                        break;
                    case 2 : 
                        resultado = calculadora.restar(a, b);
                        break;
                    case 3 :
                        resultado = calculadora.multiplicar(a, b);
                        break;
                    case 4 :
                        resultado = calculadora.dividir(a, b);
                        break;
                }
                vista.mostrarResultado(resultado);
            } else if (opcion == 5) {
                calculadora.mostrarResultados();
            } else if (opcion != 0) {
                vista.mostrarMensaje("Opción no válida.");
            }
        } while (opcion != 0);
        scanner.close();
    }

}
