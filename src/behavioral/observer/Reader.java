package behavioral.observer;

import java.util.List;

public class Reader implements Observer<Book>{

    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void event(List<Book> strings) {
        System.out.println(name + " we add new book:");
        System.out.println("Our library have:");
        strings.forEach(System.out::println);
    }
}
