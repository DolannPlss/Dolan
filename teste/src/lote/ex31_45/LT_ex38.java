/*
objetivo:Receba 100 números inteiros reais. Verifique e mostre o maior e o menor
valor. Obs.: somente valores positivos.
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex31_45;

import javax.swing.JOptionPane;

public class LT_ex38 
{
    public static void main(String[] args) 
    {
        int X,MN,mn;
        MN=0;
        mn=0;
        for(int I=0;I<10;I++)
        {
       
        X=Integer.parseInt(JOptionPane.showInputDialog("insira o valor para comparação"));
        
        
            if (I==0)
            {
                MN=X;
                mn=X;
            }
            else
            {
                if(X > MN)
                {
                    MN=X;
                }
                else
                {
                    if(X < mn)
                    {
                        mn=X;
                    }
                }
            }
        }
        System.out.println("o maior valor e "+MN);
        System.out.println("o menor valor e "+mn);
    }
}
