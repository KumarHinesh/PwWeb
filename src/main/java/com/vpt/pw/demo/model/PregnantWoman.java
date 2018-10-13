package com.vpt.pw.demo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "PREGNANT_WOMAN")
public class PregnantWoman {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Column(name = "pw_id", nullable = false)
    private Integer id = 0;

    @Column(name = "pw_crf_1_09")
    private String name; //lw_crf_1_09

    @Column(name = "pw_crf_1_10")
    private String husbandName; //lw_crf_1_10

    @Column(name = "pw_crf_1_11")
    private String site; //lw_crf_1_11

    @Column(name = "pw_crf_1_12")
    private String para; //lw_crf_1_12

    @Column(name = "pw_crf_1_13")
    private String block; //lw_crf_1_13

    @Column(name = "pw_crf_1_14")
    private String structure; //lw_crf_1_14

    @Column(name = "pw_crf_1_15")
    private String householdOrFamily; //lw_crf_1_15

    @Column(name = "pw_crf_1_16")
    private Integer womanNumber;//lw_crf_1_16

    @Column(name = "assis_id", length = 25)
    private String assessmentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHusbandName() {
        return husbandName;
    }

    public void setHusbandName(String husbandName) {
        this.husbandName = husbandName;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getHouseholdOrFamily() {
        return householdOrFamily;
    }

    public void setHouseholdOrFamily(String householdOrFamily) {
        this.householdOrFamily = householdOrFamily;
    }

    public Integer getWomanNumber() {
        return womanNumber;
    }

    public void setWomanNumber(Integer womanNumber) {
        this.womanNumber = womanNumber;
    }

    public String getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }


//  @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy = "dssAddress")
    //  private List<PregnantWoman> pregnantWomen;

}
