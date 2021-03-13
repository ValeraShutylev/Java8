package DefaultMethods;

public interface Animal {

    void move();

    default void sleep() {
        System.out.println("Сплю!");
    }

}
