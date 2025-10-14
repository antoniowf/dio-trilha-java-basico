/**
 * <h1>Exercício 1 - Conta Banco</h1>
 * 
 * <p>Crie o projeto ContaBanco, que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
 * Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.
 * Atributos:
 * - Número da conta (int) 
 * - Agência (String)
 * - Nome do cliente (String)
 * - Saldo (decimal)
 * 
 * <p>Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
 * Programa: "Por favor, digite o número da Agência !"
 * Usuário: 1021 (depois ENTER para o próximo campo)
 * 
 * <p>Revise sobre concatenação e classe String com método concat
 * 
 * <p>Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
 * "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
 * 
 * @author Antonio W. Freitas
 * @version 1.0
 * @since 2025-13-10
 * @institution Digital Innovation One
 * @category Exercícios de Fixação
 * 
 */


import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) throws Exception {

        //TODO: Conhecer e importar a classe scanner
        //TODO: Exibir as mensagens para o nosso usuário
        //TODO: Obter pela scanner os valores digitados no terminal
        //TODO: Exibir a mensagem da conta criada

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta:");
            int numeroConta = scan.nextInt();

        System.out.println("Digite a agência da conta:");
            String agencia = scan.next();

        System.out.println("Digite o nome do cliente:");
            String nome = scan.next();

        System.out.println("Digite o sobrenome do cliente:");
            String sobrenome = scan.next();

        System.out.println("Digite o saldo inicial");
            double saldoinicial = scan.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo "+ saldoinicial + " já está disponível para saque");

        scan.close();
    }
}

