package com.mycompany.hibernatemapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class student {

    @Embedded
    private address address;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ed_id", referencedColumnName = "eid")
    private education education;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "middlename")
    private String middlename;
    @Column(name = "prefix")
    private String prefix;
    @Column(name = "suffix")
    private String suffix;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;

    public student() {

    }

    public student(address address, education education, String firstname, String lastname, String middlename, String prefix, String suffix, String email, String phone) {
        this.address = address;
        this.education = education;
        this.firstname = firstname;
        this.lastname = lastname;
        this.middlename = middlename;
        this.prefix = prefix;
        this.suffix = suffix;
        this.email = email;
        this.phone = phone;
    }

    public education getEducation() {
        return education;
    }

    public void setEducation(education education) {
        this.education = education;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sid")
    private int sid;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public address getAddress() {
        return address;
    }

    public void setAddress(address address) {
        this.address = address;
    }

}
