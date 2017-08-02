package com.antilamer.jsfShop.controller;

import com.antilamer.jsfShop.entity.Product;
import com.antilamer.jsfShop.repo.ProductRepo;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.List;

@Scope (value = "session")
@Component (value = "productList")
@ELBeanName(value = "productList")
@Join(path = "/", to = "/view/product-list.jsf")
public class ProductListController {
    @Autowired
    private ProductRepo productRepo;

    private List<Product> products;

    @Deferred
    @RequestAction
    @IgnorePostback
    public void loadData() {
        products = productRepo.findAll();
    }

    public List<Product> getProducts() {
        return products;
    }
}