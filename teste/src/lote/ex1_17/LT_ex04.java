/*
objetivo:coletar a temperatura em Celsius e converter para Fahrenheit
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;


public class LT_ex04 
{
    
    public static void main(String[] args) 
    {
        double C,F;
        //insere o valor da temperatura em celsius
        
        C= Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Celsius"));
        
        F=(9*C+160)/5;//conversao para F
        
        System.out.println("o valor em FAhrenheit é:" + F);
    }
}
