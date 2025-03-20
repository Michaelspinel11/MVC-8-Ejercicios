/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author Usuario
 */
public class Vista {
      public void mostrarEstadoAlarma(boolean activada) {
        if (activada) {
            System.out.println("Alarma activada: ¡Intruso detectado!");
        } else {
            System.out.println("Alarma desactivada.");
        }
    }

}
