package lote.P_ex18_30;

import javax.swing.JOptionPane;

public class P_ex23 
{
	static int X,Y,Z,A;
		public static void main(String[] args) 
		{
			X=Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor da sequencia"));
			Y=Integer.parseInt(JOptionPane.showInputDialog("insira o segundo valor da sequencia"));
			Z=Integer.parseInt(JOptionPane.showInputDialog("insira o terceiro valor da sequencia"));
			A=Integer.parseInt(JOptionPane.showInputDialog("insira o valor fora da sequencia"));
			Psequencia();
		}
		static void Psequencia ( ) 
		{
			if (A < X) 
			{
				System.out.println(A+" "+X+" "+Y+" "+Z);
			}
			else 
			{
				if(A < Y) 
				{
					System.out.println(X+" "+A+" "+Y+" "+Z);
				}
				else 
				{
					if(A<Z) 
					{
						System.out.println(X+" "+Y+" "+A+" "+Z);
					}
					else 
					{
						System.out.println(X+" "+Y+" "+Z+" "+A);
					}
				}
			}
		}
}
