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

## Variaveis e Constantes

Uma **variável** pe uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado define um conjunto de valores e um conjunto de operações. **Java** é uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.

No Java utilizamos identificadores que representam uma referência (ponteiro) a um valor em memória, e esta referência pode ser redirecionada a outro valor, sendo portanto esta a causa do nome "variável", pois o valor é mutavel.

Já as **Constantes** são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados epla palavra reservada``` final ```, seguida de tipo.

Por convenção, **Constantes** são sempre escritas em CAIXA ALTA.

Abaixo temos um exemplo explicativo sobre uso de variáveis e constantes.

```java
public class ExemploVariavel {
    public static void main (String[] args){
        int numero = 5;
        numero = 10;
        System.out.print(numero);
    }
}
```
A saída no console será ```10```

```java
public class ExemploVariavel {
    public static void main (String[] args) {
        final double VALOR_DE_PI = 3.14;
    }
}
```
Nesse caso a variavel ```VALOR_DE_PI``` terá permanentemente o valor de 3.14 armazenado.
