package com.sample.graphql.query;

import com.sample.graphql.dao.EmployeeDao;
import com.sample.graphql.model.Employee;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Query.class);

    @Autowired
    EmployeeDao employeeDao;

    public Employee getEmployee(int id) {
        LOGGER.info("Invoking Employee get for ID: {}", id);
        Optional<Employee> e = employeeDao.findById(id);

        e.ifPresent(x -> LOGGER.info("Found employee={}", x));
        return e.get();
    }

    public List<Employee> getEmployeeByFirstName(String firstName) {
        return employeeDao.findByFirstName(firstName);
    }
}
