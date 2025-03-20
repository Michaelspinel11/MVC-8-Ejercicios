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
     private ArrayList<Double> temperaturas;

    public Modelo() {
        temperaturas = new ArrayList<>();
    }

    public void registrarTemperatura(double temperatura) {
        temperaturas.add(temperatura);
    }

    public ArrayList<Double> getTemperaturas() {
        return temperaturas;
    }

}
