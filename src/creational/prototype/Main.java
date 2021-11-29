package creational.prototype;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main  {
    public static void main(String[] args) {
        Map<String, List<String>> children = new HashMap<>();
        children.put("Katya", List.of("Lego", "Barbi"));
        children.put("Misha", List.of("Car", "Bike"));

        Person person = new Person(1, "Ivan", children);
        System.out.println(person);

        Person copy = person.copy();
        System.out.println(copy);
    }


}
