public abstract class Publikacia {

    private String tutul;
    private int cena;


    public Publikacia(String tutul, int cena) {
        this.tutul = tutul;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Publikacia{" +
                "tutul='" + tutul + '\'' +
                ", cena=" + cena +
                '}';
    }

    public String getTutul() {
        return tutul;
    }

    public int getCena() {
        return cena;
    }

    public void setTutul(String tutul) {
        this.tutul = tutul;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
