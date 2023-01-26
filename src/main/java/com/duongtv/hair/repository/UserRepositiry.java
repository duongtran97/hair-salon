package com.duongtv.hair.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.duongtv.hair.entities.UserEntities;
public interface UserRepositiry extends CrudRepository<UserEntities,Long>{
    List<UserEntities> findByName(String name);
    UserEntities findById(long id);
}
