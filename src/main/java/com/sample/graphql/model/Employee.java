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


    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public Employee setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Employee setDepartment(String department) {
        this.department = department;
        return this;
    }

    public Employee setAddress(Address address) {
        this.address = address;
        return this;
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
