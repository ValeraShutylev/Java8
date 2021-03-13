package Optional;

public class Employee {

    long id;
    Person person;

    public Employee() {
    }

    public Employee(long id, Person person) {
        this.id = id;
        this.person = person;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
