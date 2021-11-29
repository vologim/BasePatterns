package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Count of Monte Cristo", "Alexandre Dumas");
        Book book2 = new Book("Harry Potter", "Joanne Rowling");
        Book book3 = new Book("The Martian", "Andy Weir");

        Reader reader1 = new Reader("Ivan");
        Reader reader2 = new Reader("Ira");
        Reader reader3 = new Reader("Galya");

        library.addObserve(reader1);
        library.addObserve(reader2);
        library.addObserve(reader3);

        library.addBook(book1);
        System.out.println("==============================================================");
        library.addBook(book2);
        System.out.println("==============================================================");
        library.addBook(book3);

    }
}
