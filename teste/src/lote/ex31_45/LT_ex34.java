/*
objetivo:Receba um número. Calcule e mostre os resultados da tabuada desse número.
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex31_45;

import javax.swing.JOptionPane;

public class LT_ex34 
{
    public static void main(String[] args) 
    {
        int X,R;
        
        X=Integer.parseInt(JOptionPane.showInputDialog("insira para calculo da tabela"));
        
        for(int I=0;I<=10;I++)
        {
            R=I*X;
            System.out.println(R);
        }
    }
}
