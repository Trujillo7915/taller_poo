import java.util.Scanner;

public class book1 {

    String title;
    String author;
    int pages;

    void showinfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + pages);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        book1 book = new book1();

        System.out.println("Enter the title of the book: ");
        book.title = sc.nextLine();

        System.out.println("Enter the author of the book: ");
        book.author = sc.nextLine();

        System.out.println("Enter the number of pages of the book: ");
        book.pages = sc.nextInt();

        book.showinfo();
    }
}