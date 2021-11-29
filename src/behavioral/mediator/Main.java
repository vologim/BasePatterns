package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        User ivan = new User("Ivan");
        User ira = new User("Ira");
        User petya = new User("Petya");

        ivan.sendMessage("Hello!");
        ira.sendMessage("Hello, Ivan!");
        petya.sendMessage("Hi");

    }
}
