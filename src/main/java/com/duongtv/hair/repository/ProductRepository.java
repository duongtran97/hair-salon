package com.duongtv.hair.repository;

import com.duongtv.hair.entities.ProductEntities;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntities,Long> {
}
