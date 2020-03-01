/*
objetivo:achar os dois X possiveis
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;

public class LT_ex06 
{
    public static void main(String[] args) 
    {
        int X,Y,Z;
    
        X=Integer.parseInt(JOptionPane.showInputDialog("digite um valor para X"));
        Y=Integer.parseInt(JOptionPane.showInputDialog("digite um valor para Y"));
        
        Z=X;
        X=Y;
        Y=Z;
        
        System.out.println("o valor de X e:" + X);
        System.out.println("o valor de Y e:" + Y);
    }
}
