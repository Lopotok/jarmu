import java.util.Objects;

public class Robogo extends Jarmu implements KisGepjarmu {

    private final int maxSebesseg;


    public Robogo(String rendszam, int aktualisSebessege, int maxSebesseg) {
        super(aktualisSebessege, rendszam);
        this.maxSebesseg = maxSebesseg;

    }

    @Override
    public boolean haladhatItt(int sebesseg) {
        if (this.maxSebesseg>sebesseg){
            return false;
        } else {
            return true;
        }

    }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) {
        if (this.aktualisSebessege > sebessegkorlat) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return " Robogó" + super.toString ();

    }
}

