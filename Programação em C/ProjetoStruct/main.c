#include <stdio.h>
#include <stdlib.h>
struct palavra {
    int ordem;
    char letra;
    char texto[255];
};
int main()
{
    //criar uma palavra
    struct palavra primeiraPalavra;

    //modificando os campos
    primeiraPalavra.ordem = 20;
    primeiraPalavra.letra = 'p';

    printf("Ordem: %d\n", primeiraPalavra.ordem);


    return 0;
}
