package lote.P_ex18_30;

import javax.swing.JOptionPane;

public class p_EX24 
{
	static int X;
		public static void main(String[] args) 
		{
			X=Integer.parseInt(JOptionPane.showInputDialog("insira o valor"));
			Pdiv();
		}
	static void Pdiv( ) 
	{
		if (X % 2 == 0 && X % 3 == 0) 
		{
			System.out.println("e divisivel por 2 e por 3");
		}
		else 
		{
			if (X % 2 == 0) 
			{
				System.out.println("e divisivel por 2");
			}
			else 
			{
				if(X % 3 == 0) 
				{
					System.out.println("e divisivel por 3");
				}
			}
		}
	}
}
