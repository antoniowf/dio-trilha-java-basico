public class CaixaEletronico {
    
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;
        
        // Se o valor solicitado for menor que o o saldo
        // o sistema deve imprimir o resultado da subtração
        // do saldo menos o valor solicitado. 
        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
    }
   
    public static void main (String[] args) {
        double saldo = 25.00;
        double valorSolicitado = 30.00;
        //Condicional composta
        if (valorSolicitado < saldo) {
            System.out.println("Retire seu dinheiro do caixa");
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
        System.out.println("Seu saldo atual é " + saldo);
    }
}
    