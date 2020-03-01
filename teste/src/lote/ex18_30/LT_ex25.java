/*
objetivo:calcular o tempo da partida
programador:Marcos Thadeu Oliveira da Silva
Data:12/02/20
*/
package lote.ex18_30;

import javax.swing.JOptionPane;


public class LT_ex25
{
    public static void main(String[] args) 
    {
        int HI,MI,HF,MF,HR,MR;
        
        
        HI=Integer.parseInt(JOptionPane.showInputDialog("insira a hora inicial"));
        MI=Integer.parseInt(JOptionPane.showInputDialog("insira o minuto inicial"));
        HF=Integer.parseInt(JOptionPane.showInputDialog("insira a hoa final"));
        MF=Integer.parseInt(JOptionPane.showInputDialog("insira o minuto final"));
        
        if (HF > HI)
        { 
            if (MF < MI)
            {
                HF = (HF - 1) - HI;
                MF = (60 + MF) - MI;
            }
            else
            {
                HF = HF - HI;
                MF = MF - MI;
            }
            if (HF >= 24)
            {
                System.out.println("tempo de jogo maximo de 24 hrs, insira outro valor");
            }
            else
            {
                System.out.println("tempo de jogo foi de" + HF + "horas" + "e" + MF + "minutos");
            }
        }
        else
        {
            if (MF < MI)
            { 
                HF = (24 - HI) + (HF - 1);
                MF = (60 + MF) - MI;
            }
            else
            {
                HF = (24 - HI) + (HF + 0);
                MF = MF - MI;
            }
            if (HF >= 24)
            {
                System.out.println("tempo de jogo maximo de 24 hrs, insira outro valor");
            }
            else
            {
                System.out.println("tempo de jogo foi de" + HF + "horas" + "e" + MF + "minutos");
            }
        }
    }
}