package com.sample.graphql.dao;

import com.sample.graphql.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao extends CrudRepository<Address, Integer> {
    Address findByCity(String city);
}
