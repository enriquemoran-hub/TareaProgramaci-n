package exercise5;

public class Person {
    private String name;
    private String surname;
    private int isRegistered;


    public int isRegistered() {
        return isRegistered;
    }

    public void setRegistered(int registered) {
        isRegistered = registered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person() {}

    public Person(String name, String surname, int isRegistered) {
        this.name = name;
        this.surname = surname;
        this.isRegistered = isRegistered;
    }
}
