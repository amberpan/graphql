package com.sample.graphql.query;

import com.sample.graphql.dao.AddressDao;
import com.sample.graphql.model.Address;
import com.sample.graphql.model.Employee;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//The field resolver is any bean in the Spring Context that has the same name as the data bean, with the suffix Resolver
//This implementation is to support fetching address for employee
@Component
public class AddressResolver implements GraphQLResolver<Address> {

    @Autowired
    AddressDao addressDao;

    public Address getAddress(Employee employee) {
        return addressDao.findById(employee.getAddress().getZip()).get();
    }
}
