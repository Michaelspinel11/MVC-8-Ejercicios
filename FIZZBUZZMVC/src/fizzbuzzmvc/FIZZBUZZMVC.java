/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fizzbuzzmvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class FIZZBUZZMVC {

    
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
         Controlador controlador = new Controlador(modelo,vista);
        controlador.empezar();

    }
    
}
