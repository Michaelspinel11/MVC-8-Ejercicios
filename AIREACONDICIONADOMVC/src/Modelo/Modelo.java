/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Modelo {
     private boolean encendido;
    private ArrayList<String> registros;

    public Modelo() {
        registros = new ArrayList<>();
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void agregarRegistro(String registro) {
        registros.add(registro);
    }

    public void mostrarRegistros() {
        System.out.println("Registros de temperatura y humedad:");
        for (String registro : registros) {
            System.out.println(registro);
        }
    }
}
