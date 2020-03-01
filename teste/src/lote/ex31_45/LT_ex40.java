/*
objetivo:Receba 2 números inteiros. Verifique e mostre todos os números primos
existentes entre eles.
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/  
package lote.ex31_45;

import javax.swing.JOptionPane;

public class LT_ex40 
{
    public static void main(String[] args) 
    {
        int X,X1,Y,Y1,C;
        C=0;
        X=Integer.parseInt(JOptionPane.showInputDialog("insira o valor"));
        Y=Integer.parseInt(JOptionPane.showInputDialog("insira o valor"));
        
        if(X>Y)
        {
            X=X-1;
            for(int I=X;I>Y;I--)
            {
                X1=I;
                for(int Z=X1;Z>0;Z--)
                {
                    if ((X1 % Z) == 0)
                    {
                       C=C+1;
                    } 
                }
                
                if(C==2)
                {
                    System.out.println(I);
                }
                C=0;
            }   
        }
        else
        {
            Y=Y-1;
            for(int I=Y;I>X;I--)
            {
                Y1=I;
                for(int Z=Y1;Z>0;Z--)
                {
                    if ((Y1 % Z) == 0)
                    {
                       C=C+1;
                    } 
                }
                
                if(C==2)
                {
                    System.out.println(I);
                }
                C=0;
            }
        }
    }
}
