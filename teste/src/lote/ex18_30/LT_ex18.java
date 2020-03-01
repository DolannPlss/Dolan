/*
objetivo:calcular a diferença do maior pelo menor valor
programador:Marcos Thadeu Oliveira da Silva
Data:12/02/20
*/
package lote.ex18_30;

import javax.swing.JOptionPane;
/**
 *
 * @author marco
 */
public class LT_ex18 
{
    public static void main(String[] args)
    {
        int X,Y,Z;
        
        X=Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor"));
        Y=Integer.parseInt(JOptionPane.showInputDialog("insira o segundo valor"));
        
        
        if ( X > Y )
        {
            Z=X-Y;
        }
        else
        {
            Z=Y-X;
        }
        System.out.println("o maior valor pelo menor da uma diferença de"+Z);
    }
}
