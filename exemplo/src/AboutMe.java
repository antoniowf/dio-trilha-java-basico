import java.util.Locale;
import java util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println(Digite seu nome:);
        String nome = scanner.nextLine();

        System.out.println(Digite seu sobrenome:);
        String sobrenome = scanner.nextLine();

        System.out.println(Digite sua idade:);
        int idade = scanner.nextInt();
        
        System.out.println(Digite sua altura:);
        double altura = scanner.nextDouble();
        
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() +
                           ", tenho " + idade + " anos e " minha altura é de " + altura " metros.");
    }
}