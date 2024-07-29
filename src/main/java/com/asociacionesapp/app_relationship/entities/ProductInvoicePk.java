package com.asociacionesapp.app_relationship.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductInvoicePk implements Serializable {

    @Column(name ="id_product")
    private Long idproduct;
    @Column(name = "id_invoice")
    private Long idinvoice;
    public Long getIdproduct() {
        return idproduct;
    }
    public void setIdproduct(Long idproduct) {
        this.idproduct = idproduct;
    }
    public Long getIdinvoice() {
        return idinvoice;
    }
    public void setIdinvoice(Long idinvoice) {
        this.idinvoice = idinvoice;
    }
}
