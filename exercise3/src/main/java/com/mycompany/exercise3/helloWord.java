package com.mycompany.exercise3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "\"UserProfile11\"", schema = "public",uniqueConstraints = @UniqueConstraint(columnNames = {"name1", "phone"})
)
public class helloWord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name1")
    private String name1;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;

    public helloWord(String name, String email, String phone) {
        this.name1 = name;
        this.email = email;
        this.phone = phone;
    }

    public helloWord() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
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

    @Override
    public String toString() {
        return "helloWord{" + "id=" + id + ", name=" + name1 + ", email=" + email + ", phone=" + phone + '}';
    }

}
