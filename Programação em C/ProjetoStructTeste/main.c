#include <stdio.h>
#include <stdlib.h>
#include <string.h>
struct st_contato {
    char nome[100];
    int anoNascimento;
    char telefone[100];
    char email[100];
};

struct st_agenda {
    struct st_contato contatos[100];
}agenda;

void main()
{
    for(int i = 0; i < 1; i++){
        printf("Informe o nome: ");
        fgets(agenda.contatos[i].nome, 100, stdin);
// diferente do replit, o codeblocks precisa analisar e abrir um espaço para as strings, logo, precisa-se criar um fgets para armazenar elas

        printf("Informe o email: ");
        fgets(agenda.contatos[i].email, 100, stdin);

        printf("Informe o telefone: ");
        fgets(agenda.contatos[i].telefone, 100, stdin);

        printf("Informe o ano de nascimento: ");
        scanf("%i", &agenda.contatos[i].anoNascimento);

    }

    printf("=================== Agenda de Contatos ======================\n");

    for(int i = 0; i < 1; i++){
        printf("=================== Contato %d ======================\n", (i+1));
        printf("Nome: %s\n", strtok(agenda.contatos[i].nome, "\n"));
        // esse strtoken não é necessário, ele na verdade serve para dividir uma string em tokens ou substrings
        // strtok é composto pela string que eu quero dividir e o elemento que define a divisão, podendo ser um espaço entre as palavras por exemplo
        printf("Telefone: %s\n", strtok(agenda.contatos[i].telefone, "\n"));
        printf("Email: %s\n", strtok(agenda.contatos[i].email, "\n"));
        printf("Ano de Nascimento: %i\n", agenda.contatos[i].anoNascimento);

    }


}
