package com.example.thuchanh2.model;

public class Student {
    private String id;
    private String fullName;
    private String phoneNumber;
    private String address;

    // Constructor
    public Student() {}

    // Getters và Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
