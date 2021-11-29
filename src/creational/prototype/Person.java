package creational.prototype;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Person implements Copyable<Person> {
    private int id;
    private String name;
    private Map<String, List<String>> childrenAndToys;

    public Person(int id, String name, Map<String, List<String>> childrenAndToys) {
        this.id = id;
        this.name = name;
        this.childrenAndToys = childrenAndToys;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, List<String>> getChildrenAndToys() {
        return childrenAndToys;
    }

    public void setChildrenAndToys(Map<String, List<String>> childrenAndToys) {
        this.childrenAndToys = childrenAndToys;
    }

    @Override
    public Person copy() {
        Person copy = new Person(id, name, childrenAndToys);
        return copy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(childrenAndToys, person.childrenAndToys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, childrenAndToys);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", children=" + childrenAndToys +
                '}';
    }
}
