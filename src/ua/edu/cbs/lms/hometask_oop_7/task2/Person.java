package ua.edu.cbs.lms.hometask_oop_7.task2;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;

    public Person(String firstName, String lastName, String middleName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName.substring(0,1).toUpperCase() + middleName.substring(1).toLowerCase();
    }

    @Override
    public String toString() {
        return String.format("%1$s %2$s. %3$s.",lastName, firstName.charAt(0), middleName.charAt(0));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(middleName, person.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName);
    }
}
