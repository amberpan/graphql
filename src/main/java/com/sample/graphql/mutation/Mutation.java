package com.sample.graphql.mutation;

import com.sample.graphql.dao.EmployeeDao;
import com.sample.graphql.model.Employee;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {
    private static final Logger LOGGER = LoggerFactory.getLogger(Mutation.class);

    @Autowired
    EmployeeDao employeeDao;

    public Employee addEmployee(Integer id, String firstName, String lastName, String department) {
        LOGGER.info("Adding new employee with ID={}, firstName={}, lastName={}, department={}", id, firstName, lastName, department);
        Employee e = new Employee();
        e.setEmployeeId(id);
        e.setFirstName(firstName);
        e.setLastName(lastName);
        e.setDepartment(department);
        return employeeDao.save(e);
    }
}
