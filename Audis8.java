public class Audis8 extends Jarmu{

    private boolean lezerblokkolo;

    public Audis8(int aktualisSebessege, String rendszam, boolean lezerblokkolo) {
        super(aktualisSebessege, rendszam);
        this.lezerblokkolo = lezerblokkolo;
    }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) {
        if( this.aktualisSebessege > sebessegkorlat && lezerblokkolo == false ) {
            return true;
        } else if (lezerblokkolo){
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Audis8" +super.toString();
    }
}
