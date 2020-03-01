/*
objetivo:calcular o comprimento da circuferencia
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;

public class LT_ex11 
{
    public static void main(String[] args) 
    {
        double R,C;
        
        R=Integer.parseInt(JOptionPane.showInputDialog("insira o valor do raio"));
        
        C=2*R*3.14;
        
        System.out.println("o comprimento da circuferencia e de" +C );
    }
}
