/*
objetivo:receba 3 valores em ordem crescente e um quarto nao necessariamente na ordem mostre os 4 em ordem
programador:Marcos Thadeu Oliveira da Silva
Data:12/02/20
*/
package lote.ex18_30;

import javax.swing.JOptionPane;

public class LT_ex23 
{
    public static void main(String[] args) 
    {
        int N1,N2,N3,NX;
        N1=Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor da ordem"));
        N2=Integer.parseInt(JOptionPane.showInputDialog("insira o segundo valor da ordem"));
        N3=Integer.parseInt(JOptionPane.showInputDialog("insira o terceiro valor da ordem"));
        NX=Integer.parseInt(JOptionPane.showInputDialog("insira o valor nao necessariamente na ordem"));
        
        if(NX<N1)
        {
            System.out.println("a ordem e:"+NX +N1 +N2 +N3 );
        }
        else
        {
            if(NX < N2)
            {
                System.out.println("a ordem e:"+N1 +NX +N2 +N3 );
            }
            else
            {
                if (NX < N3)
                {
                    System.out.println("a ordem e:"+N1 +N2 +NX +N3 );
                }
                else
                {
                     System.out.println("a ordem e:"+N1 +N2 +N3 +NX );
                }
            }
        }
            
    }
}
