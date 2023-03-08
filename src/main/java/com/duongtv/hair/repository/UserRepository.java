package com.duongtv.hair.repository;

import org.springframework.data.repository.CrudRepository;

import com.duongtv.hair.entities.UserEntities;

public interface UserRepository extends CrudRepository<UserEntities,Long> {
//     @Query(value="select email,password from user_entities by email = ? ")
     UserEntities findByEmail(String  email) ;
     boolean existsByEmail(String email);
}
