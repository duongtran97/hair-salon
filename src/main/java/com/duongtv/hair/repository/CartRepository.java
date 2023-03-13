package com.duongtv.hair.repository;

import com.duongtv.hair.entities.CartEntities;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<CartEntities,Long> {
}
