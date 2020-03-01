package lote.P_ex18_30;

import javax.swing.JOptionPane;

public class P_ex19 
{
	static int X,Y;
		public static void main(String[] args) 
		{
			X=Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor"));
			Y=Integer.parseInt(JOptionPane.showInputDialog("insira o segundo valor"));
			Pcomparacao();
		}
		static void Pcomparacao ( ) 
		{
			if (X > Y) 
			{
				System.out.println("o maior valor e: "+X);
			}
			else 
			{
				System.out.println("o maior valor e: "+Y);
			}
		}
		
}
