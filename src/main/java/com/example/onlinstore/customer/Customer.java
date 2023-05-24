package com.example.onlinstore.customer;

import com.example.onlinstore.address.Address;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String password;
    private Date DBO;
    private Integer phoneNumber;
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    public Customer() {

    }

    public Customer(String name, String password, Date DBO, Integer phoneNumber, Address address, String email) {
        this.name = name;
        this.password = password;
        this.DBO = DBO;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email=email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDBO() {
        return DBO;
    }

    public void setDBO(Date DBO) {
        this.DBO = DBO;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
