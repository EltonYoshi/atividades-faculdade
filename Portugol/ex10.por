programa
{
	
	funcao inicio()
	{
		real salario, perAjuste, salarioAjustado

		escreva("Escreva seu salário mensal: ")
		leia(salario)

		escreva("\nEscreva o percentual de ajuste: ")
		leia(perAjuste)

		salarioAjustado = salario + (salario * (perAjuste/100))

		escreva("\nSeu salário com ajuste é igual a: ", salarioAjustado)
		



		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 259; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */