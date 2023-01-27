package com.duongtv.hair.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.duongtv.hair.entities.UserEntities;
public interface UserRepositiry extends CrudRepository<UserEntities,Long>{
    List<UserEntities> findByFullname(String fullname);
    UserEntities findById(long id);
}
