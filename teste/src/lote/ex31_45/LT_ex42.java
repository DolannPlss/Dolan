/*
objetivo:Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/  
package lote.ex31_45;


public class LT_ex42 
{
    public static void main(String[] args) 
    {
        double X,Y,R,A;
        A=0;
        X=1;
        Y=1;
        
        for(int I=1;I<50;I++)
        {
            R=X/Y;
            System.out.println(R);//resultado da atual divisao
            A=R+A;
            System.out.println(A);//a soma de todas as divisoes
            X=X+1;
            Y=Y+2;
        }
    }
}
