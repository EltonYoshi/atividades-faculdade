
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool retornaBooleano();

int main()
{
    //variável retorna booleano
    bool variavelBooleana = retornaBooleano();

    //se for verdadeiro ele executa o primeiro bloco
    if(variavelBooleana){
        printf("É verdadeiro\n");

    }// senão, executa o segundo bloco
    else {
        printf("Não é verdadeiro\n");
    }

    return 0;
}
bool retornaBooleano(){
    return true;
}
