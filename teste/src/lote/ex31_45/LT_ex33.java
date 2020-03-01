/*
objetivo:Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex31_45;

import javax.swing.JOptionPane;

public class LT_ex33 
{
    public static void main(String[] args) 
    {
        double X,R,A;
        
        A=0;
        
        X=Double.parseDouble(JOptionPane.showInputDialog("insira o valor para calculo da serie"));
        
        for(double I=1;I<=X;I++)
        {
            R=1/I;
            A=A+R;
            System.out.println(R);//mostra o 1/N atual
            System.out.println(A);//mostra a soma dos 1/N
        }
    }
}
