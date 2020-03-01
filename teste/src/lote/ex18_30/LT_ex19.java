/*
objetivo:mostrar o maior dos 2 valores
programador:Marcos Thadeu Oliveira da Silva
Data:12/02/20
*/
package lote.ex18_30;

import javax.swing.JOptionPane;

public class LT_ex19 
{
    public static void main(String[] args)
    {
        int X,Y;
        
        X=Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor"));
        Y=Integer.parseInt(JOptionPane.showInputDialog("insira o segundo valor"));
        
        if (X > Y)
        {
            System.out.println("o maior valor e o primeiro inserido:" + X);
        }
        else
        {
            if (Y > X)
            {
            System.out.println("o maior valor e o segundo inserido:" + Y);
            }
            else
            {
                System.out.println("os dois valores são iguais:" + X);
            }
        }
    }
}
