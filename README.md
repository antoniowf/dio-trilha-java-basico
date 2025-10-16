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
---
## Palavras reservadas
- Tipos primitivos
- Classificações
- Escopo de uso
- Palavras "opostas"
---
Palavras reservadas são identificadores de uma linguagem que já possuem uma finalidade específica, portanto não podem ser utilizados para nomear variáveis, classes, métodos ou atributos.

A linguagem Java possui 52 palavras reservadas. Todas essas palavras são classificadas em grupos e escritas com letra minúscula, sendo identificado com uma cor especial pela maioria das IDE's. Abaixo temos a lista de palavras agrupadas por sua finalidade.

### 🔹 Controle de Fluxo
| Palavra    | Descrição                                                               |
| ---------- | ----------------------------------------------------------------------- |
| `if`       | Executa um bloco de código se uma condição for verdadeira.              |
| `else`     | Executa um bloco de código alternativo se a condição do `if` for falsa. |
| `switch`   | Seleciona uma das várias opções com base em um valor.                   |
| `case`     | Define um dos ramos possíveis em um `switch`.                           |
| `default`  | Define o bloco executado se nenhum `case` corresponder.                 |
| `for`      | Cria um loop com contador.                                              |
| `while`    | Cria um loop que executa enquanto uma condição for verdadeira.          |
| `do`       | Executa um bloco antes de testar a condição (`do-while`).               |
| `break`    | Interrompe a execução de um loop ou `switch`.                           |
| `continue` | Interrompe a iteração atual e continua o loop.                          |
| `return`   | Retorna um valor de um método ou encerra sua execução.                  |

### 🔹 Declaração de Tipos e Modificadores
| Palavra        | Descrição                                                            |
| -------------- | -------------------------------------------------------------------- |
| `class`        | Define uma classe.                                                   |
| `interface`    | Define uma interface.                                                |
| `enum`         | Define um conjunto fixo de constantes.                               |
| `extends`      | Indica herança de uma classe.                                        |
| `implements`   | Indica que uma classe implementa uma interface.                      |
| `package`      | Define o pacote ao qual a classe pertence.                           |
| `import`       | Permite usar classes de outros pacotes.                              |
| `public`       | Torna o membro acessível a todas as classes.                         |
| `protected`    | Torna o membro acessível apenas dentro do pacote e subclasses.       |
| `private`      | Restringe o acesso apenas à própria classe.                          |
| `abstract`     | Define uma classe ou método abstrato (que não pode ser instanciado). |
| `final`        | Impede herança, sobrescrita ou modificação de valor.                 |
| `static`       | Indica que o membro pertence à classe, não à instância.              |
| `synchronized` | Controla acesso concorrente a métodos ou blocos.                     |
| `transient`    | Impede que um campo seja serializado.                                |
| `volatile`     | Indica que uma variável pode ser modificada por múltiplas threads.   |
| `native`       | Indica que um método é implementado em código nativo (C/C++).        |
| `strictfp`     | Garante precisão consistente em cálculos de ponto flutuante.         |

### 🔹 Tipos Primitivos
| Palavra   | Descrição                                      |
| --------- | ---------------------------------------------- |
| `byte`    | Tipo numérico inteiro de 8 bits.               |
| `short`   | Tipo numérico inteiro de 16 bits.              |
| `int`     | Tipo numérico inteiro de 32 bits.              |
| `long`    | Tipo numérico inteiro de 64 bits.              |
| `float`   | Tipo numérico de ponto flutuante de 32 bits.   |
| `double`  | Tipo numérico de ponto flutuante de 64 bits.   |
| `char`    | Armazena um único caractere Unicode (16 bits). |
| `boolean` | Armazena valores lógicos: `true` ou `false`.   |
| `void`    | Indica que um método não retorna valor.        |

### 🔹 Tratamento de Exceções
| Palavra   | Descrição                                                   |
| --------- | ----------------------------------------------------------- |
| `try`     | Bloco de código que pode lançar exceções.                   |
| `catch`   | Captura e trata exceções lançadas.                          |
| `finally` | Executa código após o `try`, independentemente de exceções. |
| `throw`   | Lança uma exceção explicitamente.                           |
| `throws`  | Declara que um método pode lançar exceções.                 |

### 🔹 Controle de Objetos e Memória
| Palavra | Descrição                                         |
| ------- | ------------------------------------------------- |
| `new`   | Cria uma nova instância de um objeto.             |
| `this`  | Referência para o objeto atual.                   |
| `super` | Referência para a superclasse imediata.           |
| `null`  | Representa a ausência de valor em uma referência. |

### 🔹 Literais e Valores Especiais
| Palavra | Descrição                  |
| ------- | -------------------------- |
| `true`  | Valor booleano verdadeiro. |
| `false` | Valor booleano falso.      |

### 🔹 Controle de Threads (Concorrência)
| Palavra        | Descrição                                                        |
| -------------- | ---------------------------------------------------------------- |
| `synchronized` | Controla o acesso simultâneo de threads a métodos/blocos.        |
| `volatile`     | Garante visibilidade e consistência de variáveis compartilhadas. |
---
 ## Java Doc

 ## Documentação

 Uma das maiores características da linguagem Java é que desde suas primeiras versões tínhamos em nossas mãos uma documentação rica e detalhada dos recursos da linguagem.

Conforme site oficial, podemos compreender e explorar todos os recursos organizados por pacotes e classes bem específicas sem nem mesmo escrever uma linha de código.

Hoje costuma-se afirmar que para se tornar um dev de nivel avançando é um requisito imprescindível adquirir a habilidade de compreender a documentação oficial da linguagem e dos frameworks que são incorporados nos projetos atuais.

## Tags

Mas e quais as informações que obtemos através de classes documentadas na linguagem? Java Doc é composto por tags que representam dados relevantes para a compreensão da proposta de uma classe e os conjunto de seus métodos e atributos conforme tabela abaixo:

| Tag | Descrição |
|-----| --------- |
| @autor | Autor / criador |
| @version | Versão do recurso disponibilizado |
| @since | Versão / Data de inínio da disponibilização do recurso |
| @param | Descrição dos parâmetros dos métodos criados |
| @return | Definição do tipo de retorno de um método |
| @throws | Se o método lança alguma exceção |

Abaixo iremos ilustrar a classe calculadora com um exemplo de documentação destacando as **tags** mais utilizadas.

```java
/**
 * <h1>Calculadora</h1>
 * A calculadora realiza operações matemáticas entre números inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação destas classes para desfrutar dos recursos oferecidos pelo autor
 * 
 * @author Antonio W. Freitas
 * @version 1.0
 * @since 10/10/2025
 */

public class calculadora {
    /**
     * Este método é utilizado para somar dois numeros inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmentro do método
     * @return int o resultado deste método é a soma dos dois números
     */
    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }
}
```
### Tipos de comentários
- One line
```java
//Olá, eu sou um comentário em uma única linha
```
- Mult line
```java
/*
* Olá eu sou um comentário
* em mais de uma linha,
* me utilize quando precisar
* de um texto mais robusto.
*/
```
- Documentation
```java
/**
 * Estas duas estrelinhas acima
 * servem para você identificar 
 * que pretende elaborar um
 * comentário a nível de
 * documentação.
 */
```
## Javadoc
**Javadoc** é um gerador de documentação criado pela Sun Microsystems para documentar API dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML. É constituido, basicamente, por algumas marcações muitos simples inseridas nos comentários do programa.

Este sistema é o padrão de documentação de classes em Java, e muitas dos IDEs desta linguagem irão automaticamente gerar um Javadoc em HTML.

Criando nossa documentação no formato html para disponibilizar via web.

```bash
javadoc -encoding UTF-8 - docencoding ISO-8859-1 - d ../docs src/*.java
```
---
## Terminal e argumentos
 
Nem sempre executamos nosso programa Java pela IDE. Com a JVM devidamente configurada, podemos criar um executável do nosso programa e disponibilizar o instalador para qualquer sistema operacional.

No nosso caso iremos aprender como executar um programa Java via terminal como MS - DOS ou terminal do VsCode.

Vamos criar uma classe chamada MinhaClasse.java com o código abaixo:

```java
public class MinhaClasse {
    public stativ void main(String[] args){
        System.out.println("Oi, fui executado pelo terminal");
    }
}
```
Observe que nosso projeto Java criado por um IDE, ele terá uma pasta chamada **bin**. É nesta pasta que ficarão os arquivos .class, o nosso `bytecode`.

Mesmo usando uma IDE, nós sempre precisaremos identificar aonde se encontra as classes do nosso projeto: no caso C:\Users\antonio.freitas\Documents\Code\src\dio-trilha-java-basico\Projetos\Terminal e argumentos

### Terminal
Vamos ilistrar como executar uma classe, depois de compilada, sem precisar usar a IDE.

1. Abra o MS-DOS ou Power Shell
2. Localize o diretório do seu projeto: C:\Users\antonio.freitas\Documents\Code\src\dio-trilha-java-basico\Projetos\Terminal e argumentos
3. Acesse a pasta bin através do `cd bin`
4. execute o comando `java Minhaclasse.java` trocando o `.class` por `.java`

### Argumentos

Quando executamos uma classe que contenha o método main, o mesmo permite que passemos um array `[]` de argumentos do tipo `String`. Logo podemos após a definição da classe a ser executada informar estes parâmetros, exemplo:

```bash
java MinhaClase argumentoUm argumentoDois 
```
Exemplo
```java
public class AboutMe {
    public class static void main(String[] args) {
        //os argumentos começam com o indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = integer.valueOf(args [2]);
        double altura = Double.valueOf(args [3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é de " + altura + "cm");
    }
}
```
### Scanner

Nos exemplos anteriores percebemos que podemos receber dados digitados pelo usário do nosso sistema, porém tudo precisa estar em uma linha e também é necessário informar os valores nas posições correspondentes. Esta abordagem pode deixar margens de execução com erro do nosso programa. Para isso, com a finalidade de deixar as nossas entradas de dados mais seguras, agora vamos receber estes dados via **Scanner**.

A classe Scanner permite que o usuário tenha uma interação mais assertiva com o nosso programa, veja como vamos mudar o nosso programa `AboutMe` para deixar mais intuitivo ao usuário.

---
## Estrutura condicional 

### Controle de fluxo

Controle de fluxo é a habilidade de ajustar a maneira como um programa realiza suas tarefas. Por meio de instruções especiais, chamadas de comandos, essas tarefas podem ser executadas seletivamente, repetidamente ou excepcionalmente.

#### Classificação:
- Estruturas condicionais: if-else, switch-case;
Utilizadas para tomar decisões com base em condições específicas como:
    ```java
    if (condicao) {
        // código a ser executado se a condição for verdadeira
    } else {
        // código a ser executado se a condição for falsa
    }
    ```
    e
    ```java
    switch (variavel) {
        case valor1:
            // código a ser executado se variavel == valor1
            break;
        case valor2:
            // código a ser executado se variavel == valor2
            break;
        default:
            // código a ser executado se nenhum dos casos anteriores for verdadeiro
    }
    ```
- Estruturas de repetição: for, while, do-while;
Utilizadas para repetir um bloco de código várias vezes, como:
    ```java
    for (int i = 0; i < 10; i++) {
        // código a ser repetido
    }
    ```
    e
    ```java
    while (condicao) {
        // código a ser repetido enquanto a condição for verdadeira
    }
    ```
    e
    ```java
    do {
        // código a ser repetido
    } while (condicao);
    ```
- Estruturas de exceções: try-catch-finally, throw;
Utilizadas para tratar erros e exceções que podem ocorrer durante a execução do programa, como:
    ```java
    try {
        // código que pode lançar uma exceção
    } catch (TipoDeExcecao e) {
        // código para tratar a exceção
    } finally {
        // código que será executado independentemente de uma exceção ter sido lançada ou não
    }
    ```
    e
    ```java
    throw new TipoDeExcecao("Mensagem de erro");
    ```
A estrutura condicional possibilita a escolha de um grupo de ações e comportamentos a serem executadas quando determinadas condições são ou não satisfeitas. A estrutura condicional pode ser **Simples** ou **Composta**.
### Condicionais Simples
Quando ocorre uma validação de execução de fluxo somente quando a condição for positiva, consideramos como uma estrutura **Simples**.

```java
public class CaixaEletronico
    public static void main(String[] args) {

        double saldo = 25.00;
        double valorSolicitado = 17.0;

    }
```

### Condicionais Compostas
Algumas vezes o nosso programa deverá seguir mais de uma jornada de execução condicionado a uma regra de negócio, este cenário é denominado **Estrutura Condicional Composta**. Veja o exemplo abaixo:

```java
public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.00;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            System.out.println("Retire seu dinheiro na boca do caixa");
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
        System.out.println("Seu saldo atual é de " + saldo);
    }
}
```
### Condicionais encadeadas
Em um controle de fluxo condicional, nem sempre nos limitamos ao **se** `(if)` e **senão** `(else)`, poderemos ter uma terceira, quarta e ou inúmeras condições. Conforme exemplo abaixo:

```java
public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.00;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            System.out.println("Retire seu dinheiro na boca do caixa");
            saldo = saldo - valorSolicitado;
        } else if (valorSolicitado == saldo) {
            System.out.println("Atenção, você está sacando todo o seu saldo");
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
        System.out.println("Seu saldo atual é de " + saldo);
    }
}
```
Não se limitando a somente um `else if`, podemos ter quantos forem necessários para atender a regra de negócio do nosso sistema. Exemplo:

```java 
public class CaixaEletronico {
    public class main(String[] args) {
        double saldo = 25.00;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            System.out.println("Retire seu dinheiro na boca do caixa");
            saldo = saldo - valorSolicitado;
        } else if (valor solicitado == saldo) {
            System.out.println("Atenção, você está sacando todo o seu saldo");
            saldo = saldo - valorSolicitado;
        } else if (valorSolicitado > 1000) {
            System.out.println("Para saques acima de R$ 1000,00 dirija-se ao gerente");
            } else {
                System.out.println("Saldo Insuficiente para saque");
            }
        }
        }
        }
    }
}
        System.out.println("Seu saldo atual é de " + saldo);
    }
}
```
### Condição Ternária
Como vimos em operadores, podemos abreviar nosso algorítmo condicional refatorando com o conceito de operador ternário. Vamos refatorar o exemplo para ilustrar o poder deste recurso:

```java
public class ResultadoEscolar
    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
```
outra situação:

```java
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >7 ? "Aprovado" : nota == 7 ? "Recuperação" : "Reprovado";
        //O primeiro ? é referente ao if e o segundo ? é referente ao else if e o : é referente ao else
        System.out.println(resultado);
    }
}
```
Podemos aplicar o operador ternário em qualquer situação que envolva uma decisão binária, ou seja, **se** ou **senão**. Melhorando a legibilidade do código e diminuindo o número de linhas do nosso programa.
A sua aplicabilidade só deve ser evitada em situações onde o código se torne complexo e de difícil entendimento, por exemplo:

```java
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >7 ? "Aprovado" : nota == 7 ? "Recuperação" : nota < 5 ? "Reprovado" : "Estude mais";
        //O primeiro ? é referente ao if e o segundo ? é referente ao else if e o : é referente ao else
        System.out.println(resultado);
    }
}
```
ficaria mais facil a leitura se fosse escrito como:
```java
    public class ResultadoEscolar {
        public static void main(String[] args) {
            int nota = 7;
            String resultado;
            if (nota > 7) {
                resultado = "Aprovado";
            } else if (nota == 7) {
                resultado = "Recuperação";
            } else if (nota < 5) {
                resultado = "Reprovado";
            } else {
                resultado = "Estude mais";
            }
            System.out.println(resultado);
        }
    }
```
Basta uma comparação simples para perceber que o código ficou mais legível e fácil de entender. Destacando os blocos de decisão `if`, `else if` e `else`.

---
### Switch case

A estrutura Switch compara o valor de cada caso com o a variável sequencialmente, e sempre que encontra um valor correspondente, executa o código associado ao caso. Para evitar que as comparações continuem a ser executadas após um caso correspondente ter sido encontrado, acrescentamos o comando *break* no final de cada bloco de códigos. O comando *break*, quando executado, encerra a execução da estrutura onde ele se encontra.

Vamos imaginar que precisaremos imprimir uma medida com base em  mapa de valores, exemplo:

| sigla | Tamanho |
|-------|---------|
| P     | PEQUENO |
| M     | MEDIO   |
| G     | GRANDE  |

```java
public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "G";

        if(sigla == "P")
                System.out.println("PEQUENO");
        else if(sigla == "M")
                System.out.println("MÉDIO");
        else if(sigla == "G")
                System.out.println("GRANDE");
        else
        System.out.println("INDEFINIDO");
    }
}
```
Refatorando com switch case:
```java
public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "G";

        switch (sigla) { 
        // aqui iniciamos o switch case, passando as variaveis que serão comparadas
            case "P":
            // case é utilizado para definir cada uma das condições que serão comparadas, neste caso a variável sigla
                System.out.println("PEQUENO");
                break;
                //break é utilizado para sair do switch case, o que significa que se o case for verdadeiro, ele não irá verificar os outros cases
            case "M":
                System.out.println("MÉDIO");
                break; 
            case "G":
                System.out.println("GRANDE");
                break;
            default: 
            //default é utilizado quando nenhum dos cases for verdadeiro
                System.out.println("INDEFINIDO");
        }
    }
}
´´´
A nivel de sintaxe, nos pioramos o código. Precisamos avaliar com cuidado quando utilizar o switch case, pois em alguns casos ele pode deixar o código mais complexo e difícil de entender.

Porém um cenário que poderíamos adequar o uso do switch/case para melhorar nosso algorítmo seria conforme ilustração abaixo:

Imagine que fomos requisitados a criar um sistema de plano telefônico onde:

- o sistema terá 03 planos: BASIC, MIDIA e TURBO
- BASIC: 100 minutos de ligação
- MIDIA: 100 minutos de ligação + whatsapp e instagram gratis
- TURBO: 100 minutos de ligação + whatsapp, instagram gratis + 5gb Youtube

```java
// Modo condicional convencional
public class PlanoTelefonico {
    public static void main(String[] args) {
        String plano = "M";

        if(plano == "B")
            System.out.println("100 minutos de ligação");
        else if(plano == "M")
            System.out.println("100 minutos de ligação + whatsapp e instagram gratis");
        else if(plano == "T")
            System.out.println("100 minutos de ligação + whatsapp, instagram gratis + 5gb Youtube");
        else
            System.out.println("Plano inválido");
    }
}
```
```java
// Modo condicional com switch case
public class PlanoTelefonico {
    public static void main(String[] args) {
        String plano = "a";

        switch (plano) {
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            case "M": {
                System.out.println("100 minutos de ligação + whatsapp e instagram gratis");
                break;
            }
            case "T": {
                System.out.println("100 minutos de ligação + whatsapp, instagram gratis + 5gb Youtube");
                break;
            }
            default:
                System.out.println("Plano inválido");
        }
    }
}
``` 
Nessa situação o switch case se mostrou mais adequado, pois o número de condições é maior e o código ficou mais organizado.

Podemos considerar o uso do switch case em situações onde:
- O número de condições é maior que 03
- As condições são baseadas em valores discretos (como inteiros, caracteres ou strings)
- A legibilidade do código é uma prioridade

---

### Estruturas de Repetição

> Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, são comandos que permitem iteração de código, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes.
> Através de laços de repetição é possivel criar programas que percorram `arrays`, analisando individualmente cada elemento, e até mesmo criar trechos de códigos que sejam repetido até que certa condição estabelecida seja cumprida.

Laços ou repetições são representados pelas seguintes estruturas:

- For (para)
- While (enquanto)
- Do While (faça enquanto)

---

### For

O comando `For` (na tradução literal para língua portuguesa "para") permite que uma variável contadora seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando `For` recebe como entrada uma variável contadora, a condição e o valor de incremento.

A estrutura de sintaxe do controle de repetição `For` é exibida abaixo.

```java
// estrutura de controle de fluxo For

public class EstruturaFor {
    public class static void main (String[] args){
        for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
        {
            // comando que será executada até que a
            // expressão de validação torne-se falsa
        }
    }
}
```

Exemplo:

```java
// ExemploFor.java
public class ExemploFor {
    public class stativ void main(String[] args){
        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos++){
            System.out.println("Contando Carneirinhos" + carneirinhos);
        }
    }
}
```

### For em Arrays

Também usamos o controle de fluxo `for` para interagir sobre arrays e coleções:

```java
public class ExemploFor {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" }

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" alunos);
        }
    }
}
```