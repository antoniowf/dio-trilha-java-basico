import java.util.Locale;
import java.util.Scanner;

public class AboutMe (
    public static void main (String[] args){
        Scanner scan = new Scan (System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        Int idade = scanner.nextnt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //dados para usuário

        System.out.println("Olá meu nome é "+ nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é de " + altura + "cm");
    }
)