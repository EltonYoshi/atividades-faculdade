#include <stdio.h>
#include <stdlib.h>

//Vetor vulgo ARRAY vetorial é só linha
//o HD é uma lugar com uma matriz para armazenar dados
// [] é para criar um espaço de armazenamento
//função principal do programa
void main()
{
    //Imprime na tela;
    int vetor[3], cont;

    //passando valores para os vetores
    vetor [0] = 5;
    vetor [1] = 10;
    vetor [2] = 15;

    for (cont = 0; cont < vetor[3]; cont++){
        vetor [cont] = vetor[cont] + 1;

    }
     printf("\nPosicao 0: %d", vetor[0]);
     printf("\nPosicao 1: %d", vetor[1]);
     printf("\nPosicao 2: %d", vetor[2]);

    return 0;


}
