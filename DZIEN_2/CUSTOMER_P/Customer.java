package marcin.com;

public class Customer {
    private String fisrtName;
    private String lastName;
    private String city;
    private int birthYear;

    public Customer(String fisrtName, String lastName, String city, int birthYear) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.city = city;
        this.birthYear = birthYear;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
