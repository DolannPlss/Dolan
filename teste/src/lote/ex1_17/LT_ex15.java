/*
objetivo:calcular o valor da hipotenusa
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;

public class LT_ex15 
{
    public static void main(String[] args) 
    {
        int A,B;
        double C;
        A=Integer.parseInt(JOptionPane.showInputDialog("insira o valor do primeiro cateto"));
        B=Integer.parseInt(JOptionPane.showInputDialog("insira o valor do segundo cateto"));
        
        C=(A*A)+(B*B);
        C= Math.sqrt(C);
        
        System.out.println("o valor da hipotenusa e de:" +C );
    }
}
