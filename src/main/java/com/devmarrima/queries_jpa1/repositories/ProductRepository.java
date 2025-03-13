package com.devmarrima.queries_jpa1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devmarrima.queries_jpa1.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT obj FROM Product obj JOIN FETCH obj.categories")
    List<Product> employeeWithCategory();

}
