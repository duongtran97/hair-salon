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

    public UserEntities(String fullname, Date dateOfBirth, String username, String password, String phone, int is_deleted, Date updated_at, Date created_at, String updated_by, String hashcode, String email, String address, boolean is_admin) {
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.is_deleted = is_deleted;
        this.updated_at = updated_at;
        this.created_at = created_at;
        this.updated_by = updated_by;
        this.hashcode = hashcode;
        this.email = email;
        this.address = address;
        this.is_admin = is_admin;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long autoId;
    /*
     * fullname of user
     */
    private String fullname;
    /*
     * Date of Birrth
     */
    private Date dateOfBirth;
    private String username;
    private String password;
    private String phone; 
    private int is_deleted;
    private Date updated_at;
    private Date created_at;
    private String updated_by;
    private String hashcode;
    private String email;
    private String address;
    /*
     * True - admin
     * False - user
     */
    private boolean is_admin;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIs_admin() {
        return this.is_admin;
    }

    public boolean getIs_admin() {
        return this.is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHashcode() {
        return this.hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode;
    }


    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getIs_deleted() {
        return this.is_deleted;
    }

    public void setIs_deleted(int is_deleted) {
        this.is_deleted = is_deleted;
    }

    public Date getUpdated_at() {
        return this.updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_by() {
        return this.updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }
    
    public Long getAutoId() {
        return this.autoId;
    }

    public void setAutoId(Long autoId) {
        this.autoId = autoId;
    }

    public Date getdateOfBirth() {
        return this.dateOfBirth;
    }

   

    public void setdateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "{" +
            " autoId='" + getAutoId() + "'" +
            ", name='" + getFullname() + "'" +
            ", dateOfBirth='" + getdateOfBirth() + "'" +
            "}";
    }

}
