package view;

import javax.swing.JOptionPane;
import controller.SomaNaturais;

public class Principal
{

	public static void main(String[] args)
	{
		int n, soma;
		SomaNaturais sn = new SomaNaturais();
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número natural"));
		soma = sn.somaNaturais(n);
		System.out.println(soma);		
	}

}
