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
		 	CONDIÇÃO DE PARADA
		 	O primeiro número natural (0) é a própria soma (0)
		 	
		 	CHAMADA DE PASSOS
		 	A soma dos números naturais até N é igual a N + a soma dos números até o anterior
		 */
		if (n == 0) return 0;
		return n + somaNaturais(n - 1);
	}
}
