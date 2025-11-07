import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Coleta dos dados

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso:");
        double peso = scanner.nextDouble();

        // Calcula IMC

        double imc = peso / (altura * altura);

        // Exibe o resultado

        System.out.println("Olá, " + nome + " " + sobrenome + ". Você tem " + idade + " anos, sua altura é de " + altura + " e seu peso é " + peso);

        // Mostra qual a faixa do IMC o usuário se encontra

        // Faixa abaixo do peso menor que 18.5
        if (imc < 18.5) {
            System.out.println("Seu IMC é " + imc + ",você está abaixo do peso.");   
        }
        
        // Faixa de peso ideal entre 18.5 e 24.9
        else if (imc >= 18.5 && imc < 25) {
            System.out.println("Seu IMC é "+ imc + ", você está dentro do peso ideal.");
        }

        // Faixa de sobrepeso entre 25 e 29.9
        else if (imc >= 25.00 && imc < 29.9) {
            System.out.println("Seu IMC é " + imc + ", você está com sobrepeso.");
        }

        // Faixa de obesidade entre 30 e 39.9
        else if (imc >= 30 && imc < 39.9) {
            System.out.println("Seu IMC é " + imc + ", você está com obesidade.");
        }

        // Faixa de obesidade severa acima de 40
        else if (imc >= 40) {
            System.out.println("Seu IMC é " + imc + ", você está com obesidade severa.");
        }
        scanner.close();
    }
}