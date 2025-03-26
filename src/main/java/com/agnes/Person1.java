package com.agnes;

public class Person1 {

    // create field to initialise person class
   private String customerName;
   private String email;
   private  int phoneNumber;


   //create constructor to initialise person field
    public Person1(String customerName, String email, int phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    // create method to introduce person and print it
    public void Person () {
        System.out.println("Hello, my name is " + customerName + " .my email is  " + email + " and this is my phone number " + phoneNumber);
    }

}
