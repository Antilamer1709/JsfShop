package com.antilamer.jsfShop.view;

import com.antilamer.jsfShop.entity.ProductEntity;
import com.antilamer.jsfShop.repo.ProductRepo;
import org.ocpsoft.rewrite.annotation.Join;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
@Component(value = "productView")
@Join(path = "/product", to = "/view/product.jsf")
public class ProductView {

    private Integer id;

    @Autowired
    private ProductRepo productRepo;

    private ProductEntity product;

    public ProductEntity getProduct() {
        product = productRepo.findOne(id);
        return product;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}