/*
objetivo:receba um valor e verifique se ele e divisivel por 2 e/ou por 3
programador:Marcos Thadeu Oliveira da Silva
Data:12/02/20
*/
package lote.ex18_30;

import javax.swing.JOptionPane;

public class LT_ex24 
{
    public static void main(String[] args) 
    {
        int N,R1,R2;
        
        
        N=Integer.parseInt(JOptionPane.showInputDialog("insira o valor a ser verificado"));
        R1= N % 2;
        R2= N % 3;
        
        if (R2 < 1 && R1 < 1)
        {
            System.out.println("divisivel por 2 e por 3");
        }
        else
        {
            if (R1 < 1)
            {
                System.out.println("divisivel por 2");
            } 
            else
            {
                if(R2 <1)
                {
                    System.out.println("divisivel por 3");
                }
                else
                {
                    System.out.println("nao e divisivel por nenhum");
                }
            }
        }
    }
}
