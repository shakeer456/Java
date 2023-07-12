package shadow2;
class Book {
    int id;
    String title;
    String author;
    String genre;
    int publicationYear;
    String publisher;
    int pageCount;
    double price;
    boolean isHardcover;
    boolean isAvailable;

    public Book(int id, String title, String author, String genre, int publicationYear, String publisher, int pageCount,
                double price, boolean isHardcover, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.pageCount = pageCount;
        this.price = price;
        this.isHardcover = isHardcover;
        this.isAvailable = isAvailable;
    }

    void readBook() {
    	System.out.println("Ramu read"+" "+title+" "+"whose author is"+" "+author+" "+"published by"+" "+publisher);
    }

    void returnBook() {
            System.out.println("Ramu returned"+" "+title+" "+"whose author is"+" "+author+" "+"published by"+" "+publisher);
        }
}
