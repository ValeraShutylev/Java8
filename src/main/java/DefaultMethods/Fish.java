package DefaultMethods;

public class Fish implements Animal{

    @Override
    public void move() {
        System.out.println("Я плыву!");
    }

    @Override
    public void sleep() {
        System.out.println("Я Акула - я не сплю!");
    }
}
