public class Book implements Comparable<Book>{
    private String bookName;
    private int bookPageNumber;
    private String bookAuthor;
    private String bookDate;

    public Book(String bookName,int bookPageNumber,String bookAuthor,String bookDate){
        this.bookName = bookName;
        this.bookPageNumber = bookPageNumber;
        this.bookAuthor = bookAuthor;
        this.bookDate = bookDate;
    }
    @Override
    public int compareTo(Book o){
        return getbookName().compareTo(o.getbookName());
    }
    public String getbookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public int getBookPageNumber(){
        return bookPageNumber;
    }

    public void setBookPageNumber(int bookPageNumber){
        this.bookPageNumber = bookPageNumber;
    }

    public String getBookAuthor(){
        return bookAuthor;
    }
    public void setBookAuthor(String bookName){
        this.bookAuthor = bookAuthor;
    }

    public String getBookDate(){
        return bookDate;
    }
    public void setBookDate(String bookName){
        this.bookDate = bookDate;
    }
}
