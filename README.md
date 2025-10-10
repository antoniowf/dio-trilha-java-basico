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
---
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
---
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
---
## Operadores

- Operadores aritméticos
- Operadores unários
- Operadores relacionais
- Operadores lógicos
- Operador ternário

Simbolos especiais que tem um significado próprio para a linguagem e estão associados a determinados operadores.

| Operador | Comparação |
| -------- | ---------- | 
| ==       | Igual      |
| !=       | Diferente  |
| <        | Menor      |
| >        | Maior      |
| <=       | Menor igual|
| >=       | Maior igual|

---
### Atribuição 

Representado pelo Símbolo de ```=```.

O operador de atribução é utilizado para definir o valor inicial ou sovrescrever o valor de uma variável. Em Java definimos um tipo, nome e opcionalmente atribuímos um valor à vriável através do operador de atribuição. Exemplo:

```java
String nome = "Antonio";
int idade = 27;
double peso = 68.5;
char sexo = 'M';
boolean doadorOrgao = true;
date dataNascimento = new date();
```
---
### Aritméticos

O operador aritmético é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.

Os operadores aritméticos são: ```+```(adição), ```-``(subtração), ```*```(multiplicação) e ```/```(divisão).

```java
//classe Operadores.java
double soma = 10.5 + 15.7;
int subtracao = 100 - 50;
int multiplicacao = 2 * 10;
int divisao = 9 / 3;
int modulo = 18 % 3;
double resultado = (10 * 7) + (20 / 4 - 2);
```
---
**Atenção!!** O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a "concatenação de textos".
---
```java
String nomeCompleto = "LINGUAGEM" + "JAVA";

String A = "Antonio";
String B = "Freitas";

String concatenacao = "?";

concatenacao = 1 + 1 + 1 + "1";
concatenacao = 1 + "1" + 1 + 1;
concatenacao = 1 + "1" + 1 + "1";
concatenacao = "1" + 1 + 1 + 1;
concatenacao = "1" + (1+1+1);
```

### Unários

Esses operadores são aplicados juntamente com um outro operador aritmético. ELes realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

- (+) Operador unário de valor positivo - números são positivos sem esse operador expicitamente;
- (-) Operador unário de valor negativo - nega um número ou expressão aritmética;
- (++) Operador unário de incremento de valor - incrementa o valor em 1 unidade;
- (--) Operador unário de decremento de valor - decrementa o valor em 1 unidade;
- (!) Operador unário lógico de negação - nega o valor de uma expressão booleana;

Exemplo:

```java
//classe Operadores.java
public class operadores {
    public static void main(String[] args) {
        
        boolean iLoveYou = True;

        System.out.println(!iLoveYou);

    }
}
```
---
### Ternário

O operador de condição ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária como se fosse uma condição ```IF``` normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.
O operador ternário é representado pelos simbolos ```?:``` utilizados na seguinte estrutura de sintaxe:

```<Expressão condicional> ? <Caso condição seja true> : <Caso condição seja false>```

Exemplos abaixo

```java
public class Operadores {
    public static void main (String[] args) {
        /*boolean iLoveYou = true;

        System.out.println(!iLoveYou);

        iLoveYou = !iLoveYou;

        System.out.println(iLoveYou);
        */
        int a, b;

        a = 5;
        b = 6;

        String resultado = a==b /*IF é equivalente ao ?*/  ? "Verdadeiro" /*ELSE é equivalente ao :*/ : "Falso";
        /*Somente utilizado em expressões booleanas*/

        System.out.println(resultado);
    }
}
```
---
### Operadores relacionais

Os operadores relacionais avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior ou maior ou igual ao da direita, retornando um valor booleano como resultado.

- ```==``` Quando desejamos verificar se uma variável é **IGUAL A** outra.
- ```!=``` Quando desejamos verificar se uma variável é **DIFERENTE** da outra.
- ```>``` Quando desejamos verificar se uma variável é **MAIOR QUE** a outra.
- ```>=``` Quando desejamos verificar se uma variável é **MAIOR OU IGUAL** a outra.
- ```<``` Quando desejamos verificar se uma variável é **MENOR QUE** outra.
- ```<=``` Quando desejamos verificar se uma variável é **MENOR OU IGUAL** outra.

```java
//Classe operadores.java

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2);

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");
    }
}
```
---
### Lógicos 

Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.

- ```&&``` Operador lógico **"E"**
- ```||``` Operador lógico **"OU"**

```java
//operadores.java
public class Operadores {
    public static void main (Strng[] args){
        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeira");
        }
        System.out.println("Fim");

    }
}
```
---
## Métodos
Todas as ações das aplicações são consideradas métodos.
---

Uma classe é definida por atributos e métodos. Jávimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos por sua vez, correspondem a **funções** ou **sub-rotinas** disponíveis dentro de nossas classes.

### Critério de nomeação de métodos

Esses critérios não são obrigratórios, mas é recomendável que sejam seguidos, pois essas conveções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas conveções, tornamos o código mais legível para nós e também para outras pessoas. Para métodos,os critérios são:

- Deve ser nomeado como verbo
- Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).

Exemplo sugerido:

```java
//metodos.java

public class metodos {
    public static void main (String[] args){
        somar(int n1, int n2) {}

        abrirConexao(){}

        concluirProcessamento(){}

        findById(int id){}

        calcularImprimir(){} // Errado, seguindo as boas praticas um método possui uma unica funcionalidade 

    }
}
```
---
**ATENÇÃO!!** Não existe em **Java** o conceito de **métodos** globais. Todos os **métodos** devem SEMPRE ser definidos dentro de uma classe.
---

### Critério de defiinlção de métodos

Mas, como sabemos a melhor forma de definir os meptodos das nossas classes? Para chegar à essa conclusão, somos auxiliados por uma conveção estrutural para todos os métodos. Essa convenção é determinada pelos aspectos abaixo:

1. **Qual a proposta principal do método?**
    - Você deve se perguntar constantemente até compreender a real finalidade do mesmo.
2. **Qual o tipo de retorno esperado após executar o método?**
    - Você deve analisar se o método será responsável por retornar algum valor ou não.
---
Caso o método não retorne nenhum valor, ele será representado pela palavra-chave void.
---
3. **Quais os parâmetros serão necessários para execução do método?**
    - Os métodos as vezes precisam de argumentos como critérios para a execução.
4. **O método possui o risco de apresentar alguma exceção?**
    - Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.
5. **Qual a visibilidade do método?**
    - Será necessário que o método seja visível a toda aplicação, somente em mesmo pacotes, através de herança ou somente a nível a própria classe.

Abaixo temos um exemplo de uma classe com dois métodos e suas respectivas considerações:

```java
public class MyClass {

    public double somar(int num1, int num2){
        //LOGICA - FINALIDADE DO MÉTODO
        return ... ;
    }

    public void imprimir(String texto){
        //LOGICA - FINALIDADE DO MÉTODO
        //AQUI NÃO PRECISA DO RETURN
        //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
    }
    //throws Exception : indica que o método ao ser 
    //poderá gerar uma exceção
    public double dividir(int dividendo, int divisor) throws Exception{}

    // este método não pode ser visto por outras classes
    private void metodoPrivado(){}

    //alguns equívocos estruturais
    public void validar(){
        //este método deveria retornar algum valor
        //no caso boolean (true ou false)
    }
    public void calcularENviar(){
        //um método deve representar uma única responsabilidade
    }
    public void gravarCliente(String nome, String cpf, int idade){
        //este método tem a finalidade de gravar cliente
        //informações de um cliente, por que não criar
        //um objeto cliente e passar como parâmetro?
        //veja abaixo
    }
    public void gravarCliente(Cliente cliente){}
    //ou
    public void gravar(Cliente cliente){}

}
```
## Exercitando

Vamos criar um exemplo de uma classe para representar um SmartTV onde:

1. Ela tenha as características: ligada(boolean), canal(int) e volume(int)
2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número do canal correspondente

```java
public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Tv ligada? " + smartTv.ligada);
    }
```
---
## Escopo
- Escopo de classe
- Escopo de método
- Escopo de fluxo
---

O escopo pode ser entendido como o ambiente onde variável pode ser acessada. Em Java, o escopo de variáveis **vai de acordo com o bloco onde ela foi delcarada**.
A variável é criada no primeiro acesso à ela, se tornando inacessível após o interpretador sair do bloco de execução ao qual ela pertence. Portando, esta variável não pode ser lida ou manipulada por rotinas e códigos que estão fora do seu bloco declaração, ou seja, fora do escopo da variável.
Em uma classe , podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados no corpo principal da Classe, sendo portanto acessíveis por todos os métodos.
Caso você declare uma variável **DENTRO DE UM MÉTODO**, o escopo dessa variável está limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o método.
Uma parte fundamental na elaboração de algoritmos simples ou complexos é determinar a localização do código em questão. Sem um domínio sobre escopos de códigos seu projeto tende a  conter falhas estruturais e comprometer a proposta principal da aplicação.

```java
    public class Conta {
        //variavel da classe conta
        double saldo=10.0;
    }

    public void sacar(double valor) {
        //variavel local de método
        double novoSaldo = saldo - valor;

    public void imprimirSaldo(){
        //disponível em toda classe
        System.out.println(saldo);
        //somente o método sacar conhece esta variavel
        System.out.println(novoSaldo);
    }
    public double calcularDividaExponencial(){
        //variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for(int x=1; x<=5; x++)
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
}

    return valorMontante;
```
