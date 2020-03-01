/*
objetivo:receba 2 numeros calcule a soma dos numeros impares entre eles
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex31_45;

import javax.swing.JOptionPane;

public class LT_ex35 
{
    public static void main(String[] args) 
    {
        int R,X1,X2;
        
        X1=Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor"));
        X2=Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor"));
        R=0;
        if ( X1 > X2 )
        {
            for(int I=X2+1;I<X1;I++)
            {
                if (I % 2 != 0)
                {
                    R=R+I;
                }
            }
            System.out.println(R);
        }
        else
        {
            for(int I=X1+1;I<X2;I++)
            {
                if (I % 2 != 0)
                {
                    R=R+I;
                }
            }
            System.out.println(R);
        }
    }
}
