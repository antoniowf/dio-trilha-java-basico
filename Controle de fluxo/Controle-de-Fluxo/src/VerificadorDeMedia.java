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
        
        if (notageral >= media) {
            System.out.println("Você foi aprovado, sua média final é de " + notageral);
        } 
        
        else if (notageral < media && notageral >= 5) {
            System.out.println("Você está de recuperação, sua média foi " + notageral);
        }
        
        else {
            System.out.println("Você foi reprovado, sua média foi de " + notageral);
        } 
    }
}
