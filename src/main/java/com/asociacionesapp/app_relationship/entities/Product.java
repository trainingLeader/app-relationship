package com.asociacionesapp.app_relationship.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private Integer stock;
    private Integer stockmin;
    private Integer stockmax;
    public Product() {
    }
    public Product(String name, double price, int stock, int stockmin, int stockmax) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.stockmin = stockmin;
        this.stockmax = stockmax;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setStockmax(int stockmax) {
        this.stockmax = stockmax;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Integer getStockmin() {
        return stockmin;
    }
    public void setStockmin(Integer stockmin) {
        this.stockmin = stockmin;
    }
    public Integer getStockmax() {
        return stockmax;
    }
    public void setStockmax(Integer stockmax) {
        this.stockmax = stockmax;
    }
    
    
}
