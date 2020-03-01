/*
objetivo:calcular o valor em litros gastos
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class LT_ex17 
{
    public static void main(String[] args) 
    {
        
        double tp,L,vm;
        
        tp=Double.parseDouble(JOptionPane.showInputDialog("insira o numero tempo de viagem em horas"));
        vm=Double.parseDouble(JOptionPane.showInputDialog("insira a velociade media"));
        
        L=(tp*(vm*3.6))/12;
        
        
        System.out.println("o valor de litros gastos na viagem foi de"+L);
    }
}
