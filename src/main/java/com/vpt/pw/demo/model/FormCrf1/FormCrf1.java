package com.vpt.pw.demo.model.FormCrf1;

import com.vpt.pw.demo.model.PregnantWoman;
import com.vpt.pw.demo.model.Team;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Table(name = "FORM_CRF_1")
@Entity
public class FormCrf1 {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )

    @Column(name = "form_crf_1_id")
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pw_assis_id")
    private PregnantWoman pregnantWoman;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "team_id")
    private Team team;

    /*@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "form")
    private List<UltrasoundExamination> ultrasoundExaminations;
*/

    @Column(name = "pw_crf1_02")
    private String q02;

    @Column(name = "pw_crf1_03")
    private String q03;

    @Column(name = "pw_crf1_17")
    private String q17;

    @Column(name = "pw_crf1_18")
    private String q18;

    @Column(name = "pw_crf1_19")
    private String q19;

    @Column(name = "refused_reason")
    private String refusedReason;

    @Column(name = "pw_crf1_38")
    private String q38;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getQ38() {
        return q38;
    }

    public void setQ38(String q38) {
        this.q38 = q38;
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

    public String getRefusedReason() {
        return refusedReason;
    }

    public void setRefusedReason(String refusedReason) {
        this.refusedReason = refusedReason;
    }
}


