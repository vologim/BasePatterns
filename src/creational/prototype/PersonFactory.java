package creational.prototype;

public class PersonFactory {
    Person obj;

    public PersonFactory(Person obj) {
        this.obj = obj;
    }

    public void setObj(Person obj) {
        this.obj = obj;
    }

    public Person clonePerson(){
        return obj.copy();
    }
}
