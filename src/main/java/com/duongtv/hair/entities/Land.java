package com.duongtv.hair.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Land {

    public Land() {

    }
    @Id
    private Long autoId;
    private String nameVn;
    private String codeVillage; 
    private String nameEn;
    private String codeLand;
    private Date createdAt;
    private Date updatedAt;
    private String updatedBy;

    public Long getAutoId() {
        return this.autoId;
    }

    public void setAutoId(Long autoId) {
        this.autoId = autoId;
    }

    public String getNameVn() {
        return this.nameVn;
    }

    public void setNameVn(String nameVn) {
        this.nameVn = nameVn;
    }

    public String getCodeVillage() {
        return this.codeVillage;
    }

    public void setCodeVillage(String codeVillage) {
        this.codeVillage = codeVillage;
    }

    public String getNameEn() {
        return this.nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getCodeLand() {
        return this.codeLand;
    }

    public void setCodeLand(String codeLand) {
        this.codeLand = codeLand;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

}
