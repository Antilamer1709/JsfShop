package com.antilamer.jsfShop.repo;

import com.antilamer.jsfShop.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {
}
