/*
objetivo:coletar o salario atual calcular o novo com reajuste de 15% e mostrar o resultado
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex1_17;

import javax.swing.JOptionPane;

public class LT_ex02 
{
    public static void main(String[] args) 
    {
        double sal;
        //insere valor do salario
        sal= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do salario:"));
        
        sal= sal * 1.15; //valor do salario reajustado
               
        System.out.println("o valor do reajuste e de:" + sal); //mostra o valor do salario reajustado
    }
}