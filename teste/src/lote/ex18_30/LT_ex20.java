/*
objetdescobrir se há uma raiz real e se houver mostrar elas
programador:Marcos Thadeu Oliveira da Silva
Data:12/02/20
*/
package lote.ex18_30;

import javax.swing.JOptionPane;

public class LT_ex20 
{
    public static void main(String[] args) 
    {
        int A,B,C;
        double D,X1,X2;
        
        A=Integer.parseInt(JOptionPane.showInputDialog("insira o valor de A"));
        B=Integer.parseInt(JOptionPane.showInputDialog("insira o valor de B"));
        C=Integer.parseInt(JOptionPane.showInputDialog("insira o valor de C"));
        
        D=(B*B)-4*A*C;
        

        
        if ( D > 0 )
        {
            System.out.println("existem duas raizes reais");
            D=Math.sqrt(D);
            X1=(-D-B)/(2*A);
            X2=(+D-B)/(2*A);
            System.out.println("os valores de X são "+ X1 + X2);
        }    
        else
        {
            if( D < 0 )
            {
                System.out.println("nao existe raiz real");
            }
            else
            {
                System.out.println("existe uma raiz real");
                D=Math.sqrt(D);
                X1=(+D-B)/(2*A);
                System.out.println("os valores de X são"+ X1);
            }
        }
    }
}
