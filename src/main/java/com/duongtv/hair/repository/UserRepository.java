package com.duongtv.hair.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.duongtv.hair.entities.UserEntities;
public interface UserRepository extends CrudRepository<UserEntities,Long> {
     UserEntities findByEmail(String email) ;
}
