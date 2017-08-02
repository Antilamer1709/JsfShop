package com.antilamer.jsfShop.controller;

import com.antilamer.jsfShop.entity.Product;
import com.antilamer.jsfShop.repo.ProductRepo;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "productController")
@ELBeanName(value = "productController")
@Join(path = "/product", to = "/view/product-form.jsf")
public class ProductController {
    @Autowired
    private ProductRepo productRepo;

    private Product product = new Product();

    public String save() {
        productRepo.save(product);
        product = new Product();
        return "/product-list.xhtml?faces-redirect=true";
    }

    public Product getProduct() {
        return product;
    }
}