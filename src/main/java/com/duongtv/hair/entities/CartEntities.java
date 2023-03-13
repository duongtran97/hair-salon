package com.duongtv.hair.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class CartEntities {
    @Id
    private Long autoId;
    private String codeOfProduct;
    private String methodOfPay;
    private String priceOfProduct;
    private String updatedBy;
    private Date createdAt;
    private Date updatedAt;
    private boolean isDeleted;

    public Long getAutoId() {
        return autoId;
    }

    public void setAutoId(Long autoId) {
        this.autoId = autoId;
    }

    public String getCodeOfProduct() {
        return codeOfProduct;
    }

    public void setCodeOfProduct(String codeOfProduct) {
        this.codeOfProduct = codeOfProduct;
    }

    public String getMethodOfPay() {
        return methodOfPay;
    }

    public void setMethodOfPay(String methodOfPay) {
        this.methodOfPay = methodOfPay;
    }

    public String getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(String priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
