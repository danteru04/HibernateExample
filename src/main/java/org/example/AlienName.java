package org.example;

import jakarta.persistence.Embeddable;

@Embeddable
public class AlienName {

    private String firstName;
    private String lastName;
    private String middleName;

    public AlienName(){}

    public AlienName(String fn, String ln, String mn){
        this.firstName = fn;
        this.lastName = ln;
        this.middleName = mn;
    }

    @Override
    public String toString() {
        return "AlienName{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
