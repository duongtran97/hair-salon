package com.duongtv.hair.repository;

import com.duongtv.hair.entities.CartEntities;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartRepository extends CrudRepository<CartEntities,Long> {
    List<CartEntities> findAllByUpdatedBy(String updatedBy);
    List<CartEntities> findDistinctCodeOfProductByUpdatedBy(String updatedBy);
    List<CartEntities> findCodeOfProductDistinctByUpdatedBy(String updatedBy);
}
