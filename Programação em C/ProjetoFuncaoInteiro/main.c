#include <stdio.h>
#include <stdlib.h>

// linha 26 retorna o numero dez
int retornaDez();
float retornaNuQuebrados();

int main()
{
    //definindo variáveis
    int a;

    //passando retorno da função para uma variável
    a = retornaDez();

    //imprimindo valor de a
    printf("\n%d", a);

    float b = retornaNuQuebrados();
    printf("\n%f", b);


    return 0;
}

int retornaDez(){
    printf("\n Oi \n");
    int numero = 10;
    return numero;
}

//função que retorna número quebrado
float retornaNuQuebrados(){
    return 5.5;
}
