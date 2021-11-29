package creational.abstractFactory.details;

public abstract class Body {

    private String body;

    public Body(String body) {
        this.body = body;
    }

    public void info() {
        System.out.println("Body is " + body);
    }
}
