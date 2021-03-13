package MethodLinks;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodsLinks {

    public static void main(String[] args) {

        // Ссылка на статический метод ContainingClass::staticMethodName
        Function<String, Boolean> function = Boolean::valueOf;
        System.out.println(function.apply("TRUE"));


        // Ссылка на нестатический метод конкретного объекта сontainingObject::instanceMethodName
        Person person = new Person("Дима", 51);
        Supplier<String> supplier = person::toString;
        System.out.println(supplier.get());


        // Ссылка на нестатический метод любого объекта конкретного типа ContainingType::methodName
        Function<String, String> newFunction = String::toLowerCase;
        System.out.println(newFunction.apply("НЕ ОРИ НА МЕНЯ КАПСОМ!"));


        // Ссылка на конструктор
        PersonFactory<Person> personFactory = Person::new;
        Person newPerson = personFactory.create("Andrey", 16);

    }

}
