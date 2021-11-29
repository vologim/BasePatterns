package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RoboFactory {
    private static final Map<String, Robot> robots = new HashMap<>();

    public Robot gotRobot(String specialty){
        Robot robot = robots.get(specialty);

        if(robot == null){
            switch (specialty){
                case "cop":
                    robot = new RoboCop();
                    break;
                case "soldier":
                    robot = new RobotSoldier();
                    break;
                default:
                    System.out.println("Robot not found");
                    break;
            }
            robots.put(specialty, robot);
        }
        return robot;
    }
}
