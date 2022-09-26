public class Book extends Publikacia{


    public Book(String tutul, int cena, int liczbaStron) {
        super(tutul, cena);
        this.liczbaStron = liczbaStron;
        licznikObiektow++;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tytuł:" + getTutul() +
                "cena:" + getCena() +
                "liczbaStron=" + liczbaStron +
                '}';
    }

    private int liczbaStron;

    public static int licznikObiektow;
}
