/*
objetivo:calcule o valor do 3 angulo
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;

public class LT_ex14 
{
    public static void main(String[] args) 
    {
        int Ang1,Ang2,Ang3;
        
        Ang1=Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro angulo"));
        Ang2=Integer.parseInt(JOptionPane.showInputDialog("insira o segundo angulo"));
        
        Ang3=180-(Ang1+Ang2);
        
        System.out.println("o valor do terceiro angulo e de:" +Ang3);
    }
}
