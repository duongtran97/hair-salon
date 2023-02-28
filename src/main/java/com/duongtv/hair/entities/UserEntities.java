package com.duongtv.hair.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntities {
    /*
     * Ham khoi tao 
     */
    public UserEntities() {
    }
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long autoId;
    /*
     * fullname of user
     */
    private String fullName;
    /*
     * Date of Birrth
     */
    private Date dateOfBirth;
    private String username;
    private String password;
    private String phone; 
    private int isDeleted;
    private Date updatedAt;
    private Date createdAt;
    private String updatedBy;
    private String hashcode;
    private String email;
    private String codeCity;
    private String codeDistrict;
    private String codeVillage;
    private String codeLand;
    /*
     * True - admin
     * False - user
     */
    private boolean isAdmin;

    public Long getAutoId() {
        return autoId;
    }

    public void setAutoId(Long autoId) {
        this.autoId = autoId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getHashcode() {
        return hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodeCity() {
        return codeCity;
    }

    public void setCodeCity(String codeCity) {
        this.codeCity = codeCity;
    }

    public String getCodeDistrict() {
        return codeDistrict;
    }

    public void setCodeDistrict(String codeDistrict) {
        this.codeDistrict = codeDistrict;
    }

    public String getCodeVillage() {
        return codeVillage;
    }

    public void setCodeVillage(String codeVillage) {
        this.codeVillage = codeVillage;
    }

    public String getCodeLand() {
        return codeLand;
    }

    public void setCodeLand(String codeLand) {
        this.codeLand = codeLand;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "{" +
            " autoId='" + getAutoId() + "'" +
            ", name='" + getFullName() + "'" +
            ", dateOfBirth='" + getDateOfBirth() + "'" +
            "}";
    }

}
