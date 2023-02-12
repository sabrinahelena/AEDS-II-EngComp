#include <stdio.h>
#include <string.h>

int contarLetrasMaiusculas(char string[], int pos) {
    if (string[pos] == '\0') {
        return 0;
    }

    int contador = 0;
    if (string[pos] >= 'A' && string[pos] <= 'Z') {
        contador = 1;
    }

    return contador + contarLetrasMaiusculas(string, pos + 1);
}

void lerStrings(int qtdStrings) {
    if (qtdStrings == 0) {
        return;
    }

    char string[100];

    printf("Digite uma string (digite FIM para encerrar): ");
    scanf("%s", string);

    if (strcmp(string, "FIM") != 0) {
        int contador = contarLetrasMaiusculas(string, 0);
        printf("A string tem %d letras maiúsculas.\n", contador);
        lerStrings(qtdStrings - 1);
    }
}

int main() {
    lerStrings(100);

    return 0;
}
