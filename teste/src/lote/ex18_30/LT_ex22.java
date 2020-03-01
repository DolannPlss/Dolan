/*
objetivo:receba dois valroes diferentes mostre eles em ordem crescente
programador:Marcos Thadeu Oliveira da Silva
Data:12/02/20
*/
package lote.ex18_30;

import javax.swing.JOptionPane;

public class LT_ex22 
{
    public static void main(String[] args) 
    {
        int N1,N2;
        
        N1=Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor"));
        N2=Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor"));
        
        if ( N1 > N2 ) 
        {
            System.out.println("a sequencia e:" + N2 + N1);
        }
        else
        {
            System.out.println("a sequencia e:" + N1 + N2);
        }
    }
}
