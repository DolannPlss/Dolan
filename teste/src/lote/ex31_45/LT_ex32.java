/*
objetivo:Receba um número inteiro. Calcule e mostre o seu fatorial.
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex31_45;

import javax.swing.JOptionPane;

public class LT_ex32 
{
    public static void main(String[] args) 
    {
        int X,R;
        
        X=Integer.parseInt(JOptionPane.showInputDialog("insira o valor para calculo de fatorial"));
        R=X;
        for(int I=X-1;I>0;I--)
        {
            X=X*I;
            
        }
        
        System.out.println("o fatorial de: "+R+" e igual a: "+X);
    }
}
