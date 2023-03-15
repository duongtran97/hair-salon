package com.duongtv.hair.repository;

import com.duongtv.hair.entities.CartEntities;
import com.duongtv.hair.entities.ProductEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<CartEntities,Long> {
    List<CartEntities> findAllByUpdatedBy(String updatedBy);
    @Query("select distinct codeOfProduct from CartEntities where updatedBy = :updatedBy")
    List<String> findDistinctCodeOfProductByUpdatedBy(String updatedBy);
    @Query("select autoId, from")
    List<ProductEntities> findAllProductAddedOnCart(String updatedBy);
}
