package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Library implements Observed<Book>{
    private List<Book> books = new ArrayList<>();
    private List<Observer<Book>> readers = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        notifyObserves();
    }

    public void deleteBook(Book book){
        books.remove(book);
        notifyObserves();
    }

    @Override
    public void addObserve(Observer<Book> observer) {
        readers.add(observer);
    }

    @Override
    public void deleteObserve(Observer<Book> observer) {
        readers.remove(observer);
    }

    @Override
    public void notifyObserves() {
        readers.forEach(elem -> elem.event(books));
    }
}
