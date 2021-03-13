package Optional;

import java.util.Optional;

public class OptionalExamples {

    public static void main(String[] args) {

        Employee employee = new Employee(1, new Person("Иван", new Address("445045", new Street("ул Ленина"))));
        Employee employee2 = new Employee(2, new Person("Сергей", new Address("445043", null)));

        System.out.println(getStreet(employee));
        System.out.println(getStreet(employee2));

    }

    public static String getStreet(Employee employee) {
        //return employee.getPerson().getAddress().getStreet().getStreetName();
        return Optional.ofNullable(employee)
                .map(Employee::getPerson)
                .map(Person::getAddress)
                .map(Address::getStreet)
                .map(Street::getStreetName)
                .orElse("<неизвестно>");
    }

}