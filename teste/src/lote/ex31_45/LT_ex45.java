/*
objetivo:Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/  
package lote.ex31_45;

/**
 *
 * @author marco
 */
public class LT_ex45 
{
    public static void main(String[] args) 
    {
        double R,X;
        R=0;
        for(double I=1;I<=15;I++)
        {
            if (I % 2 == 0) 
            {
                X=I;
                R=R-(X/(X*X));
                System.out.println(R);
            }
            else
            {
                X=I;
                R=R+(X/(X*X));
                System.out.println(R);
            }
            
        }
    }
}
