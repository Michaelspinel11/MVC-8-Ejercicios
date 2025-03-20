/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class modelo {
     private double[] resultados;
    private int indice;

    public modelo() {
        resultados = new double[100];  
        indice = 0;
    }

    public double sumar(double a, double b) {
        double resultado = a + b;
        almacenarResultado(resultado);
        return resultado;
    }

    public double restar(double a, double b) {
        double resultado = a - b;
        almacenarResultado(resultado);
        return resultado;
    }

    public double multiplicar(double a, double b) {
        double resultado = a * b;
        almacenarResultado(resultado);
        return resultado;
    }

    public double dividir(double a, double b) {
        if (b != 0) {
            double resultado = a / b;
            almacenarResultado(resultado);
            return resultado;
        } else {
            System.out.println("Error, División por cer0");
            return 0;
        }
    }
 private void almacenarResultado(double resultado) {
        if (indice < resultados.length) {
            resultados[indice++] = resultado;
        }

}
   public void mostrarResultados() {
        System.out.println("Resultados anteriores:");
        for (int i = 0; i < indice; i++) {
            System.out.println("Resultado " + (i + 1) + ": " + resultados[i]);
        }
    }

}