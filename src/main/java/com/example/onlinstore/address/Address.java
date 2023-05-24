package com.example.onlinstore.address;

import com.example.onlinstore.customer.Customer;
import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private Long id;

    private String country;
    private String city;
    private String district;
    private String houseNumber;
    private String street;
    private Integer postcode;



    public Address(String country, String city, String district, String houseNumber, String street, Integer postcode) {
        this.country = country;
        this.city = city;
        this.district = district;
        this.houseNumber = houseNumber;
        this.street = street;
        this.postcode = postcode;
    }

    public Address() {

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    public Long getId() {
        return id;
    }

}
