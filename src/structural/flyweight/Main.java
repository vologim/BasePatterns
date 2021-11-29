package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RoboFactory factory = new RoboFactory();
        List<Robot> robots = new ArrayList<>();

        robots.add(factory.gotRobot("cop"));
        robots.add(factory.gotRobot("cop"));
        robots.add(factory.gotRobot("cop"));
        robots.add(factory.gotRobot("cop"));
        robots.add(factory.gotRobot("cop"));
        robots.add(factory.gotRobot("soldier"));
        robots.add(factory.gotRobot("soldier"));
        robots.add(factory.gotRobot("soldier"));
        robots.add(factory.gotRobot("soldier"));
        robots.add(factory.gotRobot("soldier"));

        robots.forEach(Robot::say);
        robots.forEach(System.out::println);

    }
}
