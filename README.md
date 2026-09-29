# Contador Crescente e Decrescente em Java

Programa simples de console em **Java** feito para praticar **laços de repetição (`for`)** e **estruturas condicionais (`if/else`)**.

## Sobre o projeto

O programa conversa com o usuário e faz o seguinte:

1. Pede o **nome** do usuário
2. Pede um **número positivo**
3. Mostra a contagem **crescente** de 0 até o número digitado
4. Mostra a contagem **decrescente** do número digitado até 0
5. Por fim, verifica o tamanho do nome:
   - se tiver **até 6 letras**, mostra o nome uma vez
   - se tiver **mais de 6 letras**, repete o nome numerado (1, 2, 3...) a quantidade de vezes do número digitado

### Exemplo de saída

```
porfavor coloque seu nome Nicolas
insira um numero positivo: 3
CRESENTE 0
CRESENTE 1
CRESENTE 2
CRESENTE 3
DECRESENTE 3
DECRESENTE 2
DECRESENTE 1
DECRESENTE 0
1: Nicolas
2: Nicolas
3: Nicolas
```

## Conceitos praticados

- Leitura de dados com a classe `Scanner`
- Laço `for` crescente (`i++`) e decrescente (`i--`)
- Condicional `if/else`
- Método `length()` de `String`
- Saída formatada com `printf`

## Como executar

É necessário ter o **JDK** instalado.

```bash
cd src
javac MAIN.java
java MAIN
```

Ou abra o projeto no **IntelliJ IDEA** e execute a classe `MAIN`.

## Tecnologias

- Java
- IntelliJ IDEA
