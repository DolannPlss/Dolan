/*
objetivo:Receba o número de voltas, a extensão do circuito (em metros) e o tempo de
duração (minutos). Calcule e mostre a velocidade média em km/h.
do menor.
programador:Marcos Thadeu Oliveira da Silva
Data:12/02/20
*/
package lote.ex18_30;

import javax.swing.JOptionPane;

public class LT_ex27 
{
    public static void main(String[] args) 
    {
       
       double vm,NV,m,min;
       
       NV=Integer.parseInt(JOptionPane.showInputDialog("insira o numero de voltas"));
       m=Integer.parseInt(JOptionPane.showInputDialog("insira a extensão em metros da pista"));
       min=Integer.parseInt(JOptionPane.showInputDialog("insira o tempo de duração em minutos"));
       
       min=min*60;
       vm=(NV*m)/min;
       System.out.println("a velocidade media e de" +vm);
       vm=vm*3.6;
       
        System.out.println("a velocidade media e de" +vm);
    }
}
