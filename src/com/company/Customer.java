package com.company;

import java.util.List;
import java.util.UUID;

public class Customer {


    private UUID id;
    private String userName;
    private String email;
    private List<Address> address;

    public Customer(UUID id, String username, String email) {
        this.id = id;
        this.userName = username;
        this.email = email;
    }

    public Customer(UUID id, String username, String email, List<Address> address) {
        this.id = id;
        this.userName = username;
        this.email = email;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public List<Address> getAddress() {
        return address;
    }

    public String getUserName() {
        return userName;
    }
}
