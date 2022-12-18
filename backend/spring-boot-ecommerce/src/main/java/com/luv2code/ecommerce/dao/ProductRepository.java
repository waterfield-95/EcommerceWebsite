package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

// accept calls from web browser scripts for this origin
// origin is protocol + hostname + port
// JpaRepository is a JPA extension containing the APIs for basic CRUD operations, pagination and sorting

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Spring Data REST automatically exposes endpoint: url to find by category
    // behind the scene, spring execute an operation similar to SQL query in database
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);

    // add new query method: name LIKE CONCAT('%', :name, '%')
    Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);
}
