/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lote1_3;

import javax.swing.JOptionPane;


public class LT_ex46 
{
    public static void main(String[] args) 
    {
        int vt[] = new int[5];
        int SI=0,MV=0,ACC=0;
        for(int I=0;I<=4;I++)
        {
            vt[I]=Integer.parseInt(JOptionPane.showInputDialog("insira o valor"));
            
            if (vt[I] % 2 != 0)
            {
                SI=SI+vt[I];
            }
            if (vt[I] > 10 && vt[I] < 200)
            {
                MV=MV+vt[I];
                ACC=ACC+1;
            }
        }
        MV=MV/ACC;
        System.out.println("a somas dos imapares e de; "+SI +" a media dos valores entre 10 e 200 e de : " +MV);
    }
}
