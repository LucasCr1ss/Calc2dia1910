/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Admin
 */
public class Calculadora {
    
    // atributo
    int resultado = 0;
    
    //metodo somar
    public double somar(int n1, int n2) {
        resultado = n1 + n2;
        return resultado;
    }
    
    //metodo subtrair
    public double subtrair(int n1, int n2) {
        resultado = n1 - n2;
        return resultado;
    }
    
    //metodo multiplicar
    public double multiplicar(int n1, int n2) {
        resultado = n1 * n2;
        return resultado;
    }
    
    //metodo dividir
    public double dividir(int n1, int n2) {
        double d1 = Double.valueOf(n1);
        double d2 = Double.valueOf(n2);
    
        double r = d1 / d2;
        return r;
        
    }
}
