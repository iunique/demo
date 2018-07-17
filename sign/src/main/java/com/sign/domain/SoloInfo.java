package com.sign.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Entity
@Table(name = "solo_info")
public class SoloInfo {
    @NotBlank
    private String name;

    @NotBlank
    private String acad;

    @NotBlank
    private String pro;

    @NotBlank
    private String grade;
    @Id
    @NotBlank
    private String tel;
    public SoloInfo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcad() {
        return acad;
    }

    public void setAcad(String acad) {
        this.acad = acad;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
