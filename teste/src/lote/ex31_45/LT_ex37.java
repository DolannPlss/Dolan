/*
objetivo:Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu
N’nésimo termo.
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex31_45;

import javax.swing.JOptionPane;


public class LT_ex37 
{
    public static void main(String[] args) 
    {
        int X,R,Z,A;
        
        X=Integer.parseInt(JOptionPane.showInputDialog("insira ate qual N termo da sequencia"));
        
        Z=0;
        A=1;
        
        if (X>=1)
        {
            System.out.println(Z);
            if (X>=2)
            {
                System.out.println(A);
                if(X>=3)
                {
                    for(int I=3;I<=X;I++)
                    {
                        
                        R=Z;
                        Z=Z+A;
                        if (I!=3)
                        {
                        A=R;
                        }
                        System.out.println(+Z);
                        
                    }
                }
            }
        }
    } 
}
