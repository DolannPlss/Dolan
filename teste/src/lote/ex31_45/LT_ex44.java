/*
objetivo:Receba o número da base e do expoente. Calcule e mostre o valor da
potência.
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/  
package lote.ex31_45;

import javax.swing.JOptionPane;


public class LT_ex44 
{
    public static void main(String[] args) 
    {
        int B,E,R;
        
        B=Integer.parseInt(JOptionPane.showInputDialog("insira o valor da base"));
        E=Integer.parseInt(JOptionPane.showInputDialog("insira o valor do expoente"));
        R=1;
        for(int I=0;I<E;I++)
        { 
            R=B*R;
        }
        System.out.println(R);
    }
}
