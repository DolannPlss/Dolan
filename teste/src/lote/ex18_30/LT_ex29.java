/*
objetivo:Receba o tipo de investimento e mostre o investimento em 30 dias
programador:Marcos Thadeu Oliveira da Silva
Data:12/02/20
*/
package lote.ex18_30;

import javax.swing.JOptionPane;

public class LT_ex29 
{
    public static void main(String[] args) 
    {
        int T;
        double I;
        
        T=Integer.parseInt(JOptionPane.showInputDialog("insira o tipo de investimento"));
        I=Integer.parseInt(JOptionPane.showInputDialog("insira quanto sera investido"));
        
        if (T == 1)
        {
            I = I * 1.03;
            System.out.println("o tipo de investimento foi o 1 em 30 dias tera um total de:"+I);
        }
        else
        {
            if (T == 2)
            {
                I = I * 1.05;
                System.out.println("o tipo de investimento foi o 1 em 30 dias tera um total de:"+I);
            }
        }
    }
}
