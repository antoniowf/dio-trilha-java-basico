public class Operadores {

    public static void main(String[] args) {
        
        String nomeUm = "Antonio";
        String nomeDois = new String("Antonio");    

        System.out.println(nomeUm.equals(nomeDois));
        
        int numero1 = 3;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira");
        }
        else {
            System.out.println("A nossa condição é falsa");
        }

        System.out.println("numero1 é igual a numero2? "+ simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente de numero2? "+ simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior que numero2? "+ simNao);
    }
}