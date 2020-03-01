/*
objetivo:Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo
do menor.
programador:Marcos Thadeu Oliveira da Silva
Data:12/02/20
*/
package lote.ex18_30;

import javax.swing.JOptionPane;

public class LT_ex26 
{
    public static void main(String[] args) 
    {
        int N1,N2,R;
        
        N1=Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor"));
        N2=Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor"));
        
        if (N1 > N2)
        {
            R=N1 % N2;
            if (R > 0)
            {
                System.out.println("o maior não e divisivel pelo menor");
            }
            else
            {
                System.out.println("o maior e divisivel pelo menor");
            }
        }
        else
        {
            R=N2 % N1;
            if (R > 0)
            {
                System.out.println("o menor não e divisivel pelo maior");
            }
            else
            {
                System.out.println("o maior valor e divisivel pelo menor");
            }
        }
    }
}
