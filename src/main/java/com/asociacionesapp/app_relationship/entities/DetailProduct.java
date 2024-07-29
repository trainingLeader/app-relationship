package com.asociacionesapp.app_relationship.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "detail_products")
public class DetailProduct {

    @EmbeddedId
    ProductInvoicePk id;

    private Integer quatity;
    private Double price;
    public ProductInvoicePk getId() {
        return id;
    }
    public void setId(ProductInvoicePk id) {
        this.id = id;
    }
    public Integer getQuatity() {
        return quatity;
    }
    public void setQuatity(Integer quatity) {
        this.quatity = quatity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    

}
