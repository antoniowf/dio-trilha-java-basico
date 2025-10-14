import java.util.Locale;
import java.util.Scanner;

public class VerificadorDeMedia {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua nota em Matemática");
            double notaMatematica = scan.nextDouble();

        System.out.println("Digite sua nota em Português");
            double notaPortugues = scan.nextDouble();

        System.out.println("Digite sua nota em Quimica");
            double notaQuimica = scan.nextDouble();

        double notageral = (notaMatematica + notaPortugues + notaQuimica) / 3;
        double media = 7;
        
        if (media <= notageral) {
            System.out.println("Você foi aprovado, sua média final é de " + notageral);
        } else {
            System.out.println("Você foi reprovado, sua média foi de " + notageral);
        } 
    }
}