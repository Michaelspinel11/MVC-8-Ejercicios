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
      private boolean[] sensores;
    private boolean alarma;

    public Modelo() {
        sensores = new boolean[3];
        alarma = false;
    }

    public void activarSensor(int indice, boolean estado) {
        sensores[indice] = estado;
    }

    public void verificarAlarma(boolean esNoche) {
        int activados = 0;
        for (boolean sensor : sensores) {
            if (sensor) activados++;
        }
        alarma = esNoche && activados >= 2;
    }

    public boolean isAlarmaActivada() {
        return alarma;
    }

}
