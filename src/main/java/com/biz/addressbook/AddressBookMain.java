package com.biz.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome in Address book");

        List<PersonContact> personContactList=new ArrayList();

        PersonContact personContact=new PersonContact("Rahul","Sharma","Pune","Pune","Maharashtra",111222,987698754,"Rahul@gmail.com");
        personContactList.add(personContact);
    }
}
