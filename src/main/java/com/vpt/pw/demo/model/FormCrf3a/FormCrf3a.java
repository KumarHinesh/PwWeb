package com.vpt.pw.demo.model.FormCrf3a;

import com.vpt.pw.demo.model.PregnantWoman;
import com.vpt.pw.demo.model.Studies;
import com.vpt.pw.demo.model.Team;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "FORM_CRF_3A")
public class FormCrf3a {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Column(name = "form_crf_3a_id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "assis_id")
    private PregnantWoman pregnantWoman;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "study_id")
    private Studies studies;

    @Column(name = "pw_crf_3a_2")
    private String q02;

    @Column(name = "pw_crf_3a_3")
    private String q03;

    @Column(name = "pw_crf_3a_4")
    private String q4;

    @Column(name = "pw_crf_3a_14")
    private String q14;

    @Column(name = "pw_crf_3a_15")
    private String q15;

    @Column(name = "pw_crf_3a_16")
    private String q16;

    @Column(name = "pw_crf_3a_17")
    private String q17;

    @Column(name = "pw_crf_3a_18")
    private String q18;

    @Column(name = "pw_crf_3a_19")
    private String q19;

    @Column(name = "pw_crf_3a_20")
    private String q20;

    @Column(name = "pw_crf_3a_21")
    private String q21;

    @Column(name = "pw_crf_3a_22")
    private String q22;

    @Column(name = "pw_crf_3a_23")
    private String q23;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PregnantWoman getPregnantWoman() {
        return pregnantWoman;
    }

    public void setPregnantWoman(PregnantWoman pregnantWoman) {
        this.pregnantWoman = pregnantWoman;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
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

    public String getQ4() {
        return q4;
    }

    public void setQ4(String q4) {
        this.q4 = q4;
    }

    public String getQ14() {
        return q14;
    }

    public void setQ14(String q14) {
        this.q14 = q14;
    }

    public String getQ15() {
        return q15;
    }

    public void setQ15(String q15) {
        this.q15 = q15;
    }

    public String getQ16() {
        return q16;
    }

    public void setQ16(String q16) {
        this.q16 = q16;
    }

    public String getQ17() {
        return q17;
    }

    public void setQ17(String q17) {
        this.q17 = q17;
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

    public String getQ22() {
        return q22;
    }

    public void setQ22(String q22) {
        this.q22 = q22;
    }

    public String getQ23() {
        return q23;
    }

    public void setQ23(String q23) {
        this.q23 = q23;
    }

    public Studies getStudies() {
        return studies;
    }

    public void setStudies(Studies studies) {
        this.studies = studies;
    }
}
