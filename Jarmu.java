public abstract class Jarmu {

    protected int aktualisSebessege;

    private String rendszam;

  public Jarmu(int aktualisSebessege, String rendszam) {
        this.aktualisSebessege = aktualisSebessege;
        this.rendszam = rendszam;
    }

    public boolean gyorshajtottE( int sebessegkorlat){
        if (this.aktualisSebessege>sebessegkorlat){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "rendszam=" + rendszam + '\'' +  aktualisSebessege + "km/h";

    }
}
