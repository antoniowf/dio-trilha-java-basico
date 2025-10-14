public class PlanoTelefonico {
    public static void main(String[] args) {
        String plano = "a";

        switch (plano) {
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            case "M": {
                System.out.println("100 minutos de ligação + whatsapp e instagram gratis");
                break;
            }
            case "T": {
                System.out.println("100 minutos de ligação + whatsapp, instagram gratis + 5gb Youtube");
                break;
            }
            default:
                System.out.println("Plano inválido");
        }
    }
}