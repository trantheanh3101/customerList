package com.example.listcustomer;

public class Customer {
    private String name;
    private String dob;
    private String address;
    private String imageUrl;

    public Customer(String name, String dob, String address, String imageUrl) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
