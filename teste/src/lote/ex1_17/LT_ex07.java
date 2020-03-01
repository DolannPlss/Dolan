/*
objetivo:area do paralelepipedo
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;

public class LT_ex07 
{
    public static void main(String[] args) 
    {
        int C,B,L,V;
        
        C=Integer.parseInt(JOptionPane.showInputDialog("digite o valor de comprimento"));
        B=Integer.parseInt(JOptionPane.showInputDialog("digite o valor da base"));
        L=Integer.parseInt(JOptionPane.showInputDialog("digite o valor da largura"));
        
        V=C*B*L;
        
        System.out.println("o volume e de:" + V);
    } 
} 
    