/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04.pkg21.pkg08aula04;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EX042108AULA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Sabendo-se que o valor de cada 1000 litros de água corresponde a 2% do salário mínimo.
        * Faça um algoritmo que receba o valor do salário mínimo e a quantidade de água consumida em uma residência por mês.
        * calcule e mostre:
        * O valor da conta de água.
        * O valor a ser pago com um desconto de 15%*/
        
        double salariominimo, consumo_de_agua, valor_agua,valor_sem_desconto,desconto,valor_com_desconto;
               
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor do salário mínimo: ");
        salariominimo = leitor.nextDouble();
        
        System.out.print("Digite a quantidade de água consumida por mês: ");
        consumo_de_agua = leitor.nextDouble();
        
        valor_agua = ((salariominimo/100)* 2)/1000;
        
        valor_sem_desconto = valor_agua * consumo_de_agua;
        
        System.out.print("O valor da conta de água é: " + valor_sem_desconto);
        
        desconto = (valor_sem_desconto/100) *15;
        valor_com_desconto = valor_sem_desconto - desconto;
        
        System.out.println("\nO valor a ser pago com desconto é: " + valor_com_desconto);
        
        
        
    
    }
}
