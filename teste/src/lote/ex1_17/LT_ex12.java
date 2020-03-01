/*
objetivo:calcular a idade atual apartir da idade de nascimento e a idade em 17 anos
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;

public class LT_ex12 
{
    public static void main(String[] args) 
    {
        int AnoA,AnoN,IdaA,IdaF;
        
        AnoA=Integer.parseInt(JOptionPane.showInputDialog("insirir o ano Atual"));
        AnoN=Integer.parseInt(JOptionPane.showInputDialog("insira o ano de nascimento"));
        
        IdaA=AnoA-AnoN;
        
        System.out.println("sua idade atual e de:"+IdaA);
        
        IdaF=IdaA+17;
        
        System.out.println("sua idade em 17 anos será de:"+IdaF);
        
    }
}
