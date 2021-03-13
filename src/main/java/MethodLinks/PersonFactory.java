package MethodLinks;

public interface PersonFactory <P extends Person> {

    P create(String name, int age);

}
