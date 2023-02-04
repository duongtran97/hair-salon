package com.duongtv.hair.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class City {

    public City() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long auto_id;
    private String nameVn;
    private String name_en;
    private boolean is_deleted;
    private String code;
    private String post_office;
    private Date created_at;
    private Date updated_at;
    private String updated_by;

    public Date getCreated_at() {
        return this.created_at;
    }

    public String getNameVn() {
        return this.nameVn;
    }

    public void setNameVn(String nameVn) {
        this.nameVn = nameVn;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return this.updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getUpdated_by() {
        return this.updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }

    public Long getAuto_id() {
        return this.auto_id;
    }

    public void setAuto_id(Long auto_id) {
        this.auto_id = auto_id;
    }

    public String getName_en() {
        return this.name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public boolean isIs_deleted() {
        return this.is_deleted;
    }

    public boolean getIs_deleted() {
        return this.is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPost_office() {
        return this.post_office;
    }

    public void setPost_office(String post_office) {
        this.post_office = post_office;
    }

}
