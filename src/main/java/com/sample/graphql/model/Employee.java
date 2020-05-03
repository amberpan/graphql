package com.sample.graphql.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "zip")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int id) {
        this.employeeId = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", employeeId)
                .append("firstName", firstName)
                .append("lastName", lastName)
                .append("department", department)
                .append("address", address)
                .toString();
    }
}
