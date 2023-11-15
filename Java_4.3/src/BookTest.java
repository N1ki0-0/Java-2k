public class BookTest
{
    public static void main(String[] args)
    {
        Book book = new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", 1997);
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year: " + book.getYear());

        book.setYear(2000);
        System.out.println("Updated Year: " + book.getYear());
    }
}
