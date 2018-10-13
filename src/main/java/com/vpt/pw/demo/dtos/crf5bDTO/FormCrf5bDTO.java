package com.vpt.pw.demo.dtos.crf5bDTO;


import com.vpt.pw.demo.dtos.PregnantWomanDTO;
import com.vpt.pw.demo.dtos.StudiesDTO;
import com.vpt.pw.demo.model.Team;

import java.util.List;

public class FormCrf5bDTO {
    private Integer id;
    private Team team;
    private StudiesDTO studiesDTO;
    private Integer followupNumber = -1;
    private PregnantWomanDTO pregnantWoman;
    private String q02;
    private String q03;
    private String refusedReason;
    private String q18;
    private String q19;
    private String q20;
    private String q21;
    private String q46;
    private String q47;
    private String q48;
    private String q49;
    private String q50;
    private String q51;
    private String q52;
    private String q53;
    private String q54;
    private String q55;
    private String q56;

    private List<FormCrf5bDetailsDTO> details;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public StudiesDTO getStudiesDTO() {
        return studiesDTO;
    }

    public void setStudiesDTO(StudiesDTO studiesDTO) {
        this.studiesDTO = studiesDTO;
    }

    public Integer getFollowupNumber() {
        return followupNumber;
    }

    public void setFollowupNumber(Integer followupNumber) {
        this.followupNumber = followupNumber;
    }

    public PregnantWomanDTO getPregnantWoman() {
        return pregnantWoman;
    }

    public void setPregnantWoman(PregnantWomanDTO pregnantWoman) {
        this.pregnantWoman = pregnantWoman;
    }

    public String getQ02() {
        return q02;
    }

    public void setQ02(String q02) {
        this.q02 = q02;
    }

    public String getQ03() {
        return q03;
    }

    public void setQ03(String q03) {
        this.q03 = q03;
    }

    public String getRefusedReason() {
        return refusedReason;
    }

    public void setRefusedReason(String refusedReason) {
        this.refusedReason = refusedReason;
    }

    public String getQ18() {
        return q18;
    }

    public void setQ18(String q18) {
        this.q18 = q18;
    }

    public String getQ19() {
        return q19;
    }

    public void setQ19(String q19) {
        this.q19 = q19;
    }

    public String getQ20() {
        return q20;
    }

    public void setQ20(String q20) {
        this.q20 = q20;
    }

    public String getQ21() {
        return q21;
    }

    public void setQ21(String q21) {
        this.q21 = q21;
    }

    public String getQ46() {
        return q46;
    }

    public void setQ46(String q46) {
        this.q46 = q46;
    }

    public String getQ47() {
        return q47;
    }

    public void setQ47(String q47) {
        this.q47 = q47;
    }

    public String getQ48() {
        return q48;
    }

    public void setQ48(String q48) {
        this.q48 = q48;
    }

    public String getQ49() {
        return q49;
    }

    public void setQ49(String q49) {
        this.q49 = q49;
    }

    public String getQ50() {
        return q50;
    }

    public void setQ50(String q50) {
        this.q50 = q50;
    }

    public String getQ51() {
        return q51;
    }

    public void setQ51(String q51) {
        this.q51 = q51;
    }

    public String getQ52() {
        return q52;
    }

    public void setQ52(String q52) {
        this.q52 = q52;
    }

    public String getQ53() {
        return q53;
    }

    public void setQ53(String q53) {
        this.q53 = q53;
    }

    public String getQ54() {
        return q54;
    }

    public void setQ54(String q54) {
        this.q54 = q54;
    }

    public String getQ55() {
        return q55;
    }

    public void setQ55(String q55) {
        this.q55 = q55;
    }

    public String getQ56() {
        return q56;
    }

    public void setQ56(String q56) {
        this.q56 = q56;
    }

    public List<FormCrf5bDetailsDTO> getDetails() {
        return details;
    }

    public void setDetails(List<FormCrf5bDetailsDTO> details) {
        this.details = details;
    }
}
