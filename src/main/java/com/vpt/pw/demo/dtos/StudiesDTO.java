package com.vpt.pw.demo.dtos;

public class StudiesDTO {

    private Integer id;
    private String studyCode;
    private PregnantWomanDTO pregnantWomanDTO;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudyCode() {
        return studyCode;
    }

    public void setStudyCode(String studyCode) {
        this.studyCode = studyCode;
    }

    public PregnantWomanDTO getPregnantWomanDTO() {
        return pregnantWomanDTO;
    }

    public void setPregnantWomanDTO(PregnantWomanDTO pregnantWomanDTO) {
        this.pregnantWomanDTO = pregnantWomanDTO;
    }
}
