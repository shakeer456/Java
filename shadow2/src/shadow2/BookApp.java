package shadow2;
import java.util.Scanner;
public class BookApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter book ID:");
        int id = scan.nextInt();
        System.out.println("Enter book title:");
        scan.nextLine();
        String title = scan.nextLine();
        System.out.println("Enter book author:");
        String author = scan.nextLine();
        System.out.println("Enter book genre:");
        String genre = scan.nextLine();
        System.out.println("Enter publication year:");
        int publicationYear = scan.nextInt();
        System.out.println("Enter publisher:");
        scan.nextLine();
        String publisher = scan.nextLine();
        System.out.println("Enter page count:");
        int pageCount = scan.nextInt();
        System.out.println("Enter book price:");
        double price = scan.nextDouble();
        System.out.println("Is the book hardcover? (true/false):");
        boolean isHardcover = scan.nextBoolean();
        System.out.println("Is the book available? (true/false):");
        boolean isAvailable = scan.nextBoolean();
        Book b = new Book(id, title, author, genre, publicationYear, publisher, pageCount, price, isHardcover, isAvailable);
        System.out.println(b.id+" "+b.title+" "+b.author+" "+b.genre+" "+b.publicationYear+" "+publisher+" "+pageCount+" "+price+" "+isHardcover+" "+isAvailable);
       
        b.readBook();
        b.returnBook();
    }
}
        
