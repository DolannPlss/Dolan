/*
objetivo:receber as notas calcular a media e mostrar se esta aprovado, de exame ou retido
programador:Marcos Thadeu Oliveira da Silva
Data:12/02/20
*/
package lote.ex18_30;

import javax.swing.JOptionPane;

public class LT_ex21
{
    public static void main(String[] args) 
    {
        double N1,N2,N3,N4,NM;
        
        N1=Double.parseDouble(JOptionPane.showInputDialog("insira a primeira nota"));
        N2=Double.parseDouble(JOptionPane.showInputDialog("insira a segunda nota"));
        N3=Double.parseDouble(JOptionPane.showInputDialog("insira a terceira nota"));
        N4=Double.parseDouble(JOptionPane.showInputDialog("insira a quarta nota"));
        
        NM=(N1+N2+N3+N4)/4;
        
        if ( NM >= 6 )
        {
            System.out.println("aprovado:" + NM );
        }
        else
        {
            if( NM < 3 )
            {
                System.out.println("retido:" +NM );
            }
            else
            {
                System.out.println("Exame:" +NM );
            }
        }
    }
}
