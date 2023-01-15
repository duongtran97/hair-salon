package com.duongtv.hair.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntities {
    /*
     * 
     */
    public UserEntities() {
    }
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long autoId;
    private String name;
    private Date dateOfBirh;

    public Long getAutoId() {
        return this.autoId;
    }

    public void setAutoId(Long autoId) {
        this.autoId = autoId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirh() {
        return this.dateOfBirh;
    }

   

    public void setDateOfBirh(Date dateOfBirh) {
        this.dateOfBirh = dateOfBirh;
    }

    @Override
    public String toString() {
        return "{" +
            " autoId='" + getAutoId() + "'" +
            ", name='" + getName() + "'" +
            ", dateOfBirh='" + getDateOfBirh() + "'" +
            "}";
    }

}
