#include <stdio.h>
#include <string.h>

void contarLetrasMaiusculas(char strings[][100], int qtdStrings) {
    for (int i = 0; i < qtdStrings; i++) {
        int contador = 0;
        for (int j = 0; j < strlen(strings[i]); j++) {//Aqui, percorre em cada letra da string
            if (strings[i][j] >= 'A' && strings[i][j] <= 'Z') {
                contador++;
            }
        }
        printf("A string %d tem %d letras maiúsculas.\n", i + 1, contador);
    }
}

int main() {
    char strings[100][100]; // Declara um vetor de strings com 100 strings e tamanho máximo de 100 caracteres por string
    int qtdStrings = 0; // Contador para o número de strings digitadas pelo usuário

    while (1) {
        printf("Digite uma string (digite FIM para encerrar): ");
        scanf("%s", strings[qtdStrings]);

        if (strcmp(strings[qtdStrings], "FIM") == 0) {
            break;
        }

        qtdStrings++;
    }

    contarLetrasMaiusculas(strings, qtdStrings);

    return 0;
}
