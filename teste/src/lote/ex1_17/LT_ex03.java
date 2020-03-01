/*
objetivo:calcular a area do triangulo com sua base e altura
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;

public class LT_ex03 
{
    public static void main(String[] args)
    {
        int A,B,H;
        //obtenção dos valores
        B=Integer.parseInt(JOptionPane.showInputDialog("digite o valor da base do triangulo"));
        H=Integer.parseInt(JOptionPane.showInputDialog("digite o valor da altura do triangulo"));
        
        A=(B*H)/2;// calcula d area
        
        System.out.println("o valor da area e de:"+A);//mostra o valor da area 
    }
}
