package Optional;

public class Address {

    String index;
    Street street;

    public Address() {
    }

    public Address(String index, Street street) {
        this.index = index;
        this.street = street;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }
}
