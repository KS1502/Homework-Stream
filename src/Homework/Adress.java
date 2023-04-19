package Homework;

public abstract class Adress {
    String street;
    int houseNumber;

    public Adress() {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
