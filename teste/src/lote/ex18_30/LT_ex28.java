/*
objetivo:Receba o preço atual e a média mensal de um produto. Calcule e mostre o
novo preço segundo as informações mostradas
programador:Marcos Thadeu Oliveira da Silva
Data:12/02/20
*/
package lote.ex18_30;

import javax.swing.JOptionPane;

public class LT_ex28 
{
    public static void main(String[] args) 
    {
        int VM;
        double PP;
        
        PP=Double.parseDouble(JOptionPane.showInputDialog("insira o valor do produto"));
        VM=Integer.parseInt(JOptionPane.showInputDialog("insira a venda mensal do produto"));
        
        if (VM < 500)
        {
            if (PP < 30)
            {
                PP = PP * 1.10;
            }
        }
        else
        {
            if (VM >=500 && VM < 1000)
            {
                if (PP >= 30 && PP < 80)
                {
                    PP = PP * 1.15;
                }
            }
            else
            {
                if (VM >= 1000)
                {
                    if (PP >=80)
                    {
                        PP = PP*0.95;
                    }
                }
            }
        }
        System.out.println("o preço do produto e:"  + PP);
    }
}
