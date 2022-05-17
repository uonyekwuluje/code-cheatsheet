package com.inventory.prdt.model;

import javax.persistence.*;

@Entity
@Table(name = "products_table")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="products_name")
    private String productName;
    @Column(name="products_description")
    private String productDescription;
    @Column(name="products_quantity")
    private int productQuantity;

    public ProductModel() {
    }

    public ProductModel(String productName, String productDescription, int productQuantity) {
        this.productName = productName;
        this.productDescription = productDescription;
	this.productQuantity = productQuantity;
    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
