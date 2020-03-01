/*
objetivo:Mostre todas as possibilidades de 2 dados de forma que a soma tenha como
resultado 7.
existentes entre eles.
programador:Marcos Thadeu Oliveira da Silva
Data:06/02/20
*/  
package lote.ex31_45;


public class LT_ex41 
{
    public static void main(String[] args) 
    {
        int D1,D2;
        
        for(D1=1;D1<=6;D1++)
        {
            for(D2=1;D2<=6;D2++)
            {
                if (D1 + D2 ==  7)
                {
                    System.out.println("dado 1 "+D1+" dado 2 "+D2);
                }
            }
        }
    }
}
