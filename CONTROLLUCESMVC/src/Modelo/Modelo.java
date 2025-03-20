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
    private boolean encendida;
    private ArrayList<String> registros;

    public Modelo() {
        registros = new ArrayList<>();
    }

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void agregarRegistro(String registro) {
        registros.add(registro);
    }

    public void mostrarRegistros() {
        System.out.println("Registros de estado de luces:");
        for (String registro : registros) {
            System.out.println(registro);
        }
    }
}
