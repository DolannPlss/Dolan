/*
objetivo:coletar o valor de um lado do quadrado e calcular sua area e mostrar o resultado
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/

package lote.ex1_17;

import javax.swing.JOptionPane;


public class LT_ex01 
{
    public static void main(String[] args) 
    {
        int L,A;
        //insere valor do lado
        L= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado do quadrado:"));
        
        A= L * L;//valor da Area
               
        System.out.println("o valor da area é: " + A); //mostra o valor da Area
    }
}