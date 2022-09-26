public class EBook extends Publikacia{

    private  TypyEBook type;
    public static int licznikObiektow;

    public TypyEBook getType() {
        return type;
    }

    public void setType(TypyEBook type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "tytuł:  " + getType()+
                "cena:  " + getCena() +
                "type=" + type +
                '}';
    }

    public EBook(String tutul, int cena, TypyEBook type) {
        super(tutul, cena);
        this.type = type;
        licznikObiektow++;
    }

}
