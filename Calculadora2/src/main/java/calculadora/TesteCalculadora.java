/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Admin
 */
public class TesteCalculadora {
     
    public static void main(String[] args) {
        
        Calculadora c = new Calculadora();
        
        int valorUm = 5;
        int valorDois = 5;
        
        double valorTotal = c.somar(valorUm, valorDois);
        
        if (valorTotal == 10){
            System.out.println("valor correto");
        } else {
            System.out.println("valor errado");
        }
        
     }
    
}
