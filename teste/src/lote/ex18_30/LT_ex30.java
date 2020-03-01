/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lote.ex18_30;

import javax.swing.JOptionPane;


public class LT_ex30
{

    
    public static void main(String[] args) 
    {
        int AN,MN,DN,AA,MA,DA,AR,MR,DR;
        
        AN=Integer.parseInt(JOptionPane.showInputDialog("insira o ano de nascimento"));
        MN=Integer.parseInt(JOptionPane.showInputDialog("insira o mes de nascimento"));
        DN=Integer.parseInt(JOptionPane.showInputDialog("insira o dia de nascimento"));
        AA=Integer.parseInt(JOptionPane.showInputDialog("insira o ano de atual"));
        MA=Integer.parseInt(JOptionPane.showInputDialog("insira o mes de atual"));
        DA=Integer.parseInt(JOptionPane.showInputDialog("insira o dia de atual"));
        
        if (DN > DA) 
        {
            if (MN == 2) 
            {
                DR = (DA + 31) - DN;
                if (MN > MA) 
                {
                    MR = ((MA + 11) - MN);
                    AR = (AA - 1) - AN;
                    System.out.println(AR + " anos " + MR + " meses " + DR + " dias");
                }
                else
                {
                    MR = (MA - MN - 1);
                    AR = AA - AN;
                    System.out.println(AR + " anos " + MR + " meses " + DR + " dias");
                }
            }    
            if (MN != 2) 
            {
                if (DA % 2 == 0)    
                {
                    DR = (DA + 30) - DN;
                    if (MN > MA) 
                    {
                        MR = ((MA + 11) - MN);
                        AR = (AA - 1) - AN;
                        System.out.println(AR + " anos " + MR + " meses " + DR + " dias");
                    }
                    else
                    {
                        MR = (MA - MN - 1);
                        AR = AA - AN;
                        System.out.println(AR + " anos " + MR + " meses " + DR + " dias");
                    }
                }
            }    
            if (DA % 2 == 1) 
            {
                DR = (DA + 31) - DN;
                if (MN > MA) 
                {
                    MR = ((MA + 11) - MN);
                    AR = (AA - 1) - AN;
                    System.out.println(AR + " anos " + MR + " meses " + DR + " dias");
                }
                else
                {
                    MR = (MA - MN - 1);
                    AR = AA - AN;
                    System.out.println(AR + " anos " + MR + " meses " + DR + " dias");
                }
            }
        }    
        else
        {
            DR = DA - DN;
            if (MN > MA) 
            {
                MR = ((MA + 12) - MN);
                AR = (AA - 1) - AN;
                System.out.println(AR + " anos " + MR + " meses " + DR + " dias");
            }    
            else
            {
            MR = MA - MN;
            AR = AA - AN;
            System.out.println(AR + " anos " + MR + " meses " + DR + " dias");
            }
        }
    }   
}