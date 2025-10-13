public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        System.out.println("Aumentando o volume para: " + volume);
        volume++;
    }

    public void diminuirVolume(){
        System.out.println("Diminuindo o volume para: " + volume);
        volume--;
    }

    public void mudarCanal(int novoCanal){
        System.out.println("Mudando para canal: " + novoCanal + " channel");
        canal = novoCanal;
    }

    public void canalUp(){
        System.out.println("Mudando para canal: " + (canal+1) + " channel");
        canal++;
    }

    public void canalDown(){
        System.out.println("Mudando para canal: " + (canal-1) + " channel");
        canal--;
    }

}
