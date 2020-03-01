/*
objetivo:coletar o valor de um quadrado e calcular sua area e mostrar o resultado
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;


public class LT_ex00 {
    public static void main(String[] args) {
        
        int A,B,C;
        //adiciona valroes a A e B
        A= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor em A:"));
        B= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor em B:"));
        
        C= A + B;//soma A e B
               
        System.out.println("A soma dos DOIS valores digitados : " + C); //mostra o valor da soma
    }
}