public class Book {
    private String name;
    private String author;
    private String year;
    private String ISBN;
    //Book should contain name,author,year of publish and ISBN


    //============================================================
    public Book(String name, String author, String year, String ISBN) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;
    }



    //=========================================================================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    //===========================================================
}
