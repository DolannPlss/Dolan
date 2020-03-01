/*
objetivo:Calcule e mostre quantos anos serão necessários para que Ana seja maior que
Maria
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/  
package lote.ex31_45;


public class LT_ex43 
{
    public static void main(String[] args) 
    {
        double A,M,AN;
        A=1.10;
        M=1.50;
        AN=0;
        for(int I=1;I<100;I++)
        {
            A=A+0.03;
            M=M+0.02;
            AN=AN+1;
            if ( A > M ) 
            {
               I=100; 
            }
        }
        System.out.println(AN);
    }
}
