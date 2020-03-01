package lote.P_ex18_30;

import javax.swing.JOptionPane;

public class P_ex21 
{
	static double N1,N2,N3,N4,NM;
		public static void main(String[] args) 
		{
		N1=Double.parseDouble(JOptionPane.showInputDialog("insira o valor da nota 1"));
		N2=Double.parseDouble(JOptionPane.showInputDialog("insira o valor da nota 2"));
		N3=Double.parseDouble(JOptionPane.showInputDialog("insira o valor de nota 3"));
		N4=Double.parseDouble(JOptionPane.showInputDialog("insira o valor de nota 4"));
		Pmedia();
		System.out.println("a media e de: " +NM);
		}
		static void Pmedia( ) 
		{
			NM=(N1+N2+N3+N4)/4;
		}
}
