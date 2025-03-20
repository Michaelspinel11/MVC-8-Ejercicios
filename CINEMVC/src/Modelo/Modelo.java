/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Modelo {
     private boolean[] asientos;
    public int capacidad;

    public Modelo(int capacidad) {
        this.capacidad = capacidad;
        this.asientos = new boolean[capacidad];
    }

    public boolean reservarAsiento(int numero) {
        if (numero >= 0 && numero < capacidad && !asientos[numero]) {
            asientos[numero] = true;
            return true;
        }
        return false;
    }

    public boolean estaLleno() {
        for (boolean asiento : asientos) {
            if (!asiento) {
                return false;
            }
        }
        return true;
    }

    public void mostrarAsientos() {
        for (int i = 0; i < capacidad; i++) {
            System.out.print((asientos[i] ? "[X]" : "[ ]") + " ");
            if ((i + 1) % 10 == 0) System.out.println();
        }
        System.out.println();
    }
}
