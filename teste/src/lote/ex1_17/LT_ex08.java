/*
objetivo:valor do deposito em um mes 
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;

public class LT_ex08 
{
    public static void main(String[] args) 
    {
        double dep;
        
        dep=Integer.parseInt(JOptionPane.showInputDialog("insira o valor do deposito"));
        
        dep=dep+dep*0.013;
        
        System.out.println("o valor do deposito em 1 mes e de" +dep);
    }
}
