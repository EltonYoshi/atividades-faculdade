#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

void main()
{
    //para usar acentos
    setlocale(LC_ALL, "");

    //preenche uma matriz 2x2 lendo valores do usuário
    //troque os valores entre a primeira e a segunda linha
    int minhaMatriz[2][2], aux1, aux2, i, j;

    //lendo valores para a matriz
    printf("Digite um valor para [0] [0]: ");
    scanf("%d", &minhaMatriz[0][0]);

    printf("Digite um valor para [0] [1]: ");
    scanf("%d", &minhaMatriz[0][1]);

    printf("Digite um valor para [1] [0]: ");
    scanf("%d", &minhaMatriz[1][0]);

    printf("Digite um valor para [1] [1]: ");
    scanf("%d", &minhaMatriz[1][1]);

    //auxiliares
    aux1 = minhaMatriz[0][0];
    aux2 = minhaMatriz[0][1];

    //invertendo valores usando auxiliares
    minhaMatriz [0][0] = minhaMatriz [1][0];
    minhaMatriz [0][1] = minhaMatriz [1][1];

    minhaMatriz [1][0] = aux1;
    minhaMatriz [1][1] = aux2;


    printf("\n%d %d", minhaMatriz[0][0], minhaMatriz[0][1]);
    printf("\n%d %d", minhaMatriz[1][0], minhaMatriz[1][1]);


    return 0;
}
