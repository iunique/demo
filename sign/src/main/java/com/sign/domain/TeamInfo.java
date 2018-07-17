package com.sign.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "team_info")
public class TeamInfo {
    @NotBlank
    private String team_name;
    @NotBlank
    private String leader_name;
    private String fel1;
    private String fel2;
    @Id
    @NotBlank
    private String tel;
    @NotBlank
    private String school;

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getLeader_name() {
        return leader_name;
    }

    public void setLeader_name(String leader_name) {
        this.leader_name = leader_name;
    }

    public String getFel1() {
        return fel1;
    }

    public void setFel1(String fel1) {
        this.fel1 = fel1;
    }

    public String getFel2() {
        return fel2;
    }

    public void setFel2(String fel2) {
        this.fel2 = fel2;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
