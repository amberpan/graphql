package com.sample.graphql.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    private Integer zip;
    private String city;
    private String state;
    private String country;

    public Address() {
    }

    public Address(Integer zip, String city, String state, String country) {
        this.zip = zip;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public Integer getZip() {
        return zip;
    }

    public Address setZip(Integer zip) {
        this.zip = zip;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("zip", zip)
                .append("city", city)
                .append("state", state)
                .append("country", country)
                .toString();
    }
}
