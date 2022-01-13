package com.biz.addressbook;

public class PersonContact {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private int phoneNumber;
    private String emailId;

    public PersonContact(String firstName, String lastName, String address, String city, String state, int zip, int phoneNumber, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "PersonContact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
