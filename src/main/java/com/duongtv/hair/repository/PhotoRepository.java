package com.duongtv.hair.repository;

import com.duongtv.hair.entities.PhotoEntities;
import org.springframework.data.repository.CrudRepository;

public interface PhotoRepository extends CrudRepository<PhotoEntities,Long> {
}
