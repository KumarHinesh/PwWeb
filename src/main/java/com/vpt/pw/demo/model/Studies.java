package com.vpt.pw.demo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "STUDIES")
public class Studies {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Column(name = "study_id")
    private Integer id;

    @Column(name = "study_code")
    private String studyCode;

/*
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "studies")
    private List<FormCrf3b> formCrf3bList;
*/

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "assis_id")
    private PregnantWoman pregnantWoman;

    public PregnantWoman getPregnantWoman() {
        return pregnantWoman;
    }

    public void setPregnantWoman(PregnantWoman pregnantWoman) {
        this.pregnantWoman = pregnantWoman;
    }

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
}
