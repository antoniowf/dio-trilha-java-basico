# dio-trilha-java-basico
Repositório para exemplos do curso de Java Básico pela DIO

## Tipos de dados

No Java, existe malgumas palaras reservadas para a representação dos tipos de dados básicos que precisam ser manipulados para a construção de programas. Estes tipos de dados são conhecidos como tipos primitivos

Os outo tipos primitivos em Java são:

- int - para números inteiros (ex: 1, 2, 3, -10, -20)
- byte - para os números inteiros pequenos (ex: 1, 2, 3, -10, -20)
- short - para números inteiros pequenos (ex: 1, 2, 3, -10, -20)
- long - para números inteiros grandes (ex: 100000L, 200000L, -300000L)
- float - para números de ponto flutuante (ex: 1.5f, 2.5f, -3.5f)
- double - para números de ponto flutuante grandes (ex: 1.5, 2.5, -3.5)
- boolean - para valores lógicos (true ou false)
- char - para caracteres (ex: 'a', 'b', 'c', '1', '2', '3')

Esses tipos não são considerados objetos, e portanto representam os valores brutos. Eles são armazenados diretamente na pilha de memória (Memory Stack).

O ponto mais relevante em copreender a definição dos tipos de dados é o momento da definição do tipo para uma variável. **Qual tipo de dado eu utilizaria para determinar a idade de uma pessou ou o salário de um funcionário?**

## Declaração de variáveis

Variável é uma identificação de um espaço em memoria utilizado pelo nosso programa Seguindo as conveções em lignuagem de programação, toda variável é composta por:

**TIPO DE DADOS + IDENTIFICAÇÃO + VALOR ATRIBUIDO**

A estrutura padrão para se declarar uma variável sempre é:

```
<tipo> <nomeVariavel> <atribuicaoDeValorOpcional>;
```
Exemplos abaixo:

```java
int idade; // Tipo = int, nomeVariavel = idade
int anoDeFabricacao = 2021; // Tipo = int, nomeVariavel = anoDeFabricacao, atribuicaoDeValor = 2021
double salarioMinimo = 2.500; // Tipo = Double, nomeVariavel = salarioMinimo, atribuicaoDeValor = 2.500
```

**Cuidado, Java é fortemente "Tipado"**

Veja o cenário abaixo:

```java
// TiposEVariaveis.java

short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numeroNormal;
```