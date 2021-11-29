package behavioral.mediator;

public class Mediator {
    public static void sendMessage(User user, String message){
        System.out.println(user.getName() + ": " + message);
    }
}
