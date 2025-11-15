import java.util.Scanner;

public class ConversorBinarioDecimal {
    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in);
        // numeros binarios até 8 digitos
        double a = 1;
        double b = 2;
        double c = 4;
        double d = 8;
        double e = 16;
        double f = 32;
        double g = 64;
        double h = 128;
        // entrada do numero binario pelo usuário
        System.out.println("Digite o numero binario: ");
        // leitura do binario inserido
        String binario = scanner.nextLine();
        // calculo da conversão | int tamanho = binario.lenght(); ou seja quantidade de digitos insetidos = tamanho
        // binario.lenght() = função que retorna a quantidade de caracteres da string
        int tamanho = binario.length();
        // variavel que armazena o valor decimal, iniciando em 0
        double decimal = 0;
        // laço de repetição
        // for (int i = 0: i < tamanho: i++) 
        // para cada i iniciando em 0, enquanto i for menor que tamanho, incremente i em 1
        // dentro do laço de repetição pegue o valor do caractere na posição tamanho -1 - i (para inverter a ordem dos digitos binarios inseridos)
        // lendo o caractere na posição invertida, verifique se o caractere é igua a '1' 
        // se = a '1' então faça a soma do valor decimar com o valor da posição do digito
        // exemplo se o digito for o primeiro da direita para esquerda (posição 0) some o valor decimal com 1 = decima += a
        // se o digito for o segundo da direita para esquerda (posição 1) some o valor decimal com 2 = decimal += b
        for (int i = 0; i < tamanho; i++) {
            char caractere = binario.charAt(tamanho - 1 - i);
            // verificando se o caractere é igual a '1'
            // caso não seja '1' não faz nada, equivalente a soma ZERO ou desligado
            // caso seja '1' faz a soma do valor decimal com o valor da posição do digito
            // 0 | 0 | 0 | 1 | 1 | 0 | 1 | 0
            // 128 | 64 | 32 | 16 | 8 | 4 | 2 | 1
            //  0 + 0 + 0 + 16 + 8 + 0 + 2 + 0 = 26
            if (caractere == '1') {
                // switch serve para fazer verificações de valores colocados em uma variável
                // no caso a variável é i e representa a posição do digito binario
                // 0 | 0 | 0 | 1 | 1 | 0 | 1 | 0
                // 128 | 64 | 32 | 16 | 8 | 4 | 2 | 1
                // i = 0 + 0 + 0 + 16 + 8 + 0 + 2 + 0 = 26.00
                switch (i) {
                    // verificando o valor de i na casa decimal
                    case 0:
                        // se i = 0 então some o valor decimal com a variável a (1)
                        decimal += a;
                        // finaliza o case
                        break;
                        // se i = 1 então some o valor decimal com a variável b (2)
                        case 1:
                        decimal += b;
                        break;
                        // se i = 2 então some o valor decimal com a variável c (4)
                        case 2:
                        decimal += c;
                        break;
                        // se i = 3 então some o valor decimal com a variável d (8)
                        case 3:
                        decimal += d;
                        break;
                        // se i = 4 então some o valor decimal com a variável e (16)
                        case 4:
                        decimal += e;
                        break;
                        // se i = 5 então some o valor decimal com a variável f (32)
                        case 5:
                        decimal += f;
                        break;
                        // se i = 6 então some o valor decimal com a variável g (64)
                        case 6:
                        decimal += g;
                        break;
                        // se i = 7 então some o valor decimal com a variável h (128)
                        case 7:
                        decimal += h;
                        break;
                        // O default é necessário caso o usuário insira um numero binario qual o código não foi preparado para lidar
                        default:
                        System.out.println("Numero binario muito grande");
                        break;
                }
            }
        }
        // Ao final do laço foi realizada a conversão de binario para decimal
        System.out.println("Decimal: " + decimal);

    }
}