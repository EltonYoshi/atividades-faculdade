#include <stdio.h>
#include <stdlib.h>

int main()
{
    //definindo variaveis
    int a = 2;

    char b = 'y';

    // versão if e else do a
    if (a == 1){
        printf("\nOpção escolha: 1");
    } else if (a == 2) {
        printf("\nOpção escolha: 2");
    } else if (a == 3){
        printf("\nOpção escolha: 3");
    } else {
        printf("\nOpção invalida");

    }


    // é um if e else só que melhor e menor
    switch(b){
    case 'y':
        printf("\nA letra eh x");
        break;
    default:
        printf("\nOpção invalida");
        break;


    }
    // versão switch case do a
    switch (a){
    case 1:
        printf("\nOpção 1");
        break;
    case 2:
        printf("\nOpção 2");
        break;
    case 3:
        printf("\nOpção 3");
        break;
    default:
        printf("\nOpção invalida");
        break;

    }
}
