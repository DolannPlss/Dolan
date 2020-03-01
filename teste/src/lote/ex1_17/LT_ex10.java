/*
objetivo:diferença entre os valores recebidos
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;

public class LT_ex10 
{
    public static void main(String[] args) 
    {
        int X,Y,R;
        
        X=Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor"));
        Y=Integer.parseInt(JOptionPane.showInputDialog("insira o segundo valor"));
        
        R=X-Y;
        
        System.out.println("a diferença enre os valores e de:" + R);
    }
}
