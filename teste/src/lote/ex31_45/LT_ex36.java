/*
objetivo:Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex31_45;

import javax.swing.JOptionPane;

public class LT_ex36 
{
    public static void main(String[] args) 
    {
        double X,R,Z,A;
        A=0;
        
        X=Double.parseDouble(JOptionPane.showInputDialog("insira o valor para calculo da serie"));
        Z=1;
        for(double I=1;I<=X;I++)
        {
            Z=Z*I;
            R=1/Z;
            A=A+R;
            System.out.println(R);//mostra o fatorial do N atual
            System.out.println(A);//mostra a soma dos dos 1/fatoriais
        }
    }   
}