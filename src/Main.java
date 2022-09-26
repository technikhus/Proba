public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Mam book: " + Book.licznikObiektow);

        Book book1 = new Book("Metro", 20, 400);
        System.out.println(book1);
        System.out.println("Mam book: " + Book.licznikObiektow);
        Book boo2 = new Book("Wid;xdfiv", 30, 250);
        System.out.println("Mam book: " + Book.licznikObiektow);

        EBook ebook1 = new EBook("Polly Anna", 25,TypyEBook.pdf);
        System.out.println(ebook1);
        System.out.println("Mam ebooki " + EBook.licznikObiektow);
    }
}