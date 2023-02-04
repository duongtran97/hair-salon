package com.duongtv.hair.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.duongtv.hair.entities.City;

public interface CityRepository extends CrudRepository<City,Long>{
    List<City> findByNameVn(String name_vn);
    City findByCode(int code);
}
