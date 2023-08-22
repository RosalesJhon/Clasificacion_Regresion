public class ArbolDecisiones {
    public static void main(String[] args) {
        boolean esSunny = true;
        boolean esCool = true;
        boolean esHighHumedad = false;

        if (esSunny) {
            if (esCool) {
                System.out.println("Jugar Tennis");
            } else {
                System.out.println("No jugar Tennis");
            }
        } else {
            if (esHighHumedad) {
                System.out.println("No jugar Tennis");
            } else {
                System.out.println("Jugar Tennis");
            }
        }
    }
}
