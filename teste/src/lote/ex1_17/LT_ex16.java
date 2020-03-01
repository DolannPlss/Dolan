/*
objetivo:calculo do salario
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;

public class LT_ex16 
{
    public static void main(String[] args) 
    {
        double vh,sal,pd;
        int hrtb,nd;
        
        vh=Integer.parseInt(JOptionPane.showInputDialog("insira o valor hora"));
        hrtb=Integer.parseInt(JOptionPane.showInputDialog("insira as horas trabalhadas"));
        pd=Integer.parseInt(JOptionPane.showInputDialog("insira o percentual de desconto"));
        nd=Integer.parseInt(JOptionPane.showInputDialog("insira o numero de dependentes"));
        
        sal=vh*hrtb;
        pd=pd/100;
        sal=sal-(sal*pd);
        sal=sal+(100*nd);
        
        System.out.println("o salario e d:" + sal);
    }
}
