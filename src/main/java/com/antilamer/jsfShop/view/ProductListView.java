package com.antilamer.jsfShop.view;

import com.antilamer.jsfShop.entity.ProductEntity;
import com.antilamer.jsfShop.service.ProductService;
import org.ocpsoft.rewrite.annotation.Join;

import java.io.Serializable;
import java.util.List;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
@Join(path = "/", to = "/view/product-list.jsf")
public class ProductListView implements Serializable {
    private List<ProductEntity> products;

    @ManagedProperty("#{productService}")
    private ProductService productService;

    public List<ProductEntity> getProducts() {
        return productService.getProducts();
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public Integer getProductNumber() {
        Random rand = new Random();
        return rand.nextInt(4) + 1;
    }
}
