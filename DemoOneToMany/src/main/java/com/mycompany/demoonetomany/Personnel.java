package com.mycompany.demoonetomany;

import javax.validation.constraints.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

/**
 *
 * @author bhavin
 */
@Entity
@Table(name = "personnel")
public class Personnel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", length = 50)
    @NotNull
    private String name;

    @Column(name = "qualificationlevel")
    @NotNull
    private QualificationLevel qualificationlevel;

    @Column(name = "phone", length = 10)
    @NotNull
    @Min(value = 10)
    @Pattern(regexp = "[9876]{1}[0-9]{9}")
    private String phone;

    public Personnel() {
    }

    public Personnel(String name, QualificationLevel qualificationlevel, String phone) {
        this.name = name;
        this.qualificationlevel = qualificationlevel;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QualificationLevel getQualificationlevel() {
        return qualificationlevel;
    }

    public void setQualificationlevel(QualificationLevel qualificationlevel) {
        this.qualificationlevel = qualificationlevel;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
