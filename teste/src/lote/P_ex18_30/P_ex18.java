package lote.P_ex18_30;

import javax.swing.JOptionPane;

public class P_ex18 
{
	static int X,Y,Z;
		public static void main(String[] args) 
		{
			
			X=Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor"));
			Y=Integer.parseInt(JOptionPane.showInputDialog("insira o segundo valor"));
			Pcomparacao();
			System.out.println("a diferença entre o maior valor e menor valor e de: "+ Z);
		}

		static void Pcomparacao ( ) 
		{
			if (X > Y) 
			{
				Z=X-Y;
			}
			else 
			{
				Z=Y-X;
			}
		}
}

