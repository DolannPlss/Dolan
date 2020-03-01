/*
objetivo::achar os dois X possiveis
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio101
 */
public class LT_ex05 
{
    public static void main(String[] args)
    {
        int A,B,C;
        double X1,X2,D,M,N;
        
        A=Integer.parseInt(JOptionPane.showInputDialog("digite o valor do A"));
        B=Integer.parseInt(JOptionPane.showInputDialog("digite o valor do B"));
        C=Integer.parseInt(JOptionPane.showInputDialog("digite o valor do C"));
        
        
        D=(B*B)-4*A*C;
       
        D=Math.sqrt(D);
        
        X1=(-D-B)/(2*A);
        X2=(+D-B)/(2*A);
        
        System.out.println("o valor da raiz quadrada e" + X1 + X2);
    }
}
