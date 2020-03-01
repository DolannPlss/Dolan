package lote.P_ex18_30;

import javax.swing.JOptionPane;

public class P_ex22 
{
	static int X,Y;
		public static void main(String[] args) 
		{
			X=Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor"));
			Y=Integer.parseInt(JOptionPane.showInputDialog("insira o segundo valor"));
			Pcomp();
		}
		static void Pcomp ( ) 
		{
			if(X > Y) 
			{
				System.out.println(Y+", " + X);
			}
			else 
			{
				System.out.println(X+", "+ Y);
			}
		}
}
