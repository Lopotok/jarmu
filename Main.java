public class Main {

    public static void main(String[] args) {

        Audis8 audis8 = new Audis8(100,"ABC123",false);

        Robogo robogo = new Robogo("CDA123",90,120);

        System.out.println(robogo.haladhatItt(110));

        System.out.println(audis8.gyorshajtottE(90));

    }
}
