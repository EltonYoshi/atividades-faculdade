#include <stdio.h>
#include <stdlib.h>

int verificate();

void main()
{
    //definindo variavel.
    int opcao, valor1, valor2, resultado;

    //menu de escolhas.
    printf("Escolha a opção 1 para somar dois valores.\n");
    printf("Escolha a opção 2 para subtrair dois valores.\n");

    opcao = verificate();

    //recebendo o valor dos números.
    printf("\nPrimeiro número: ");
    scanf("%i", &valor1);
    printf("\nSegundo número: ");
    scanf("%i", &valor2);

    //switch case para somar ou subtrair os números recebidos conforme a escolha.
    switch (opcao){
    case 1:
        resultado = valor1 + valor2;
        printf("A soma de %i e %i é igual a: %i", valor1, valor2, resultado);
        break;
    case 2:
        resultado = valor1 - valor2;
        printf("A subtração de %i e %i é igual a: %i", valor1, valor2, resultado);
        break;
    default:
        printf("valor invalido");
        break;


    }
}
int verificate (){
    int escolha;
    do {

        printf("Sua escolha: ");
        scanf("%i", &escolha);

    }while (escolha < 1 || escolha > 2);
    return escolha;



}
