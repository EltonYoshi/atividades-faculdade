#include <stdio.h>
#include <stdlib.h>

void main()
{
    //definindo variáveis
    int a = 18;
    //conectivo lógico E (AND), Se uma comparação for falsa, não entra  no bloco
    if( a > 5 && a < 15){
        printf("\nA variavel 'a' esta entre 5 e 15");
    }

     //conectivo lógico OU (OR), Se uma comparação for verdadeira, entra  no bloco
    if( a > 5 && a > 15){
        printf("\nA variavel 'a' eh maior 5 e 15");
    }

    //misturando conectivos lógicos
    if( a > 5 && a < 15 || a == 20){
        printf("\nA variavel 'a' esta entre 5 e 15 ou eh igual a 20");
    }
    return 0;
}
