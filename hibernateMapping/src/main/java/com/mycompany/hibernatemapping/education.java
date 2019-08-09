package com.mycompany.hibernatemapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "education")
public class education {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "eid")
    private int eid;
    @Column(name = "degreetype")
    private String degreetype;
    @Column(name = "degreedes")
    private String degreedes;
    @Column(name = "graduationyear")
    private int graduationyear;
    @Column(name = "school")
    private String school;
    @OneToOne(mappedBy = "education")
    private student student;

    public education() {
    }

    public education(String degreetype, String degreedes, int graduationyear, String school) {
        this.degreetype = degreetype;
        this.degreedes = degreedes;
        this.graduationyear = graduationyear;
        this.school = school;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getDegreetype() {
        return degreetype;
    }

    public void setDegreetype(String degreetype) {
        this.degreetype = degreetype;
    }

    public String getDegreedes() {
        return degreedes;
    }

    public void setDegreedes(String degreedes) {
        this.degreedes = degreedes;
    }

    public int getGraduationyear() {
        return graduationyear;
    }

    public void setGraduationyear(int graduationyear) {
        this.graduationyear = graduationyear;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public student getStudent() {
        return student;
    }

    public void setStudent(student student) {
        this.student = student;
    }

}
