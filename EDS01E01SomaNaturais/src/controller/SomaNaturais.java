package controller;

public class SomaNaturais
{
	public SomaNaturais()
	{
		super();
	}
	
	public int somaNaturais(int n)
	{
		/*
		 	CONDI��O DE PARADA
		 	O primeiro n�mero natural (0) � a pr�pria soma (0)
		 	
		 	CHAMADA DE PASSOS
		 	A soma dos n�meros naturais at� N � igual a N + a soma dos n�meros at� o anterior
		 */
		if (n == 0) return 0;
		return n + somaNaturais(n - 1);
	}
}
