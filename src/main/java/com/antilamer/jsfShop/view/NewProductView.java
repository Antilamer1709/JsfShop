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
@Component(value = "newProductView")
@Join(path = "/newProduct", to = "/view/product-form.jsf")
public class NewProductView {

    @Autowired
    private ProductRepo productRepo;

    private ProductEntity product = new ProductEntity();

    public String save() {
        productRepo.save(product);
        product = new ProductEntity();
        return "/product-list.xhtml?faces-redirect=true";
    }

    public ProductEntity getProduct() {
        return product;
    }
}