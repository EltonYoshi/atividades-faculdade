#include <stdio.h>
#include <stdlib.h>

void main()
{
    //variáveis
    char palavra [10];

    //introdução
    printf("Digite uma palavra\n");

    //limpar buffer
    setbuf(stdin, 0);

    //ler a String
    //a variavel, número de caracteres, stdin
    fgets(palavra, 255, stdin);

    //limpa as casa não utilizadas
    // ele lê o array e quando ele chega no final da leitura, ele tira uma casa
    // o \0 é onde ele começa e volta para ele, -1 ele tira o caracter nulo, ou seja, o espaço
    palavra[strlen(palavra)-1] - '\0';

    //imprime na tela
    printf("%s", palavra);


}
