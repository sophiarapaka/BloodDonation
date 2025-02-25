package com.example.blooddonation;

public class DonationCenter {
    private String name;
    private String address;
    private String phone;

    // Constructor
    public DonationCenter(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
