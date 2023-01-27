package com.duongtv.hair.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.duongtv.hair.entities.CustomerEntities;

public interface CustomerRepository extends CrudRepository<CustomerEntities,Long>{
    List<CustomerEntities> findByLastName(String lastName);

    CustomerEntities findById(long id);
}
