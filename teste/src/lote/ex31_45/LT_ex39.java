/*
objetivo:Calcule a quantidade de grãos contidos em um tabuleiro de xadrez
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/
package lote.ex31_45;


public class LT_ex39 
{
    public static void main(String[] args) 
    {
        double X,A,R;
        X=1;
        R=0;
        for(int I=1;I<=64;I++)
        {
            R=X+R;
            X=X*2;
            System.out.println(R);
        }
    }
}
