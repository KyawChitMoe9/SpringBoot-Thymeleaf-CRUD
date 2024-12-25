package com.springbootproject_crud_tl.repo;

import com.springbootproject_crud_tl.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepo extends JpaRepository<Product, Integer> {
}
