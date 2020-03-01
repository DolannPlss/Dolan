/*
objetivo:calcule e mostre a soma dos quadrados dos numeros
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;

public class LT_ex09 
{
    public static void main(String[] args) 
    {
        int X,Y,R;
        
        X=Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor"));
        Y=Integer.parseInt(JOptionPane.showInputDialog("insira o segundo valor"));
        
        R=(X*X)+(Y*Y);
        System.out.println("o valor da soma e de: " + R );
    }
    
}
