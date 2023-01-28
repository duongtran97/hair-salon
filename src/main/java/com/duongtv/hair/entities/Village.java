package com.duongtv.hair.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Village {

    public Village() {

    }
    @Id
    private Long auto_id;
    private String code_city;
    private String code_district;
    private String name_vn;
    private String name_en;
    private boolean is_deleted;
    private Date created_at;
    private Date updated_at;
    private String updated_by;

    public Long getAuto_id() {
        return this.auto_id;
    }

    public void setAuto_id(Long auto_id) {
        this.auto_id = auto_id;
    }

    public String getCode_city() {
        return this.code_city;
    }

    public void setCode_city(String code_city) {
        this.code_city = code_city;
    }

    public String getCode_district() {
        return this.code_district;
    }

    public void setCode_district(String code_district) {
        this.code_district = code_district;
    }

    public String getName_vn() {
        return this.name_vn;
    }

    public void setName_vn(String name_vn) {
        this.name_vn = name_vn;
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

    public Date getCreated_at() {
        return this.created_at;
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

}
