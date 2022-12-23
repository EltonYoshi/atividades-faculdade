#include <stdio.h>
#include <stdlib.h>
char retornaLetra();
int main()
{
    //definindo variáveis
    char letra = retornaLetra();

    printf("A letra retornada é: %c\n", letra);



    return 0;
}
char retornaLetra(){
    return 'x';
}
