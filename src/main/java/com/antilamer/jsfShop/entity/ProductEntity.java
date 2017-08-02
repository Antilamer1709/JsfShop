package com.antilamer.jsfShop.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer price;

    public ProductEntity() {
    }

    public ProductEntity(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
}