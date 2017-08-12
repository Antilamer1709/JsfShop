package com.antilamer.jsfShop.service;

import com.antilamer.jsfShop.entity.ProductEntity;
import com.antilamer.jsfShop.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "productService")
@ApplicationScoped
@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<ProductEntity> getProducts() {
        return productRepo.findAll();
    }
}
