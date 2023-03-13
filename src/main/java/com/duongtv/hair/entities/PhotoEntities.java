package com.duongtv.hair.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;
@Entity
public class PhotoEntities {
    @Id
    private Long autoId;
    private String path;
    private String weight;
    private String height;
    private String nameReplace;
    private Date createdAt;
    private Date updatedAt;
    private String updatedBy;
    private boolean isDeleted;
    private String groupOfPhoto;

    public Long getAutoId() {
        return autoId;
    }

    public void setAutoId(Long autoId) {
        this.autoId = autoId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getNameReplace() {
        return nameReplace;
    }

    public void setNameReplace(String nameReplace) {
        this.nameReplace = nameReplace;
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

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getGroupOfPhoto() {
        return groupOfPhoto;
    }

    public void setGroupOfPhoto(String group) {
        this.groupOfPhoto = group;
    }
}
