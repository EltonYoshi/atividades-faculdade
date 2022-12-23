#include <stdio.h>
#include <stdlib.h>

//função principal do programa
void main()
{
    //definindo variáveis
    int a = 0;
    int b = 10;

    //Contador até 10
    while(a <= 10){
        printf("%i\n", a);
        a++; // a = a + 1

    }
    while(b > 10){
        printf("%i\n", b);
        b--; // b = b - 1

    }

    // ele primeiro executa algo pra depois conferir

    do {
        printf("%i\n", a);
        a++;

    }while(a <= 10);


    return 0;
}
