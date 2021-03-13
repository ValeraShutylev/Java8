package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConverterImpl {

    public static void main(String[] args) {

        Converter<String, Integer> converter = (from -> Integer.valueOf(from));
        Integer converted = converter.convert("12345");
        System.out.println(converted);


        // Базовые Функциональные интерфейсы

        // Predicate
        Predicate<Integer> isEvenNumber = x-> x % 2 == 0;
        System.out.println(isEvenNumber.test(4));


        // Consumer
        Consumer<String> greeting = x -> System.out.println("Hi, " + x);
        greeting.accept("Helen");


        // Supplier
        ArrayList<String> names = new ArrayList<>();
        names.add("Helen");
        names.add("Maxim");
        names.add("Daniil");
        names.add("Olga");
        names.add("Mary");

        Supplier<String> randomName = () -> {
            int value = (int)(Math.random() * names.size());
            return names.get(value);
        };

        System.out.println(randomName.get());


        // Function
        Function<String, Integer> valueConverter = x -> Integer.valueOf(x);
        System.out.println(valueConverter.apply("55521"));

    }

}
