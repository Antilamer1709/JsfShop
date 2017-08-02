package com.antilamer.jsfShop.repo;

import com.antilamer.jsfShop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
