#include <stdio.h>
#include <stdlib.h>

//typedef: redefinir tipos

int main()
{
    typedef float nota; // 4 bytes
    //declarando variáveis

    nota prova1 = 6.0;
    nota prova2 = 7.0;

    nota soma = prova1 + prova2;

    printf("A soma das notas é %.2f\n", soma);

    return 0;
}
