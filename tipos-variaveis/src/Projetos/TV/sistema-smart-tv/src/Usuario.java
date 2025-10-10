public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
        smartTv.ligar ();
        System.out.println("Novo status Tv ligada? " + smartTv.ligada);

        //smartTv.desligar();
        //System.out.println("Novo status Tv ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(15); //mudança direta para o canal 15 
        
        smartTv.canalUp(); 
        smartTv.canalUp();
        smartTv.canalUp();
        smartTv.canalUp();
        smartTv.canalUp();
        smartTv.canalUp();
        smartTv.canalDown();
        smartTv.canalDown();
        smartTv.canalDown();
        smartTv.canalDown();
        smartTv.canalDown();
        smartTv.canalDown();

    }
}
