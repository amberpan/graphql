package com.sample.graphql.dao;

import com.sample.graphql.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    List<Employee> findByFirstName(String firstName);
}
