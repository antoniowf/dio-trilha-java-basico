import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta:");
            int numeroConta = scan.nextInt();

        System.out.println("Digite a agência da conta:");
            int agencia = scan.nextInt();

        System.out.println("Digite o nome do cliente:");
            String nome = scan.next();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + " já está disponível para saque");

    }
}
