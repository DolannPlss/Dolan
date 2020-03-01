package lote.P_ex18_30;

import javax.swing.JOptionPane;

public class P_ex20 
{
	static int A,B,C,D,X1,X2;
		public static void main(String[] args) 
		{
			A=Integer.parseInt(JOptionPane.showInputDialog("insira o valor de A"));
			B=Integer.parseInt(JOptionPane.showInputDialog("insira o valor de A"));
			C=Integer.parseInt(JOptionPane.showInputDialog("insira o valor de A"));
			Pcalc();
			
		}
		static void Pcalc( ) 
		{
			D=(B*B)-4*A*C;
			
			if ( D > 0 )
	        {
	            System.out.println("existem duas raizes reais");
	            D=(int) Math.sqrt(D);
	            X1=(-D-B)/(2*A);
	            X2=(+D-B)/(2*A);
	            System.out.println("os valores de X são "+ X1 + " e " + X2);
	        }    
	        else
	        {
	            if( D < 0 )
	            {
	                System.out.println("nao existe raiz real");
	            }
	            else
	            {
	                System.out.println("existe uma raiz real");
	                D=(int) Math.sqrt(D);
	                X1=(+D-B)/(2*A);
	                System.out.println("os valores de X e "+ X1);
	            }
	        }
		}
}
