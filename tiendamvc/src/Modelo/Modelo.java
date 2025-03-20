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
    
 private String[] miembros;
    private String[] empleados;

    public Modelo() {
        miembros = new String[]{"Juan", "Maria", "Carlos", "Ana"};
        empleados = new String[]{"Pedro", "Luis", "Sofia"};
    }

    public boolean esMiembro(String nombre) {
        for (String miembro : miembros) {
            if (miembro.equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public boolean esEmpleado(String nombre) {
        for (String empleado : empleados) {
            if (empleado.equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
}
