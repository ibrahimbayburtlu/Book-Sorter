import java.util.Comparator;
import java.util.TreeSet;

public class BookCompare {
    public static void main(String[] args) {
        TreeSet<Book> book = new TreeSet<Book>();

        Book book1 = new Book("Gülün Adı",736,"Umberto Eco","1 january 1986");
        Book book2 = new Book("Yüzyıllık yalnızlık",464,"Gabriel Garcia Marquez","2 january 1984");
        Book book3 = new Book("Yaşlı adam ve Deniz",128,"Thierry Murat","1 january 2019");
        Book book4 = new Book("Gazap Üzümleri",540,"John Steinbeck","25 june");
        Book book5 = new Book("Mülksüzler",336,"Ursuna K. Le Guin","6 january");

        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);
        book.add(book5);

        for (Book b :book) {

            System.out.println("Book Name : " + b.getbookName()+
                    "  Page Number : " + b.getBookPageNumber()+
                    "  Author Name : " + b.getBookAuthor()+
                    "  Date : " + b.getBookDate());
            System.out.println("----------------------------------------------------------------------------------------");
        }
        System.out.println("############################################################################################");

        TreeSet<Book> bookPage = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getBookPageNumber() == o2.getBookPageNumber()){
                    return o1.getbookName().compareTo(o2.getbookName());
                }
                return o1.getBookPageNumber() - o2.getBookPageNumber();
            }
        });

        bookPage.add(book1);
        bookPage.add(book2);
        bookPage.add(book3);
        bookPage.add(book4);
        bookPage.add(book5);

        for (Book num:bookPage ) {
            System.out.println("Book Name : " + num.getbookName()+
                    "  Page Number : " + num.getBookPageNumber()+
                    "  Author Name : " + num.getBookAuthor()+
                    "  Date : " + num.getBookDate());
            System.out.println("----------------------------------------------------------------------------------------");

        }
    }
}
