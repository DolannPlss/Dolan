/*
objetivo:tempo de duração do alimento gastando 50g por dia
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;

public class LT_ex13 
{
    public static void main(String[] args) 
    {
        double Akg,Ag,Dias;
        
        Akg=Integer.parseInt(JOptionPane.showInputDialog("insira o valor em kilos"));
        
        Ag=Akg*1000;
        
        Dias=Ag/50;
        
        System.out.println("a quantidade de dias que tera comida será de:"+Dias);
    }
}
